package Tugas2;
import javax.swing.JLabel;
public class Posttest2Outpout extends javax.swing.JFrame {

    /**
     * Creates new form Posttest2Outpout
     */
    public Posttest2Outpout() {
        
            initComponents();
        
    }
    public Posttest2Outpout(String nama, String ttl1, String ttl2, String alamat, String rt1, String rt2, String kelurahan, String kecamatan, String kota, String pekerjaan, String agama, String status, String goldar, String JenisKelamin, String warganegara) {
        
    initComponents();
    jnama.setText(nama);
    jttl1.setText(ttl1);
    jttl2.setText(ttl2);
    jalamat.setText(alamat);
    jrt1.setText(rt1);
    jrt2.setText(rt2);
    jkel.setText(kelurahan);
    jkec.setText(kecamatan);
    jkota.setText(kota);
    jkerja.setText(pekerjaan);
    
    
    jjk.setText(""+JenisKelamin);
    jwarga.setText(""+warganegara);
    
    jagama.setText(""+agama);
    jstatus.setText(""+status);
    jgoldar.setText(""+goldar);
    
    
    
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        button1 = new usu.widget.Button();
        txtGoldar = new javax.swing.JPanel();
        labelNama = new javax.swing.JLabel();
        labelTTL = new javax.swing.JLabel();
        labelJK = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelRT = new javax.swing.JLabel();
        labelKelDesa = new javax.swing.JLabel();
        labelKec = new javax.swing.JLabel();
        labelKota = new javax.swing.JLabel();
        labelAgama = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        labelGoldar = new javax.swing.JLabel();
        labelPekerjaan = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jwarga = new javax.swing.JLabel();
        jkerja = new javax.swing.JLabel();
        jgoldar = new javax.swing.JLabel();
        jstatus = new javax.swing.JLabel();
        jagama = new javax.swing.JLabel();
        jkota = new javax.swing.JLabel();
        jkec = new javax.swing.JLabel();
        jkel = new javax.swing.JLabel();
        jrt1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jrt2 = new javax.swing.JLabel();
        jalamat = new javax.swing.JLabel();
        jjk = new javax.swing.JLabel();
        jttl1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jttl2 = new javax.swing.JLabel();
        jnama = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel1");

        button1.setText("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGoldar.setBackground(new java.awt.Color(51, 51, 51));
        txtGoldar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kartu Tanda Penduduk (KTP)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        txtGoldar.setForeground(new java.awt.Color(255, 255, 255));

        labelNama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Nama");

        labelTTL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTTL.setForeground(new java.awt.Color(255, 255, 255));
        labelTTL.setText("Tempat / Tanggal Lahir ");

        labelJK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelJK.setForeground(new java.awt.Color(255, 255, 255));
        labelJK.setText("Jenis Kelamin ");

        labelAlamat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(255, 255, 255));
        labelAlamat.setText("Alamat");

        labelRT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelRT.setForeground(new java.awt.Color(255, 255, 255));
        labelRT.setText("RT/RW");

        labelKelDesa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKelDesa.setForeground(new java.awt.Color(255, 255, 255));
        labelKelDesa.setText("Kel/Desa");

        labelKec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKec.setForeground(new java.awt.Color(255, 255, 255));
        labelKec.setText("Kecamatan");

        labelKota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKota.setForeground(new java.awt.Color(255, 255, 255));
        labelKota.setText("Kota");

        labelAgama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAgama.setForeground(new java.awt.Color(255, 255, 255));
        labelAgama.setText("Agama");

        labelStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setText("Status");

        labelGoldar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelGoldar.setForeground(new java.awt.Color(255, 255, 255));
        labelGoldar.setText("Golongan Darah");

        labelPekerjaan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPekerjaan.setForeground(new java.awt.Color(255, 255, 255));
        labelPekerjaan.setText("Pekerjaan");

        label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Kewarganegaraan");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jwarga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jwarga.setForeground(new java.awt.Color(255, 255, 255));
        jwarga.setText("jLabel1");

        jkerja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jkerja.setForeground(new java.awt.Color(255, 255, 255));
        jkerja.setText("jLabel1");

        jgoldar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jgoldar.setForeground(new java.awt.Color(255, 255, 255));
        jgoldar.setText("jLabel1");

        jstatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jstatus.setForeground(new java.awt.Color(255, 255, 255));
        jstatus.setText("jLabel1");

        jagama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jagama.setForeground(new java.awt.Color(255, 255, 255));
        jagama.setText("jLabel1");

        jkota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jkota.setForeground(new java.awt.Color(255, 255, 255));
        jkota.setText("jLabel1");

        jkec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jkec.setForeground(new java.awt.Color(255, 255, 255));
        jkec.setText("jLabel1");

        jkel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jkel.setForeground(new java.awt.Color(255, 255, 255));
        jkel.setText("jLabel1");

        jrt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrt1.setForeground(new java.awt.Color(255, 255, 255));
        jrt1.setText("jLabel1");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("/");

        jrt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrt2.setForeground(new java.awt.Color(255, 255, 255));
        jrt2.setText("jLabel1");

        jalamat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jalamat.setForeground(new java.awt.Color(255, 255, 255));
        jalamat.setText("jLabel1");

        jjk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jjk.setForeground(new java.awt.Color(255, 255, 255));
        jjk.setText("jLabel1");

        jttl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jttl1.setForeground(new java.awt.Color(255, 255, 255));
        jttl1.setText("jLabel1");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("/");

        jttl2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jttl2.setForeground(new java.awt.Color(255, 255, 255));
        jttl2.setText("jLabel1");

        jnama.setBackground(new java.awt.Color(51, 51, 51));
        jnama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jnama.setForeground(new java.awt.Color(255, 255, 255));
        jnama.setText("jLabel1");

        javax.swing.GroupLayout txtGoldarLayout = new javax.swing.GroupLayout(txtGoldar);
        txtGoldar.setLayout(txtGoldarLayout);
        txtGoldarLayout.setHorizontalGroup(
            txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtGoldarLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlamat)
                    .addGroup(txtGoldarLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKec)
                            .addComponent(labelKelDesa)
                            .addComponent(labelKota)))
                    .addComponent(labelAgama)
                    .addComponent(labelStatus)
                    .addComponent(labelGoldar)
                    .addComponent(labelPekerjaan)
                    .addComponent(label)
                    .addComponent(labelTTL)
                    .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelRT)
                        .addComponent(labelJK))
                    .addComponent(labelNama))
                .addGap(79, 79, 79)
                .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtGoldarLayout.createSequentialGroup()
                        .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jagama)
                            .addComponent(jstatus)
                            .addComponent(jgoldar)
                            .addComponent(jkerja)
                            .addComponent(jkota)
                            .addComponent(jkel)
                            .addComponent(jkec)
                            .addComponent(jalamat)
                            .addGroup(txtGoldarLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txtGoldarLayout.createSequentialGroup()
                                        .addComponent(jrt1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrt2))
                                    .addComponent(jjk)
                                    .addGroup(txtGoldarLayout.createSequentialGroup()
                                        .addComponent(jttl1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jttl2))
                                    .addComponent(jnama, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(txtGoldarLayout.createSequentialGroup()
                        .addComponent(jwarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(149, 149, 149))))
        );
        txtGoldarLayout.setVerticalGroup(
            txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtGoldarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtGoldarLayout.createSequentialGroup()
                        .addComponent(labelNama)
                        .addGap(18, 18, 18)
                        .addComponent(labelTTL)
                        .addGap(25, 25, 25)
                        .addComponent(labelJK)
                        .addGap(23, 23, 23)
                        .addComponent(labelAlamat)
                        .addGap(26, 26, 26)
                        .addComponent(labelRT)
                        .addGap(15, 15, 15)
                        .addComponent(labelKelDesa)
                        .addGap(23, 23, 23)
                        .addComponent(labelKec)
                        .addGap(23, 23, 23)
                        .addComponent(labelKota)
                        .addGap(23, 23, 23)
                        .addComponent(labelAgama)
                        .addGap(23, 23, 23)
                        .addComponent(labelStatus)
                        .addGap(23, 23, 23)
                        .addComponent(labelGoldar)
                        .addGap(23, 23, 23)
                        .addComponent(labelPekerjaan)
                        .addGap(20, 20, 20)
                        .addComponent(label))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtGoldarLayout.createSequentialGroup()
                        .addComponent(jnama)
                        .addGap(18, 18, 18)
                        .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jttl1)
                            .addComponent(jLabel15)
                            .addComponent(jttl2))
                        .addGap(25, 25, 25)
                        .addComponent(jjk)
                        .addGap(23, 23, 23)
                        .addComponent(jalamat)
                        .addGap(26, 26, 26)
                        .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jrt1)
                            .addComponent(jrt2))
                        .addGap(15, 15, 15)
                        .addComponent(jkel)
                        .addGap(23, 23, 23)
                        .addComponent(jkec)
                        .addGap(23, 23, 23)
                        .addComponent(jkota)
                        .addGap(23, 23, 23)
                        .addComponent(jagama)
                        .addGap(23, 23, 23)
                        .addComponent(jstatus)
                        .addGap(23, 23, 23)
                        .addComponent(jgoldar)
                        .addGap(23, 23, 23)
                        .addComponent(jkerja)
                        .addGap(20, 20, 20)
                        .addGroup(txtGoldarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jwarga)
                            .addComponent(jButton1)))))
        );

        getContentPane().add(txtGoldar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
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
            java.util.logging.Logger.getLogger(Posttest2Outpout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Posttest2Outpout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Posttest2Outpout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Posttest2Outpout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Posttest2Outpout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jagama;
    private javax.swing.JLabel jalamat;
    private javax.swing.JLabel jgoldar;
    private javax.swing.JLabel jjk;
    private javax.swing.JLabel jkec;
    private javax.swing.JLabel jkel;
    private javax.swing.JLabel jkerja;
    private javax.swing.JLabel jkota;
    private javax.swing.JLabel jnama;
    private javax.swing.JLabel jrt1;
    private javax.swing.JLabel jrt2;
    private javax.swing.JLabel jstatus;
    private javax.swing.JLabel jttl1;
    private javax.swing.JLabel jttl2;
    private javax.swing.JLabel jwarga;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelAgama;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelGoldar;
    private javax.swing.JLabel labelJK;
    private javax.swing.JLabel labelKec;
    private javax.swing.JLabel labelKelDesa;
    private javax.swing.JLabel labelKota;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPekerjaan;
    private javax.swing.JLabel labelRT;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTTL;
    private javax.swing.JPanel txtGoldar;
    // End of variables declaration//GEN-END:variables
}
