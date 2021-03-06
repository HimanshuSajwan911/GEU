/**
 *
 * @author Himanshu Sajwan.
 */

package hStegnography;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Stego extends javax.swing.JFrame {

    Steganography STEGNOGRAPHY;
    String MESSAGE;
    File IMAGE_SOURCE_FILE;
    int KEY;
    ImageIcon myImage;
    Image IMAGE;
    BufferedImage BIMAGE;
    int Image_Width, Image_Height;

    /**
     * Creates new form ImageStegnography
     */
    public Stego() {
        this.STEGNOGRAPHY = new Steganography();
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        openButton = new javax.swing.JButton();
        DecodeButton = new javax.swing.JButton();
        ScrollPane_TextArea = new javax.swing.JScrollPane();
        MessageTextArea = new javax.swing.JTextArea();
        MessageLabel = new javax.swing.JLabel();
        EncodeButton = new javax.swing.JButton();
        ScrollPane_ImageLabel = new javax.swing.JScrollPane();
        ImageLabel = new javax.swing.JLabel();
        MessageLabel1 = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        Slider = new javax.swing.JSlider();
        zoomInButton = new javax.swing.JButton();
        zoomOutButton = new javax.swing.JButton();
        ImagePathLabel = new javax.swing.JLabel();
        ImageNameLabel = new javax.swing.JLabel();
        backgroundImageLabel = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        Menu_File = new javax.swing.JMenu();
        MenuItem_OpenImage = new javax.swing.JMenuItem();
        MenuItem_Encode = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuItem_Key = new javax.swing.JMenuItem();
        MenuItem_Exit = new javax.swing.JMenuItem();
        Menu_Message = new javax.swing.JMenu();
        MenuItem_Cut = new javax.swing.JMenuItem();
        MenuItem_Copy = new javax.swing.JMenuItem();
        MenuItem_Paste = new javax.swing.JMenuItem();
        MenuItem_OpenTextFile = new javax.swing.JMenuItem();
        MenuItem_SaveTextFile = new javax.swing.JMenuItem();
        Menu_Help = new javax.swing.JMenu();
        MenuItem_HowToUse = new javax.swing.JMenuItem();
        MenuItem_About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stego");
        setMinimumSize(new java.awt.Dimension(800, 620));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 60));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        MainPanel.setMinimumSize(new java.awt.Dimension(800, 620));
        MainPanel.setPreferredSize(new java.awt.Dimension(800, 620));
        MainPanel.setLayout(null);

        openButton.setBackground(new java.awt.Color(255, 0, 0));
        openButton.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        openButton.setText("Open");
        openButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });
        MainPanel.add(openButton);
        openButton.setBounds(30, 510, 110, 50);

        DecodeButton.setBackground(new java.awt.Color(0, 175, 235));
        DecodeButton.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        DecodeButton.setText("Decode");
        DecodeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DecodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecodeButtonActionPerformed(evt);
            }
        });
        MainPanel.add(DecodeButton);
        DecodeButton.setBounds(270, 510, 110, 50);

        MessageTextArea.setColumns(20);
        MessageTextArea.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        MessageTextArea.setRows(5);
        ScrollPane_TextArea.setViewportView(MessageTextArea);

        MainPanel.add(ScrollPane_TextArea);
        ScrollPane_TextArea.setBounds(30, 60, 350, 400);

        MessageLabel.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        MessageLabel.setForeground(new java.awt.Color(255, 255, 255));
        MessageLabel.setText("Message");
        MainPanel.add(MessageLabel);
        MessageLabel.setBounds(30, 30, 170, 30);

        EncodeButton.setBackground(new java.awt.Color(0, 255, 0));
        EncodeButton.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        EncodeButton.setText("Encode");
        EncodeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EncodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncodeButtonActionPerformed(evt);
            }
        });
        MainPanel.add(EncodeButton);
        EncodeButton.setBounds(150, 510, 110, 50);

        ImageLabel.setOpaque(true);
        ScrollPane_ImageLabel.setViewportView(ImageLabel);

        MainPanel.add(ScrollPane_ImageLabel);
        ScrollPane_ImageLabel.setBounds(420, 60, 350, 400);

        MessageLabel1.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        MessageLabel1.setForeground(new java.awt.Color(255, 255, 255));
        MessageLabel1.setText("Image");
        MainPanel.add(MessageLabel1);
        MessageLabel1.setBounds(420, 30, 170, 30);

        Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Separator.setToolTipText("");
        Separator.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        MainPanel.add(Separator);
        Separator.setBounds(400, 0, 10, 600);

        Slider.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        Slider.setMajorTickSpacing(10);
        Slider.setPaintLabels(true);
        Slider.setPaintTicks(true);
        Slider.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));
        Slider.setEnabled(false);
        Slider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                SliderMouseDragged(evt);
            }
        });
        Slider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SliderMouseClicked(evt);
            }
        });
        Slider.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SliderKeyPressed(evt);
            }
        });
        MainPanel.add(Slider);
        Slider.setBounds(440, 470, 310, 40);

        zoomInButton.setFont(new java.awt.Font("Consolas", 0, 25)); // NOI18N
        zoomInButton.setText("+");
        zoomInButton.setBorder(null);
        zoomInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zoomInButton.setEnabled(false);
        zoomInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomInButtonActionPerformed(evt);
            }
        });
        MainPanel.add(zoomInButton);
        zoomInButton.setBounds(750, 470, 20, 20);

        zoomOutButton.setFont(new java.awt.Font("Consolas", 0, 25)); // NOI18N
        zoomOutButton.setText("-");
        zoomOutButton.setBorder(null);
        zoomOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zoomOutButton.setEnabled(false);
        zoomOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomOutButtonActionPerformed(evt);
            }
        });
        MainPanel.add(zoomOutButton);
        zoomOutButton.setBounds(420, 470, 20, 20);

        ImagePathLabel.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        ImagePathLabel.setToolTipText("");
        MainPanel.add(ImagePathLabel);
        ImagePathLabel.setBounds(420, 520, 350, 30);

        ImageNameLabel.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        MainPanel.add(ImageNameLabel);
        ImageNameLabel.setBounds(420, 550, 350, 30);

        backgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hStegnography/image/Stego_Background_Image.jpg"))); // NOI18N
        MainPanel.add(backgroundImageLabel);
        backgroundImageLabel.setBounds(0, 0, 800, 600);

        MenuBar.setPreferredSize(new java.awt.Dimension(800, 20));

        Menu_File.setText("File");

        MenuItem_OpenImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_OpenImage.setText("Open Image");
        MenuItem_OpenImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_OpenImageActionPerformed(evt);
            }
        });
        Menu_File.add(MenuItem_OpenImage);

        MenuItem_Encode.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_Encode.setText("Encode");
        MenuItem_Encode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_EncodeActionPerformed(evt);
            }
        });
        Menu_File.add(MenuItem_Encode);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Decode");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Menu_File.add(jMenuItem1);

        MenuItem_Key.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_Key.setText("Key");
        MenuItem_Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_KeyActionPerformed(evt);
            }
        });
        Menu_File.add(MenuItem_Key);

        MenuItem_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_Exit.setText("Exit");
        MenuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ExitActionPerformed(evt);
            }
        });
        Menu_File.add(MenuItem_Exit);

        MenuBar.add(Menu_File);

        Menu_Message.setText("Message");

        MenuItem_Cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_Cut.setText("Cut");
        MenuItem_Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_CutActionPerformed(evt);
            }
        });
        Menu_Message.add(MenuItem_Cut);

        MenuItem_Copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_Copy.setText("Copy");
        MenuItem_Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_CopyActionPerformed(evt);
            }
        });
        Menu_Message.add(MenuItem_Copy);

        MenuItem_Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_Paste.setText("Paste");
        MenuItem_Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_PasteActionPerformed(evt);
            }
        });
        Menu_Message.add(MenuItem_Paste);

        MenuItem_OpenTextFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_OpenTextFile.setText("Open as Text File");
        MenuItem_OpenTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_OpenTextFileActionPerformed(evt);
            }
        });
        Menu_Message.add(MenuItem_OpenTextFile);

        MenuItem_SaveTextFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_SaveTextFile.setText("Save as Text File");
        MenuItem_SaveTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_SaveTextFileActionPerformed(evt);
            }
        });
        Menu_Message.add(MenuItem_SaveTextFile);

        MenuBar.add(Menu_Message);

        Menu_Help.setText("Help");

        MenuItem_HowToUse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_HowToUse.setText("How to Use");
        MenuItem_HowToUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_HowToUseActionPerformed(evt);
            }
        });
        Menu_Help.add(MenuItem_HowToUse);

        MenuItem_About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenuItem_About.setText("About");
        MenuItem_About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_AboutActionPerformed(evt);
            }
        });
        Menu_Help.add(MenuItem_About);

        MenuBar.add(Menu_Help);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(816, 658));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void setIcon() {
        setIconImage(new ImageIcon(getClass().getResource("/hStegnography/image/Stego_Icon.PNG")).getImage());
    }

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed

        openImageFile();

    }//GEN-LAST:event_openButtonActionPerformed

    private void loadMessageFromFile() {
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setDialogTitle("Open Text File");
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Documents (*.txt)", "txt"));
        chooser.setAcceptAllFileFilterUsed(false);

        int selection = chooser.showOpenDialog(null);
        if (selection == 0) {
            File file = chooser.getSelectedFile();
            try {
                FileInputStream fin = new FileInputStream(file);
                if (file.isFile()) {
                    StringBuilder s = new StringBuilder();
                    while (fin.available() != 0) {
                        s.append((char) fin.read());
                    }
                    MessageTextArea.setText(s.toString());
                    fin.close();
                } else {
                    JOptionPane.showMessageDialog(this, "Not a File!", "ERROR!!", JOptionPane.ERROR_MESSAGE);
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void saveMessageToFile() {

        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setDialogTitle("Save Text File");
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Documents (*.txt)", "txt"));
        chooser.setAcceptAllFileFilterUsed(false);

        boolean yes = true;
        int selection = chooser.showSaveDialog(null);
        if (selection == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String fileURL = file.toString();
            if (!fileURL.endsWith(".txt")) {
                String newName = file.getName() + ".txt";
                file = new File(file.getParent(), newName);
            }
            if (file.exists()) {
                int choice = JOptionPane.showConfirmDialog(null, (file.getName()) + " already exists. \nDo you want to replace it??", "Confirm Save??", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                    yes = false;
                }
            }
            if (yes) {
                try {
                    FileOutputStream fout = new FileOutputStream(file);
                    if (file.isFile()) {
                        MESSAGE = MessageTextArea.getText().replaceAll("\n", System.lineSeparator());
                        fout.write(MESSAGE.getBytes());
                        fout.close();
                        JOptionPane.showMessageDialog(null, "File Successfully Saved!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Not a File!", "ERROR!!", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void reset() {
        IMAGE_SOURCE_FILE = null;
        MESSAGE = null;
        KEY = 0;
        ImageLabel.setIcon(null);
        MessageTextArea.setText(null);
        Slider.setEnabled(false);
        ImagePathLabel.setText(null);
        ImageNameLabel.setText(null);
        zoomInButton.setEnabled(false);
        zoomOutButton.setEnabled(false);
    }

    private void readKey() {
        String returnVal;
        do {
            returnVal = JOptionPane.showInputDialog(null, "Input Key", "KEY", JOptionPane.QUESTION_MESSAGE);
            if (returnVal == null) {
                break;
            } else {
                if (!returnVal.isEmpty() && returnVal.matches("^[0-9]*")) {
                    try {
                        int key = Integer.parseInt(returnVal);
                        if (key == 0) {
                            JOptionPane.showMessageDialog(null, "Key cannot be zero!", "Invalid Key!", JOptionPane.WARNING_MESSAGE);
                        } else {
                            KEY = key;
                            break;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Input a key from 1 to " + Integer.MAX_VALUE + " only.", "Input Valid Key", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Input a key from 1 to " + Integer.MAX_VALUE + " only.", "Input Valid Key", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        } while (true);
    }

    private void readMessage() {
        MESSAGE = MessageTextArea.getText();
        if (MESSAGE.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Write some message!", "Message.", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void openImageFile() {
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setDialogTitle("Open Image File.");
        ImageFilter.setImageFileExtension(chooser, true);
        chooser.setAcceptAllFileFilterUsed(false);

        int selection = chooser.showOpenDialog(null);

        if (selection == JFileChooser.APPROVE_OPTION) {
            try {
                IMAGE_SOURCE_FILE = chooser.getSelectedFile();
                if (IMAGE_SOURCE_FILE.exists()) {
                    ImagePathLabel.setToolTipText(IMAGE_SOURCE_FILE.getAbsolutePath());
                    ImagePathLabel.setText("Path: " + IMAGE_SOURCE_FILE.getAbsolutePath());
                    ImageNameLabel.setText("Name: " + IMAGE_SOURCE_FILE.getName());
                    IMAGE = ImageIO.read(IMAGE_SOURCE_FILE);
                    ImageLabel.setIcon(new ImageIcon(IMAGE));
                    Image_Width = IMAGE.getWidth(null);
                    Image_Height = IMAGE.getHeight(null);

                    Slider.setEnabled(true);
                    zoomInButton.setEnabled(true);
                    zoomOutButton.setEnabled(true);
                } else {
                    IMAGE_SOURCE_FILE = null;
                    JOptionPane.showMessageDialog(null, "File does not exists!", "ERROR!!", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void encode_saveImage() {

        if (IMAGE_SOURCE_FILE == null) {
            openImageFile();
        }

        if (IMAGE_SOURCE_FILE != null) {
            readMessage();
        }

        if (MESSAGE != null && !MESSAGE.isEmpty() && KEY == 0) {
            readKey();
        }

        if (KEY != 0) {
            JFileChooser chooser = new JFileChooser(".");
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            chooser.setDialogTitle("Save Image File");
            ImageFilter.setImageFileExtension(chooser, false);
            chooser.setAcceptAllFileFilterUsed(false);

            int option = chooser.showSaveDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {

                File IMAGE_DESTINATION_FILE = ImageFilter.getProperFilePath(chooser);

                String Destination_Name = IMAGE_DESTINATION_FILE.getName();
                Destination_Name = Destination_Name.substring(0, Destination_Name.lastIndexOf("."));
                String Destination_Path = IMAGE_DESTINATION_FILE.getAbsolutePath();
                String Destination_URL = Destination_Path.substring(0, Destination_Path.lastIndexOf("\\"));
                String Extension = ImageFilter.getFileExtension(IMAGE_DESTINATION_FILE);

                try {
                    int result = STEGNOGRAPHY.encode(IMAGE_SOURCE_FILE.getAbsolutePath(), Destination_URL, Destination_Name, Extension, MESSAGE, KEY);
                    if (result == Steganography.SUCCESSFUL) {
                        JOptionPane.showMessageDialog(null, "The Image was encoded Successfully!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                        reset();
                    } else if (result == Steganography.UNSUCCESSFUL) {
                        JOptionPane.showMessageDialog(null, "The Image could not be encoded!", "ERROR!!", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (IOException | IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, ex, "ERROR!!", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }

    private void decodeImage() {

        if (IMAGE_SOURCE_FILE == null) {
            openImageFile();
        }
        if (IMAGE_SOURCE_FILE != null) {
            readKey();
        }
        if (KEY != 0) {
            try {
                MessageTextArea.setText(null);
                String message = STEGNOGRAPHY.decode(IMAGE_SOURCE_FILE.getAbsolutePath(), KEY);
                JOptionPane.showMessageDialog(null, "Message Successfully decoded!", "Message.", JOptionPane.INFORMATION_MESSAGE);
                MessageTextArea.setText(message);
            } catch (InvalidKeyException | IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
            } finally {
                KEY = 0;
            }
        }
    }

    private void EncodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncodeButtonActionPerformed

        encode_saveImage();

    }//GEN-LAST:event_EncodeButtonActionPerformed

    private void MenuItem_OpenImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_OpenImageActionPerformed

        openImageFile();

    }//GEN-LAST:event_MenuItem_OpenImageActionPerformed

    private void MenuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ExitActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Sure to exit??", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_MenuItem_ExitActionPerformed

    private void MenuItem_CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_CutActionPerformed

        MessageTextArea.cut();

    }//GEN-LAST:event_MenuItem_CutActionPerformed

    private void MenuItem_CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_CopyActionPerformed

        MessageTextArea.copy();

    }//GEN-LAST:event_MenuItem_CopyActionPerformed

    private void MenuItem_PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_PasteActionPerformed

        MessageTextArea.paste();

    }//GEN-LAST:event_MenuItem_PasteActionPerformed

    private void MenuItem_OpenTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_OpenTextFileActionPerformed

        loadMessageFromFile();

    }//GEN-LAST:event_MenuItem_OpenTextFileActionPerformed

    private void MenuItem_SaveTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_SaveTextFileActionPerformed

        saveMessageToFile();

    }//GEN-LAST:event_MenuItem_SaveTextFileActionPerformed

    private void MenuItem_KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_KeyActionPerformed

        readKey();

    }//GEN-LAST:event_MenuItem_KeyActionPerformed

    private void DecodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecodeButtonActionPerformed

        decodeImage();

    }//GEN-LAST:event_DecodeButtonActionPerformed

    private void MenuItem_EncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_EncodeActionPerformed

        encode_saveImage();

    }//GEN-LAST:event_MenuItem_EncodeActionPerformed

    private void SliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SliderMouseDragged

        if (Slider.isEnabled()) {
            setZoomImage();
        }

    }//GEN-LAST:event_SliderMouseDragged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        decodeImage();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void zoomInSlider() {
        Slider.setValue(Slider.getValue() + 1);
        setZoomImage();
    }

    private void zoomOutSlider() {
        Slider.setValue(Slider.getValue() - 1);
        setZoomImage();
    }

    private void zoomOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomOutButtonActionPerformed

        zoomOutSlider();

    }//GEN-LAST:event_zoomOutButtonActionPerformed

    private void zoomInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomInButtonActionPerformed

        zoomInSlider();

    }//GEN-LAST:event_zoomInButtonActionPerformed

    private void SliderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SliderKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_DOWN) {
            zoomOutSlider();
        } else if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_UP) {
            zoomInSlider();
        }

    }//GEN-LAST:event_SliderKeyPressed

    private void SliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SliderMouseClicked

         if (Slider.isEnabled()) {
            setZoomImage();
        }
        
    }//GEN-LAST:event_SliderMouseClicked

    private void MenuItem_AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AboutActionPerformed

       new About().setVisible(true);
        
    }//GEN-LAST:event_MenuItem_AboutActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       openButton.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void MenuItem_HowToUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_HowToUseActionPerformed
        
        new HowToUse().setVisible(true);
        
    }//GEN-LAST:event_MenuItem_HowToUseActionPerformed

    private void setZoomImage() {
        int value = Slider.getValue();
        int newHeigth = Image_Height * value / 50;
        int newWidth = Image_Width * value / 50;

        if (newHeigth * newWidth > 0) {
            ImageLabel.setIcon(new ImageIcon(zoomImage(newWidth, newHeigth, IMAGE)));
        }
    }

    private Image zoomImage(int width, int height, Image image) {
        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D grf = newImage.createGraphics();
        //grf.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        grf.drawImage(image, 0, 0, width, height, null);
        grf.dispose();
        return newImage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DecodeButton;
    private javax.swing.JButton EncodeButton;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel ImageNameLabel;
    private javax.swing.JLabel ImagePathLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MenuItem_About;
    private javax.swing.JMenuItem MenuItem_Copy;
    private javax.swing.JMenuItem MenuItem_Cut;
    private javax.swing.JMenuItem MenuItem_Encode;
    private javax.swing.JMenuItem MenuItem_Exit;
    private javax.swing.JMenuItem MenuItem_HowToUse;
    private javax.swing.JMenuItem MenuItem_Key;
    private javax.swing.JMenuItem MenuItem_OpenImage;
    private javax.swing.JMenuItem MenuItem_OpenTextFile;
    private javax.swing.JMenuItem MenuItem_Paste;
    private javax.swing.JMenuItem MenuItem_SaveTextFile;
    private javax.swing.JMenu Menu_File;
    private javax.swing.JMenu Menu_Help;
    private javax.swing.JMenu Menu_Message;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JLabel MessageLabel1;
    private javax.swing.JTextArea MessageTextArea;
    private javax.swing.JScrollPane ScrollPane_ImageLabel;
    private javax.swing.JScrollPane ScrollPane_TextArea;
    private javax.swing.JSeparator Separator;
    private javax.swing.JSlider Slider;
    private javax.swing.JLabel backgroundImageLabel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton openButton;
    private javax.swing.JButton zoomInButton;
    private javax.swing.JButton zoomOutButton;
    // End of variables declaration//GEN-END:variables
}
