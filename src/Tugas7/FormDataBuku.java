package Tugas7;


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
    private void InitTable(){
        model = new DefaultTableModel();
        model.addColumn("Id Buku");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("Harga");
        jTable1.setModel(model);
        
    }
     private void TampilData(){//method untuk menampilkan data 
         try{
             String sql ="Select * from buku";//mendeklarasikan variable sql yang bertipe data string yang berisi query menampilkan data dari table buku
             stt=con.createStatement();//eksekusi query dengan mengambil koneksi untuk membuat statement
             rss=stt.executeQuery(sql); //rss digunakan untuk menapung data hasil query sql diatas dan dimasukkan ke dalam database
             while(rss.next()){//selama rss berlanjut maka
                 Object[] data = new Object[4];//menconvert array menjadi variable bebas yaitu o dimana array mempunyai range 3
                 data[0] =rss.getString("id");//array awal berisikan variable rss diubah menjadi string judul
                 data[1] =rss.getString("judul");//array awal berisikan variable rss diubah menjadi string judul
                 data[2] =rss.getString("penulis");//array awal berisikan variable rss diubah menjadi string penulis
                 data[3] =rss.getInt("harga");//array awal berisikan variable rss diubah menjadi integer harga
                 model.addRow(data);//dan memasukkannya kedalam  baris table model
             }
         }catch(SQLException e){
             System.out.println(e.getMessage());//menampilkan pesan eror
         }
           
    }

    
     
     public boolean UbahData(String id,String judul,String penulis,String harga){
        try{
            String sql = "UPDATE buku set judul='"+judul
                    +"', penulis='"+penulis+"', harga="+harga
                    +" WHERE id="+id+";";
            //mendeklarasikan variable sql yang bertipe data string yang berisi query atau perintah
            //update data di tabel buku yang berisi field field judul,penulis,harga dan id
            stt = con.createStatement();//eksekusi query dengan mengambil koneksi untuk membuat statement
            stt.executeUpdate(sql);//digunakan untuk menapung data hasil query sql diatas dan dimasukkan ke dalam database
            return true;//kembalian nilai benar
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
     
     
        public boolean HapusData(String id){
        try{
            String sql = "Delete from buku where id="+id+";";
            //mendeklarasikan variable sql yang bertipe data string yang berisi query atau perintah
            //data data di tabel buku berdasarkan id
            
            stt.executeUpdate(sql);//digunakan untuk menapung data hasil query sql diatas dan dimasukkan ke dalam database
                return true;}//kembalian nilai benar
            catch(SQLException e){
            System.out.println(e.getMessage());
             return false;
        }
           }
    private boolean validasi(String Judul,String penulis){//method validasi judul dan penulis
      try{
          stt=con.createStatement();//eksekusi query dengan mengambil koneksi untuk membuat statement
          String sql = "Select * from buku where judul='"+Judul+"' and penulis='"+penulis+"';";//mendeklarasikan variable sql yang bertipe data string yang berisi query menampilkan data buku berdasarkan judul buku dan penulis
          rss=stt.executeQuery(sql);//rss digunakan untuk menapung data hasil query sql diatas dan dimasukkan ke dalam database
          if (rss.next())//jika rss berlanjut maka 
              return true;//kembalian nilai benar
          else //jika tidak memenuhi kondisi diatas maka
              return false;//kembalian nilai salah
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
     private void PencarianData(String by,String cari){
         try{
            String sql = "SELECT * FROM buku WHERE "+by+" LIKE '%"+cari+"%';";//mendeklarasikan variabel sql dengan tipe data string yang memanggil semua field dari table buku yang mempunyai element seperti yang inputkan
            stt = con.createStatement();//membuat statement koneksi
            rss = stt.executeQuery(sql);//mengeksekusi query database dengan mengeksekusi
            while(rss.next()){//melakukan perulangan
                Object[] data = new Object[4];//membuat array baru dengan nama data yang menampung 3 index
                data[0] = rss.getString("id");//index pertama[0] dari rss (penampung database) dengan nama id
                data[1] = rss.getString("judul");//index kedua[2] dari rss (penampung database) dengan nama judul
                data[2] = rss.getString("penulis");//index ketiga[3] dari rss (penampung database) dengan nama penulis
                data[3] = rss.getInt("harga");//index keempat[4] dari rss (penampung database) dengan nama harga
                model.addRow(data);    //dan memasukkannya kedalam  baris table model
            }
        }catch(Exception e){
            System.out.println(e.getMessage());//menampilkan pesan eror
        }}
   
  
       

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
        byku = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        cariku = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Judul", "Penulis", "Harga"
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

        byku.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Judul", "Penulis", "Harga" }));

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

        cariku.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                carikuCaretUpdate(evt);
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
                        .addComponent(cariku, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(byku, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(byku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cariku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

       judulku.setText(jTable1.getValueAt(baris,1).toString());//textfield yang bernama judulku mengatur nilai text pada jTable1 yang meberikan nilai kepada baris 1 ke dalam tabel 
       penulisku.setSelectedItem(jTable1.getValueAt(baris,2).toString());//combobox yang bernama penulisku mengatur nilai text pada jTable1 yang meberikan nilai kepada baris 2 ke dalam tabel
       hargaku.setText(jTable1.getValueAt(baris,3).toString());//textfield yang bernama hargaku mengatur nilai text pada jTable1 yang meberikan nilai kepada baris 3 ke dalam tabel
    }//GEN-LAST:event_jTable1MouseClicked

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);//keluar dari program
    }//GEN-LAST:event_keluarActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
    int baris = jTable1.getSelectedRow();////mendeklarasikan variable baris yang bertipe data baris yang berisi jTable dengan method getSelectedRow() yang artinya jika salah satu baris tepilih atau terselect maka dimasukkan ke dalam variable baris
    String id = jTable1.getValueAt(baris, 0).toString();//variabel id yang berisi nilai pada jTable1 yang meberikan nilai kepada baris 0 ke dalam tabel 
    String judul = judulku.getText();// variabel judul berisi nilai textfield yang diberikan text
    String penulis = penulisku.getSelectedItem().toString();// variabel penulis berisi nilai combobox yang diberikan text
    String harga =hargaku.getText();// variabel harga berisi nilai textfield yang diberikan text
    if(validasi(judul,penulis)){//seleksi kondisi jika method validasi berhasil dijalankan maka jOption dibawah ini
      JOptionPane.showMessageDialog(null, "Data Sudah Ada");//menampilkan message box yang berisi teks data sudah ada 
      
    }
    else{//jika kondisi if tidak di jalankan makan perintah dibawah ini dijalankan
        UbahData(id, judul, penulis, harga);//memanggil method ubah data di jalankan
        JOptionPane.showMessageDialog(null, "Berhasil Ubah Data");//menampilkan message box yang berisi teks berhasil ubah data 
              InitTable();//memanggil method InitTable
              TampilData();//memanggil method TampilData
    }    
    }//GEN-LAST:event_ubahActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
       String judul=judulku.getText();//mendeklarasikan variable judul yang bertipe data string yang isinya mengambil text yang diinputkan di textfield judulku
       String penulis=penulisku.getSelectedItem().toString();//mendeklarasikan variable penulis yang bertipe data string yang isinya mengambil item yang dipilih di combo box penulisku
       String harga=hargaku.getText();//mendeklarasikan variable hargaku yang bertipe data string yang isinya mengambil text yang diinputkan di textfield hargaku
       if(validasi(judul,penulis)){//seleksi kondisi jika method validasi berhasil dijalankan maka jOption dibawah ini
        JOptionPane.showMessageDialog(null, "Data sudah ada");//menampilkan message box yang berisi teks data sudah ada 
          
       }
       else{
       TambahData(judul,penulis,harga);//merupakan proses tambah data dari method yang sebelumnya dideklarasikan diatas
      InitTable();//memanggil method InitTable
      TampilData();//memanggil method TampilData
      JOptionPane.showMessageDialog(null, "Berhasil Simpan Data");//menampilkan message box yang berisi teks berhasil ubah data 
                 
       }
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
      int baris=jTable1.getSelectedRow();//mendeklarasikan variable judul yang bertipe data string yang isinya mengambil text yang diinputkan di textfield judulku
         String id = jTable1.getValueAt(baris, 0).toString();//variabel id yang berisi nilai pada jTable1 yang meberikan nilai kepada baris 0 ke dalam tabel 
            if(HapusData(id))//seleksi kondisi dimana jika method HapusData berhasil dijalankan maka
             JOptionPane.showMessageDialog(null,"Berhasil Hapus data");//menampilkan message box yang berisi teks berhasil Hapus  data 
                 
         else
             JOptionPane.showConfirmDialog(null,"Gagal Hapus data");//menampilkan message box yang berisi teks gagal ubah data 
                 
        InitTable();//memanggil method InitTable
        TampilData();//memanggil method TampilData
    }//GEN-LAST:event_hapusActionPerformed
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       InitTable();//memanggil method InitTable
       TampilData();//memanggil method TampilData
        
    }//GEN-LAST:event_formComponentShown

    private void hargakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargakuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargakuActionPerformed

    private void carikuCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_carikuCaretUpdate
        // TODO add your handling code here:
       InitTable();//memanggil method InitTable
       if(cariku.getText().length()==0){//seleksi kondisi jika textfield cariku di berikan text maka method tampildata dijalankan
           TampilData();//memanggil method TampilData
         }
       else{
         PencarianData(byku.getSelectedItem().toString(),cariku.getText());
        //jika statment di dalam if belum dijalankan maka method peencarian data di jalankan
        //dimana sesuai dengan combobox byku 
         
       }
    }//GEN-LAST:event_carikuCaretUpdate

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
    private javax.swing.JComboBox byku;
    private javax.swing.JTextField cariku;
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
