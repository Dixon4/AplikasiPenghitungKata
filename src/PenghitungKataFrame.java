
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class PenghitungKataFrame extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungKataFrame
     */
    public PenghitungKataFrame() {
        initComponents();
        
        jTextArea1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) { hitungKata(); }
        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) { hitungKata(); }
        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) { hitungKata(); }
    });
    }
    
    private void hitungKata() {
    String teks = jTextArea1.getText().trim();
    int jumlahKarakter = teks.length();
    String[] kataArray = teks.split("\\s+");
    int jumlahKata = (teks.isEmpty()) ? 0 : kataArray.length;
    String[] kalimatArray = teks.split("[.!?]+");
    int jumlahKalimat = (teks.isEmpty()) ? 0 : kalimatArray.length;
    String[] paragrafArray = teks.split("\\n\\n+");
    int jumlahParagraf = (teks.isEmpty()) ? 0 : paragrafArray.length;
    
    jLabelJumlahKata.setText("Jumlah Kata: " + jumlahKata);
    jLabelJumlahKarakter.setText("Jumlah Karakter: " + jumlahKarakter);
    jLabelJumlahKalimat.setText("Jumlah Kalimat: " + jumlahKalimat);
    jLabelJumlahParagraf.setText("Jumlah Paragraf: " + jumlahParagraf);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonSimpan = new javax.swing.JButton();
        jLabelJumlahKarakter = new javax.swing.JLabel();
        jLabelJumlahKata = new javax.swing.JLabel();
        jLabelHasilCari = new javax.swing.JLabel();
        jLabelJumlahKalimat = new javax.swing.JLabel();
        jTextFieldCariKata = new javax.swing.JTextField();
        jButtonHitung = new javax.swing.JButton();
        jButtonCari = new javax.swing.JButton();
        jLabelJumlahParagraf = new javax.swing.JLabel();
        jHasiHitunglKata = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Penghitung kata", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTextArea1.setColumns(30);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jButtonSimpan.setBackground(new java.awt.Color(102, 255, 102));
        jButtonSimpan.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jButtonSimpan, gridBagConstraints);

        jLabelJumlahKarakter.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelJumlahKarakter.setText("Jumlah Karakter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(jLabelJumlahKarakter, gridBagConstraints);

        jLabelJumlahKata.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelJumlahKata.setText("Jumlah Kata");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jLabelJumlahKata, gridBagConstraints);

        jLabelHasilCari.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelHasilCari.setText("Hasil Pencarian...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jLabelHasilCari, gridBagConstraints);

        jLabelJumlahKalimat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelJumlahKalimat.setText("Jumlah Kalimat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(jLabelJumlahKalimat, gridBagConstraints);

        jTextFieldCariKata.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jTextFieldCariKata, gridBagConstraints);

        jButtonHitung.setBackground(new java.awt.Color(255, 204, 51));
        jButtonHitung.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonHitung.setText("Hitung Kata");
        jButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitungActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jButtonHitung, gridBagConstraints);

        jButtonCari.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCari.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonCari.setText("Cari");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jButtonCari, gridBagConstraints);

        jLabelJumlahParagraf.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelJumlahParagraf.setText("Jumlah Paragraf");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jLabelJumlahParagraf, gridBagConstraints);

        jHasiHitunglKata.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jHasiHitunglKata.setText("Hasil Hitung Kata...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jHasiHitunglKata, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(jButton1, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // Membuka JFileChooser untuk menentukan lokasi penyimpanan
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Simpan sebagai...");
        
        // Secara otomatis menetapkan ekstensi .txt
        fileChooser.setSelectedFile(new java.io.File("hasil_perhitungan.txt"));
        
        int option = fileChooser.showSaveDialog(null);
        
        if (option == JFileChooser.APPROVE_OPTION) {
            java.io.File file = fileChooser.getSelectedFile();

            // Pastikan file disimpan dengan ekstensi .txt
            if (!file.getName().toLowerCase().endsWith(".txt")) {
                file = new java.io.File(file.getAbsolutePath() + ".txt");
            }

            try (java.io.FileWriter writer = new java.io.FileWriter(file)) {
                // Menyimpan teks input dari JTextArea
                String teks = jTextArea1.getText();
                writer.write("Teks:\n" + teks + "\n\n");

                // Menyimpan hasil perhitungan
                writer.write(jLabelJumlahKata.getText() + "\n");
                writer.write(jLabelJumlahKarakter.getText() + "\n");
                writer.write(jLabelJumlahKalimat.getText() + "\n");
                writer.write(jLabelJumlahParagraf.getText() + "\n");
                writer.write(jLabelHasilCari.getText() + "\n");

                JOptionPane.showMessageDialog(null, "File berhasil disimpan sebagai .txt", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal menyimpan file.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitungActionPerformed
       // Mengambil teks dari JTextArea
        String teks = jTextArea1.getText().trim();

        // Menghitung jumlah karakter (termasuk spasi)
        int jumlahKarakter = teks.length();

        // Menghitung jumlah kata
        String[] kataArray = teks.split("\\s+"); // Memisahkan berdasarkan spasi
        int jumlahKata = (teks.isEmpty()) ? 0 : kataArray.length;

        // Menghitung jumlah kalimat menggunakan regex (berdasarkan titik, tanda seru, atau tanda tanya)
        String[] kalimatArray = teks.split("[.!?]+");
        int jumlahKalimat = (teks.isEmpty()) ? 0 : kalimatArray.length;
        
        String[] paragrafArray = teks.split("\\n\\n+");
        int jumlahParagraf = (teks.isEmpty()) ? 0 : paragrafArray.length;


        // Menampilkan hasil di JLabel
        jHasiHitunglKata.setText("Inputan yang Anda masukkan memiliki " + jumlahKata + " kata,  " + jumlahKarakter +" karakter, " + jumlahKalimat + " kalimat dan " + jumlahParagraf + " paragraf.");
    }//GEN-LAST:event_jButtonHitungActionPerformed

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
         String teks = jTextArea1.getText().toLowerCase();
         String kataCari = jTextFieldCariKata.getText().toLowerCase();
        
        if (kataCari.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Masukkan kata yang ingin dicari.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Menghitung jumlah kemunculan kata
        int jumlahKemunculan = teks.split("\\b" + kataCari + "\\b").length - 1;

        // Menampilkan hasil pencarian di JLabel
        jLabelHasilCari.setText("Kata \"" + kataCari + "\" ditemukan sebanyak: " + jumlahKemunculan + " kali");
    }//GEN-LAST:event_jButtonCariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungKataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonHitung;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JLabel jHasiHitunglKata;
    private javax.swing.JLabel jLabelHasilCari;
    private javax.swing.JLabel jLabelJumlahKalimat;
    private javax.swing.JLabel jLabelJumlahKarakter;
    private javax.swing.JLabel jLabelJumlahKata;
    private javax.swing.JLabel jLabelJumlahParagraf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCariKata;
    // End of variables declaration//GEN-END:variables
}
