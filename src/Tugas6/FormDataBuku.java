package Tugas6;


import javax.swing.table.DefaultTableModel;//mengimport 
import java.sql.*;//package untuk menggunakan JDBC
import javax.swing.JOptionPane;//package untuk menggunakan JOption

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class FormDataBuku extends javax.swing.JFrame {
 
    /**
     * Creates new form FormDataBuku
     */
    private DefaultTableModel model;//sintaks untuk membuat model pada table   
    private Connection con =koneksi.getConnection();//untuk mengambil koneksi
    private Statement stt;//untuk eksekusi query database
    private ResultSet rss;//untuk menampung data dari database
    public FormDataBuku() {
        initComponents();
    }
    public void InitTable(){
        model = new DefaultTableModel();
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("Harga");
        jTable1.setModel(model);
        
    }
     public void TampilData(){//method untuk menampilkan data 
         try{
             String sql ="Select * from buku";//mendeklarasikan variable sql yang bertipe data string yang berisi query menampilkan data dari table buku
             stt=con.createStatement();//eksekusi query dengan mengambil koneksi untuk membuat statement
             rss=stt.executeQuery(sql); //rss digunakan untuk menapung data hasil query sql diatas dan dimasukkan ke dalam database
             while(rss.next()){//selama rss berlanjut maka
                 Object[] o = new Object[3];//menconvert array menjadi variable bebas yaitu o dimana array mempunyai range 3
                 o[0] =rss.getString("judul");//array awal berisikan variable rss diubah menjadi string judul
                 o[1] =rss.getString("penulis");//array awal berisikan variable rss diubah menjadi string penulis
                 o[2] =rss.getInt("harga");//array awal berisikan variable rss diubah menjadi integer harga
                 model.addRow(o);//dan memasukkannya kedalam  baris table model
             }
         }catch(SQLException e){
             System.out.println(e.getMessage());//menampilkan pesan eror
         }
           
    }
    private boolean validasi(String Judul){//method validasi judul
      try{
          stt=con.createStatement();//eksekusi query dengan mengambil koneksi untuk membuat statement
          String sql = "Select * from buku where judul='"+Judul+"'";//mendeklarasikan variable sql yang bertipe data string yang berisi query menampilkan data buku berdasarkan judul buku
          rss=stt.executeQuery(sql);//rss digunakan untuk menapung data hasil query sql diatas dan dimasukkan ke dalam database
          if (rss.next())//jika rss berlanjut maka 
              return true;//mengambilkan nilai benar
          else //jika tidak memenuhi kondisi diatas maka
              return false;//mengambalikan nilai salah
      }
      catch(SQLException e){
          System.out.print(e.getMessage());//menampilkan pesan eror
          return false;//mengambalikan nilai salah
          
      }  
        
    }
    private void TambahData(String judul,String penulis,String harga){//method menambahkan data
        try{
            String sql = "INSERT INTO buku VALUES (NULL,'"+judul+"' , '"+penulis+"' ,"+harga+")";//mendeklarasikan variable sql yang bertipe data string yang berisi query menambahkan data ke table buku kedalam field judul,penulis dan harga
            stt = con.createStatement();//eksekusi query dengan mengambil koneksi untuk membuat statement
            stt.executeUpdate(sql);//digunakan untuk menapung data hasil query sql diatas dan dimasukkan ke dalam database
            model.addRow(new Object[]{judul,penulis,harga});//dan memasukkannya kedalam  baris table model
            
        }catch(SQLException e){
            System.out.println(e.getMessage());//menampilkan pesan eror
        }
      
    }
    
    //private void HapusData(String judul){
      //   try{
            //String sql = "DELETE From buku  WHERE judul= "+judul;
            //stt = con. createStatement();
            // stt. executeUpdate(sql);
            
        //}catch(SQLException e){
           // System.out.println(e.getMessage());
        //}
    // }
    
    
  
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        judulku = new javax.swing.JTextField();
        hargaku = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        penulisku = new javax.swing.JComboBox();
        by = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Judul");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Penulis");

        hargaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargakuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Judul", "Penulis", "Harga"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga");

        penulisku.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "W.S Rendra", "Felix Siauw", "Asma Nadia", "Dewi Lestari" }));

        by.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Judul", "Penulis", "Harga" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("By :");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 40, 0));

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel3.add(simpan);

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        jPanel3.add(ubah);

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel3.add(hapus);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel3.add(keluar);

        cari.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cariCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(judulku, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(hargaku, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(penulisku, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(judulku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penulisku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FORM DATA BUKU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel4)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:]
        int baris=jTable1.getSelectedRow();//mendeklarasikan variable baris yang bertipe data baris yang berisi jTable dengan method getSelectedRow() yang artinya jika salah satu baris tepilih atau terselect maka dimasukkan ke dalam variable baris

        //String nim_edit=jTable1.getValueAt(baris, 0).toString();//mendeklarasikan variable nim_edit yang bertipe data string yang berisi jTable dengan method getValue(baris ,0) yang artinya variable nim 
        //String nama_edit=jTable1.getValueAt(baris, 1).toString();
       // String angkatan_edit=jTable1.getValueAt(baris, 2).toString();

        //judulku.setText(nama_edit);
        //hargaku.setText(nim_edit);
        //penulisku.setSelectedItem(angkatan_edit);
    }//GEN-LAST:event_jTable1MouseClicked

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);//keluar dari program
    }//GEN-LAST:event_keluarActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
         //try{
          //  int baris=jTable1.getSelectedRow();
        // jTable1.setValueAt(judulku.getText(),baris, 0);
        // jTable1.setValueAt(hargaku.getText(),baris, 2);
        // jTable1.setValueAt(penulisku.getSelectedItem(),baris, 1);
       // }
       //  catch(Exception e){
        //     System.out.println("Ini Eror");
        // }
                                   
    }//GEN-LAST:event_ubahActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
       String judul=judulku.getText();//mendeklarasikan variable judul yang bertipe data string yang isinya mengambil text yang diinputkan di textfield judulku
       String penulis=penulisku.getSelectedItem().toString();//mendeklarasikan variable penulis yang bertipe data string yang isinya mengambil item yang dipilih di combo box penulisku
       String harga=hargaku.getText();//mendeklarasikan variable hargaku yang bertipe data string yang isinya mengambil text yang diinputkan di textfield hargaku
       TambahData(judul,penulis,harga);//merupakan proses tambah data dari method yang sebelumnya dideklarasikan diatas
 
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
      // int i= jTable1.getSelectedRow();
       // if(i==-1)
       // {
       //     return;
       // }
       // String judul=(String) model.getValueAt(i, 0);
        //HapusData(judul);
    }//GEN-LAST:event_hapusActionPerformed
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
        TampilData();
    }//GEN-LAST:event_formComponentShown

    private void hargakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargakuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargakuActionPerformed

    private void cariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cariCaretUpdate
        // TODO add your handling code here:
        model.getDataVector().removeAllElements();//menghapus semua data yang ada pada tabel model
        model.fireTableDataChanged();//memberikan pemberitahuan bahwa data di table model telah berubah
            String cariku = by.getSelectedItem().toString();//mendeklarasikan varaible cariku yang berisi hasil dari selected item dari combobox by
            if (cari.getText().length()>0){//jika textfield cari panjang karakternya lebih dari 0 maka dijalankan perintah dibawah ini 
            try {
            String sql = "select *from buku where "+cariku+" like '%"+cari.getText()+"%'";//mendeklarasikan variable sql yang bertipe data string yang berisi query menampilakan data dari tabel buku
            stt = con.  createStatement();//eksekusi query dengan mengambil koneksi untuk membuat statement
             rss = stt.  executeQuery(sql);//rss digunakan untuk menapung data hasil query sql diatas dan dimasukkan ke dalam database
              ResultSet rss=stt.executeQuery(sql);//rss diatur hasilnya query sql diatas dan dimasukkan ke dalam database
              while (rss.next()) {//selama rss berlanjut maka
                Object[] o=new Object[3];
                o[0]=rss.getString("JUDUL");//array awal berisikan variable rss diubah menjadi string judul
                 o[1] =rss.getString("PENULIS");//array awal berisikan variable rss diubah menjadi string penulis
                 o[2] =rss.getInt("HARGA");//array awal berisikan variable rss diubah menjadi integer harga
                 model.addRow(o);//dan memasukkannya kedalam  baris table model
            }
            stt.close();//perintah stt diberhentikan
            rss.close();//perintah rss diberhentikan
          }
            catch(SQLException e) {
            System.out.println("Terjadi kesalahan");//menampilkan pesan eror
            
        }
         
                   
    }      
    }//GEN-LAST:event_cariCaretUpdate

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
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox by;
    private javax.swing.JTextField cari;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hargaku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField judulku;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox penulisku;
    private javax.swing.JButton simpan;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}