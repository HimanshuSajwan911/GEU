/**
 *
 * @author Himanshu Sajwan.
 */
package hStegnography;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Steganography {

    private BufferedImage IMAGE;
    private int Current_Position;

    /**
     * Returns value if Image saving was successful after hiding message.
     */
    public static final int SUCCESSFUL = 1;

    /**
     * Returns value if Image saving was unsuccessful after hiding message.
     */
    public static final int UNSUCCESSFUL = 0;

    /**
     * Returns value if Image saving was canceled.
     */
    public static final int CANCELED = -1;

    public Steganography() {
        IMAGE = null;
    }

    public Steganography(String url) throws IOException {
        readImage(url);
    }

    // function to read image from given location and return BufferedImage.
    private BufferedImage readImage(String url) throws IOException {
        return user_space(ImageIO.read(new File(url)));
    }
    
    // function to convert given BufferedImage into pure RGB.
    private BufferedImage user_space(BufferedImage image) {
        BufferedImage user_space_image = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D graphics = user_space_image.createGraphics();
        graphics.drawRenderedImage(image, null);
        graphics.dispose();
        return user_space_image;
    }
    
    // function to write image to given location.
    private int writeImage(String outputLocation, String name, String format) {
        try {
            String FullPath = outputLocation + "\\" + name + "." + format;
            File file_path = new File(FullPath);
            if (file_path.exists()) {
                int choice = JOptionPane.showConfirmDialog(null, (name + "." + format) + " already exists. \nDo you want to replace it??", "Confirm Save??", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                    return CANCELED;
                }
            }

            ImageIO.write(IMAGE, format, file_path);
            return SUCCESSFUL;

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
            return UNSUCCESSFUL;
        }
    }

    // this function return byte array of supplied image.
    private byte[] getImageByte(BufferedImage image) {
        WritableRaster raster = image.getRaster();
        DataBufferByte buffer = (DataBufferByte) raster.getDataBuffer();
        return buffer.getData();
    }

    
    // function to retrieve hidden text message.
    private String getMessage(byte[] image, int key) throws InvalidKeyException {
        int decoded_key = 0;
        int length = 0;
        Current_Position = 0;

        // for extracting key from image.
        for (int i = 0; i < 32; i++, Current_Position++) {
            int data_byte = image[Current_Position];
            decoded_key = (decoded_key << 1) | (data_byte & 1);
        }

        if (decoded_key != key) {
            throw new InvalidKeyException();
        }

        // for extracting Length of message from image.
        for (int i = 0; i < 32; i++, Current_Position++) {
            int data_byte = image[Current_Position];
            length = (length << 1) | (data_byte & 1);
        }

        byte[] message = new byte[length];

        // for extracting  message from image.
        for (int i = 0; i < length; i++) {
            byte retrieved_byte = 0;
            // loop to convert 8 bits int 1 byte.
            for (int bit = 0; bit < 8; bit++, Current_Position++) {
                int data_byte = image[Current_Position];
                retrieved_byte = (byte) ((retrieved_byte << 1) | (data_byte & 1));
            }
            message[i] = retrieved_byte;
        }

        return new String(message);
    }

    // function to convert integer to its byte array.
    private byte[] int_to_byte_converter(int number) {
        byte[] byte_array = new byte[4];

        byte_array[0] = (byte) ((number >>> 24) & 0xFF);
        byte_array[1] = (byte) ((number >>> 16) & 0xFF);
        byte_array[2] = (byte) ((number >>> 8)  & 0xFF);
        byte_array[3] = (byte) ((number)        & 0xFF);
        
        return byte_array;
    }
    
    
    // function to inserts data into image.
    private void addBits(byte[] image, byte[] data) throws IllegalArgumentException {

        if (Current_Position +(data.length * 8) > image.length) {
            throw new IllegalArgumentException("Image is too small!");
        }

        // loop to access all bytes.
        for (int i = 0; i < data.length; i++) {

            byte byte_data = data[i];
            // loop to extract all bits of above byte_data.
            for (int j = 7; j >= 0; j--, Current_Position++) {
                image[Current_Position] = (byte) ((image[Current_Position] & 0xFE) | ((byte_data >>> j) & 1));
            }

        }
    }

    // function to insert key, message length and message to image.
    private void hideMessage(String Message, int key) throws IllegalArgumentException {
        byte[] image = getImageByte(IMAGE);

        byte[] key_byte = int_to_byte_converter(key);

        byte[] message = Message.getBytes();
        byte message_length[] = int_to_byte_converter(message.length);

        Current_Position = 0;
        
        // for adding key.
        addBits(image, key_byte);
        // for adding message length.
        addBits(image, message_length);
        // for adding message.
        addBits(image, message);

    }

    /**
     * Encodes given Key and Message in given Image.
     * 
     * @param Source_Full_URL complete URL of image to encode.
     * @param Destination_URL destination URL of image to be saved.
     * @param Destination_File_Name name of image to be saved.
     * @param Extension extension of image to be saved.
     * @param Message message to be hidden in image.
     * @param Key key to excess hidden Message.
     * @return SUCCESSFUL or UNSUCCESSFUL or CANCELED.
     * @throws IOException
     * @throws IllegalArgumentException
     * @see Steganography#SUCCESSFUL
     * @see Steganography#UNSUCCESSFUL
     * @see Steganography#CANCELED
     */
    public int encode(String Source_Full_URL, String Destination_URL, String Destination_File_Name, String Extension, String Message, int Key) throws IOException, IllegalArgumentException {
        IMAGE = readImage(Source_Full_URL);
        hideMessage(Message, Key);
        return writeImage(Destination_URL, Destination_File_Name, Extension);
    }

    /**
     * Decodes given image with given Key and returns hidden Message.
     *
     * @param Source_Full_URL complete URL of image to decode.
     * @param Key key to excess hidden message.
     * @return (String) Hidden Message.
     * @throws IOException
     * @throws InvalidKeyException
     */
    public String decode(String Source_Full_URL, int Key) throws IOException, InvalidKeyException {
        IMAGE = readImage(Source_Full_URL);
        byte[] image = getImageByte(IMAGE);
        return (getMessage(image, Key));
    }

}
