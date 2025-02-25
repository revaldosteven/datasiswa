/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datasiswav;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.nio.InvalidMarkException;
import java.nio.file.Files;
import java.nio.file.ProviderNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Good_Poeple
 */
public class app extends javax.swing.JFrame {

    public app() {
        initComponents();
        reset();
        
        tNis.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        
        tNama.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && c != ' ') {
                    e.consume();
                }
            }
        });
        
        tTempatLahir.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && c != ' ') {
                    e.consume();
                }
            }
        });
      
    } 
    void reset (){
        tNis.setText("");
        tNama.setText("");
        tTempatLahir.setText("");
        tAlamat.setText("");
        vNis.setText("");
        
        vNama.setText("");
        vAlamat.setText("");
        vNis.setText("");
        vKelamin.setText("");
        vTTL.setText("");
        vFoto.setText("");
        vJurusan.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kelamin = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        vNis = new javax.swing.JLabel();
        vNama = new javax.swing.JLabel();
        vKelamin = new javax.swing.JLabel();
        vTTL = new javax.swing.JLabel();
        vJurusan = new javax.swing.JLabel();
        vAlamat = new javax.swing.JLabel();
        vFoto = new javax.swing.JLabel();
        bReset = new javax.swing.JButton();
        bSimpan = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tNis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rL = new javax.swing.JRadioButton();
        rP = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tTempatLahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        tJurusan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlamat = new javax.swing.JTextArea();
        pFoto = new javax.swing.JLabel();
        tFoto = new javax.swing.JLabel();
        tTanggalLahir = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA SISWA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 51));

        vNis.setText("jLabel10");

        vNama.setText("jLabel11");

        vKelamin.setText("jLabel12");

        vTTL.setText("jLabel13");

        vJurusan.setText("jLabel14");

        vAlamat.setText("jLabel15");

        vFoto.setText("jLabel16");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vFoto)
                    .addComponent(vAlamat)
                    .addComponent(vJurusan)
                    .addComponent(vTTL)
                    .addComponent(vKelamin)
                    .addComponent(vNama)
                    .addComponent(vNis))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(vNis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vKelamin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vTTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vJurusan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vFoto)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        bReset.setBackground(new java.awt.Color(255, 0, 0));
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bSimpan.setBackground(new java.awt.Color(0, 0, 255));
        bSimpan.setText("SIMPAN");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel2.setText("NIS");

        jLabel3.setText("NAMA");

        jLabel4.setText("JENIS KELAMIN");

        Kelamin.add(rL);
        rL.setText("LAKI LAKI");
        rL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLActionPerformed(evt);
            }
        });

        Kelamin.add(rP);
        rP.setText("PEREMPUAN");
        rP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPActionPerformed(evt);
            }
        });

        jLabel5.setText("TEMPAT LAHIR");

        tTempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTempatLahirActionPerformed(evt);
            }
        });

        jLabel6.setText("TANGGAL LAHIR");

        jlabel.setText("JURUSAN");

        tJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPA", "IPS", "BAHASA" }));

        jLabel8.setText("ALAMAT");

        tAlamat.setColumns(20);
        tAlamat.setRows(5);
        jScrollPane1.setViewportView(tAlamat);

        pFoto.setBackground(new java.awt.Color(255, 255, 255));
        pFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pFoto.setText("FOTO");
        pFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pFoto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pFotoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        pFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFotoMouseClicked(evt);
            }
        });

        tFoto.setBackground(new java.awt.Color(255, 255, 51));
        tFoto.setForeground(new java.awt.Color(255, 255, 51));
        tFoto.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jlabel)
                            .addComponent(jLabel8))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tFoto)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(tTempatLahir))
                            .addComponent(rL)
                            .addComponent(tJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rP)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNis, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(pFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(pFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rL)
                            .addComponent(rP))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel))))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFoto))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bReset)
                .addGap(26, 26, 26)
                .addComponent(bSimpan)
                .addGap(51, 51, 51))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(bSimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFotoMouseClicked
        // TODO add your handling code here:
        try {
             JFileChooser chooser = new JFileChooser();
             chooser.showOpenDialog(null);
              File file = chooser.getSelectedFile();
             ImageIcon icon = new ImageIcon(file.toString());
             Image image = icon.getImage().getScaledInstance(pFoto.getWidth(),pFoto.getHeight(),Image.SCALE_SMOOTH);
             ImageIcon ic = new ImageIcon(image);
             pFoto.setText("");
             pFoto.setIcon(ic);
             String filename = file.getAbsolutePath();
             tFoto.setText(filename);
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Upload error"+ e);
        }
    }//GEN-LAST:event_pFotoMouseClicked

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        vNis.setText("Nis : "+ tNis.getText());
        vNama.setText("Nama : "+ tNama.getText());
        vTTL.setText("Nis : " + tNis.getText());
        vJurusan.setText("Jurusan : "+ tJurusan.getSelectedItem().toString());
        vAlamat.setText("Alamat : "+ tAlamat.getText());
        if (rL.isSelected()) {
            vKelamin.setText(("Jenis Kelamin : LAKI-LAKI"));
            
        } else if (rP.isSelected()) {
            vKelamin.setText(("Jenis Kelamin : PEREMPUAN"));
            
        } else {
            vKelamin.setText(("Jenis Kelamin : TIDAK TERDEFINISI")); 
        }
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String tglLahir = String.valueOf(sd.format(tTanggalLahir.getDate()));
        vTTL.setText("TTL : " + tTempatLahir.getText() + "," + tglLahir);
        
        String filename;
        try {
            filename = tFoto.getText();
            String filepath = "src/foto/";
            File folder = new File(filepath);
            if (!folder.exists()) {
                folder.mkdir();
                
            }
            File sourcFile = null;
            File destFile = null;
            String ekstensi = filename.substring(filename.lastIndexOf('.') + 1);
            File sourceFile = new File(filename);
            Date tglUpload = new Date();
            SimpleDateFormat fr = new SimpleDateFormat("yyyyMMddhhss");
            String tglBaru = String.valueOf(fr.format(tglUpload));
            destFile = new File(filepath + tglBaru.toString() + "." + ekstensi);
            Files.copy(sourceFile.toPath(), destFile.toPath());
            vFoto.setText("FOTO : " + destFile.toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "upload eror" +  e);

        }

    }//GEN-LAST:event_bSimpanActionPerformed

    private void tTempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTempatLahirActionPerformed

    private void rLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rLActionPerformed

    private void rPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPActionPerformed

    private void pFotoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pFotoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pFotoAncestorAdded

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
        pFoto.setText(null);
        pFoto.setIcon(null);
    }//GEN-LAST:event_bResetActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Kelamin;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel pFoto;
    private javax.swing.JRadioButton rL;
    private javax.swing.JRadioButton rP;
    private javax.swing.JTextArea tAlamat;
    private javax.swing.JLabel tFoto;
    private javax.swing.JComboBox<String> tJurusan;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNis;
    private com.toedter.calendar.JDateChooser tTanggalLahir;
    private javax.swing.JTextField tTempatLahir;
    private javax.swing.JLabel vAlamat;
    private javax.swing.JLabel vFoto;
    private javax.swing.JLabel vJurusan;
    private javax.swing.JLabel vKelamin;
    private javax.swing.JLabel vNama;
    private javax.swing.JLabel vNis;
    private javax.swing.JLabel vTTL;
    // End of variables declaration//GEN-END:variables
}
