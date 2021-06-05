/**
 *
 * @author Himanshu Sajwan.
 */

package hStegnography;

import javax.swing.ImageIcon;

public class About extends javax.swing.JFrame {

    int posX, posY;

    public About() {
        initComponents();
        setIcon();
    }

    public About(int posx, int posy) {
        posX = posx;
        posY = posy;
        initComponents();
        setLocation();
        setIcon();
    }

    private void setLocation() {
        this.setLocation(posX, posY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        CourseLabel = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        YearLabel = new javax.swing.JLabel();
        AddmissionNoLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        GEULabel = new javax.swing.JLabel();
        MiniProjectLabel = new javax.swing.JLabel();
        ClassRollNoLabel = new javax.swing.JLabel();
        SectionLabel = new javax.swing.JLabel();
        AboutBackgroundImageLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        MainPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        MainPanel.setLayout(null);

        CourseLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        CourseLabel.setText("Course        :- B Tech CSE");
        MainPanel.add(CourseLabel);
        CourseLabel.setBounds(50, 210, 330, 30);

        OKButton.setBackground(new java.awt.Color(102, 102, 0));
        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });
        MainPanel.add(OKButton);
        OKButton.setBounds(340, 360, 47, 23);

        YearLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        YearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YearLabel.setText("2021-2022");
        MainPanel.add(YearLabel);
        YearLabel.setBounds(0, 140, 400, 20);

        AddmissionNoLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        AddmissionNoLabel.setText("Addmission No :- 2014402");
        MainPanel.add(AddmissionNoLabel);
        AddmissionNoLabel.setBounds(50, 240, 330, 30);

        NameLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        NameLabel.setText("Name          :- Himanshu Sajwan");
        MainPanel.add(NameLabel);
        NameLabel.setBounds(50, 180, 330, 30);

        GEULabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        GEULabel.setText("<html>\n<body>\n<p align=center>\nGraphic Era Demeed to be University\n</body>\n</html>");
        MainPanel.add(GEULabel);
        GEULabel.setBounds(70, 50, 260, 50);

        MiniProjectLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        MiniProjectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MiniProjectLabel.setText("Mini Project");
        MainPanel.add(MiniProjectLabel);
        MiniProjectLabel.setBounds(0, 110, 400, 30);

        ClassRollNoLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ClassRollNoLabel.setText("Class Roll No :- 30");
        MainPanel.add(ClassRollNoLabel);
        ClassRollNoLabel.setBounds(50, 300, 330, 30);

        SectionLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        SectionLabel.setText("Section       :- E");
        MainPanel.add(SectionLabel);
        SectionLabel.setBounds(50, 270, 330, 30);

        AboutBackgroundImageLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hStegnography/image/About_Image.jpg"))); // NOI18N
        MainPanel.add(AboutBackgroundImageLable);
        AboutBackgroundImageLable.setBounds(-10, -20, 450, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed

        this.dispose();

    }//GEN-LAST:event_OKButtonActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus

        this.dispose();

    }//GEN-LAST:event_formWindowLostFocus

    private void setIcon() {
        setIconImage(new ImageIcon(getClass().getResource("/hStegnography/image/Stego_Icon.PNG")).getImage());
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutBackgroundImageLable;
    private javax.swing.JLabel AddmissionNoLabel;
    private javax.swing.JLabel ClassRollNoLabel;
    private javax.swing.JLabel CourseLabel;
    private javax.swing.JLabel GEULabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MiniProjectLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel SectionLabel;
    private javax.swing.JLabel YearLabel;
    // End of variables declaration//GEN-END:variables
}
