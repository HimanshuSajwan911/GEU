package hStegnography;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Himanshu Sajwan.
 */
public class ImageFilter {

    /**
     *
     * @param extension of file
     * @return true if extension is PNG or BMP or JPG or JPEG else false.
     */
    public static boolean isImageFile(String extension) {
        extension = extension.toLowerCase();
        return (extension.equalsIgnoreCase("jpg")
                || extension.equalsIgnoreCase("jpeg")
                || extension.equalsIgnoreCase("png")
                || extension.equalsIgnoreCase("bmp"));
    }

    /**
     *
     * @param chooser JFileChooser type.
     * @param open true for opening image file and false for saving image file.
     */
    public static void setImageFileExtension(JFileChooser chooser, boolean open) {
        if (open) {
            chooser.addChoosableFileFilter(new FileNameExtensionFilter("All Supported Image files", "png", "bmp", "jpg", "jpeg"));
            chooser.addChoosableFileFilter(new FileNameExtensionFilter("JPEG/JPG file", "jpg", "jpeg"));
        } else {
            chooser.addChoosableFileFilter(new FileNameExtensionFilter("All Supported Image files", "png", "bmp"));
        }
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("PNG file", "png"));
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("BMP file", "bmp"));
    }

    /**
     *
     * @param file path of file.
     * @return extension ie (String after . ) if exists else empty String.
     */
    public static String getFileExtension(File file) {
        String s = file.getName();
        int i = s.lastIndexOf('.');
        if (i > 0 && i < s.length() - 1) {
            return s.substring(i + 1).toLowerCase();
        }
        return "";
    }

    /**
     *
     * @param chooser JFileChooser type.
     * @return File reference of correct path.
     */
    public static File getProperFilePath(JFileChooser chooser) {
        File file = chooser.getSelectedFile();
        FileNameExtensionFilter fileNameExtensionFilter = (FileNameExtensionFilter) chooser.getFileFilter();
        String selected_extension = fileNameExtensionFilter.getExtensions()[0];

        String ext = ImageFilter.getFileExtension(file);
        if (fileNameExtensionFilter.getExtensions().length == 1
                && (ext.isEmpty()
                || !ImageFilter.isImageFile(ext)
                || !selected_extension.equalsIgnoreCase(ext))) {

            String newName = file.getName() + "." + selected_extension;
            return new File(file.getParent(), newName);
        }
        if (!(ext.equalsIgnoreCase("png") || ext.equalsIgnoreCase("bmp"))) {
            String newName = file.getName() + ".png";
            return new File(file.getParent(), newName);
        }
        return file;
    }

}
