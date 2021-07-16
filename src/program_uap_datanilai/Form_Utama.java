/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_uap_datanilai;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author TOSHIBA
 */
public class Form_Utama extends javax.swing.JFrame {

    /**
     * Creates new form Form_Utama
     */
    public Form_Utama() {
        initComponents();
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width,screen.height);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        tampil_data7();
        tampil_data8();
        tampil_data9();
        showDate();
        showTime();
    }
    void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyy-MM-dd");
        lbl_tanggal.setText(s.format(d));
    }
    void showTime(){
        new Timer(0, new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                lbl_jam.setText(s.format(d));
            }
        }).start();
    }
    private DefaultTableModel tabmode;
    
    public void tampil_data7(){
        Object []baris = {"NIS","Nama","Bahasa Indonesia","IPA","Matematika","Bahasa Inggris"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_data1.setModel(tabmode);
        Connection con = new KoneksiDB().ConnectDb();
        try {
            String sql = "select * from kelas_7 order by NIS asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String Nis = hasil.getString("NIS");
                String Nama = hasil.getString("NAMA");
                String B_indo = hasil.getString("BAHASA_INDONESIA");
                String Ipa = hasil.getString("IPA");
                String Mtk = hasil.getString("MATEMATIKA");
                String B_ing = hasil.getString("BAHASA_INGGRIS");
                String[] data = {Nis,Nama,B_indo,Ipa,Mtk,B_ing};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void tampil_data8(){
        Object []baris = {"NIS","Nama","Bahasa Indonesia","IPA","Matematika","Bahasa Inggris"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_data2.setModel(tabmode);
        Connection con = new KoneksiDB().ConnectDb();
        try {
            String sql = "select * from kelas_8 order by NIS asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String Nis = hasil.getString("NIS");
                String Nama = hasil.getString("NAMA");
                String B_indo = hasil.getString("BAHASA_INDONESIA");
                String Ipa = hasil.getString("IPA");
                String Mtk = hasil.getString("MATEMATIKA");
                String B_ing = hasil.getString("BAHASA_INGGRIS");
                String[] data = {Nis,Nama,B_indo,Ipa,Mtk,B_ing};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void tampil_data9(){
        Object []baris = {"NIS","Nama","Bahasa Indonesia","IPA","Matematika","Bahasa Inggris"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_data3.setModel(tabmode);
        Connection con = new KoneksiDB().ConnectDb();
        try {
            String sql = "select * from kelas_9 order by NIS asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String Nis = hasil.getString("NIS");
                String Nama = hasil.getString("NAMA");
                String B_indo = hasil.getString("BAHASA_INDONESIA");
                String Ipa = hasil.getString("IPA");
                String Mtk = hasil.getString("MATEMATIKA");
                String B_ing = hasil.getString("BAHASA_INGGRIS");
                String[] data = {Nis,Nama,B_indo,Ipa,Mtk,B_ing};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void pencarian_kelas7(){
        String cari = fld_cari.getText();
        //String to=jCombo.getItemAt(i).toString();
        
       Object[] Baris={"NIS","Nama","Bahasa Indonesia","IPA","Matematika","Bahasa Inggris"};
       tabmode = new DefaultTableModel(null, Baris);
       tbl_data1.setModel(tabmode);

       Connection koneksi = new KoneksiDB().ConnectDb();
       
       try{
           String sql="Select * from kelas_7 where "
                   + "NIS like '%"+cari+"%' "
                   + "OR NAMA like '%"+cari+"%' "
                   + "OR BAHASA_INDONESIA like '%"+cari+"%' "
                   + "OR IPA like '%"+cari+"%' "
                   + "OR MATEMATIKA like '%"+cari+"%' "
                   + "OR BAHASA_INGGRIS like '%"+cari+"%' "
                   + "order by NIS asc";
           java.sql.Statement stmt=koneksi.createStatement();
           java.sql.ResultSet rslt=stmt.executeQuery(sql);
           while(rslt.next()){
               String nis=rslt.getString("NIS");
               String nama=rslt.getString("NAMA");
               String bind=rslt.getString("BAHASA_INDONESIA");
               String ipa=rslt.getString("IPA");
               String mtk=rslt.getString("MATEMATIKA");
               String bing=rslt.getString("BAHASA_INGGRIS");
               String[] dataField={nis,nama,bind,ipa,mtk,bing};
               tabmode.addRow(dataField);
           }
       }
       catch(Exception ex){
       }
    }
    public void pencarian_kelas8(){
        String cari = cari8.getText();
        
       Object[] Baris={"NIS","Nama","Bahasa Indonesia","IPA","Matematika","Bahasa Inggris"};
       tabmode = new DefaultTableModel(null, Baris);
       tbl_data2.setModel(tabmode);

       Connection koneksi = new KoneksiDB().ConnectDb();
       
       try{
           String sql="Select * from kelas_8 where "
                   + "NIS like '%"+cari+"%' "
                   + "OR NAMA like '%"+cari+"%' "
                   + "OR BAHASA_INDONESIA like '%"+cari+"%' "
                   + "OR IPA like '%"+cari+"%' "
                   + "OR MATEMATIKA like '%"+cari+"%' "
                   + "OR BAHASA_INGGRIS like '%"+cari+"%' "
                   + "order by NIS asc";
           java.sql.Statement stmt=koneksi.createStatement();
           java.sql.ResultSet rslt=stmt.executeQuery(sql);
           while(rslt.next()){
               String nis=rslt.getString("NIS");
               String nama=rslt.getString("NAMA");
               String bind=rslt.getString("BAHASA_INDONESIA");
               String ipa=rslt.getString("IPA");
               String mtk=rslt.getString("MATEMATIKA");
               String bing=rslt.getString("BAHASA_INGGRIS");
               String[] dataField={nis,nama,bind,ipa,mtk,bing};
               tabmode.addRow(dataField);
           }
       }
       catch(Exception ex){
       }
    }
    public void pencarian_kelas9(){
        String cari = field_cari.getText();
        //String to=jCombo.getItemAt(i).toString();
        
       Object[] Baris={"NIS","Nama","Bahasa Indonesia","IPA","Matematika","Bahasa Inggris"};
       tabmode = new DefaultTableModel(null, Baris);
       tbl_data3.setModel(tabmode);

       Connection koneksi = new KoneksiDB().ConnectDb();
       
       try{
           String sql="Select * from kelas_9 where "
                   + "NIS like '%"+cari+"%' "
                   + "OR NAMA like '%"+cari+"%' "
                   + "OR BAHASA_INDONESIA like '%"+cari+"%' "
                   + "OR IPA like '%"+cari+"%' "
                   + "OR MATEMATIKA like '%"+cari+"%' "
                   + "OR BAHASA_INGGRIS like '%"+cari+"%' "
                   + "order by NIS asc";
           java.sql.Statement stmt=koneksi.createStatement();
           java.sql.ResultSet rslt=stmt.executeQuery(sql);
           while(rslt.next()){
               String nis=rslt.getString("NIS");
               String nama=rslt.getString("NAMA");
               String bind=rslt.getString("BAHASA_INDONESIA");
               String ipa=rslt.getString("IPA");
               String mtk=rslt.getString("MATEMATIKA");
               String bing=rslt.getString("BAHASA_INGGRIS");
               String[] dataField={nis,nama,bind,ipa,mtk,bing};
               tabmode.addRow(dataField);
           }
       }
       catch(Exception ex){
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        fld_cari = new javax.swing.JTextField();
        btn_cari1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data1 = new javax.swing.JTable();
        btn_edit1 = new javax.swing.JButton();
        btn_refresh1 = new javax.swing.JButton();
        btn_cetak1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fld_cari2 = new javax.swing.JPanel();
        cari8 = new javax.swing.JTextField();
        btn_cari2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_data2 = new javax.swing.JTable();
        btn_edit2 = new javax.swing.JButton();
        btn_refresh2 = new javax.swing.JButton();
        btn_cetak2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        field_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data3 = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_cetak3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_jam = new javax.swing.JLabel();
        lbl_tanggal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Nilai Siswa");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Nilai Kelas 7", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(fld_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, 217, 20));

        btn_cari1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/search.JPG"))); // NOI18N
        btn_cari1.setText("Cari");
        btn_cari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 35, -1, 30));

        tbl_data1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_data1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 82, 1280, 362));

        btn_edit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/file-edit-16x16.png"))); // NOI18N
        btn_edit1.setText("Edit Data");
        btn_edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 468, -1, -1));

        btn_refresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/Uparrow2.png"))); // NOI18N
        btn_refresh1.setText("Refresh");
        btn_refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 470, -1, -1));

        btn_cetak1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/prit.JPG"))); // NOI18N
        btn_cetak1.setText("Cetak");
        btn_cetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetak1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cetak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("DATA SISWA KELAS 7");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/bg2.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 570));

        jTabbedPane1.addTab("Kelas 7", jPanel2);

        fld_cari2.setBackground(new java.awt.Color(51, 204, 255));
        fld_cari2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Nilai Kelas 8", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        fld_cari2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        fld_cari2.add(cari8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 240, -1));

        btn_cari2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/search.JPG"))); // NOI18N
        btn_cari2.setText("Cari");
        btn_cari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari2ActionPerformed(evt);
            }
        });
        fld_cari2.add(btn_cari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 30, -1, -1));

        tbl_data2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbl_data2);

        fld_cari2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 71, 1290, 366));

        btn_edit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/file-edit-16x16.png"))); // NOI18N
        btn_edit2.setText("Edit Data");
        btn_edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit2ActionPerformed(evt);
            }
        });
        fld_cari2.add(btn_edit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        btn_refresh2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/Uparrow2.png"))); // NOI18N
        btn_refresh2.setText("Refresh");
        btn_refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh2ActionPerformed(evt);
            }
        });
        fld_cari2.add(btn_refresh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 470, -1, -1));

        btn_cetak2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/prit.JPG"))); // NOI18N
        btn_cetak2.setText("Cetak");
        btn_cetak2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetak2ActionPerformed(evt);
            }
        });
        fld_cari2.add(btn_cetak2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("DATA SISWA KELAS 8");
        fld_cari2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/bg2.jpg"))); // NOI18N
        fld_cari2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 570));

        jTabbedPane1.addTab("Kelas 8", fld_cari2);

        jPanel4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Nilai Kelas 9", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(field_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 248, -1));

        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/search.JPG"))); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        jPanel4.add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 30, -1, -1));

        tbl_data3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_data3);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1290, 360));

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/file-edit-16x16.png"))); // NOI18N
        btn_edit.setText("Edit Data");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel4.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/Uparrow2.png"))); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel4.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 460, -1, -1));

        btn_cetak3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/prit.JPG"))); // NOI18N
        btn_cetak3.setText("Cetak");
        btn_cetak3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetak3ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_cetak3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("DATA SISWA KELAS 9");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/bg2.jpg"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 570));

        jTabbedPane1.addTab("Kelas 9", jPanel4);

        lbl_jam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_jam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_jam.setText("JAM");

        lbl_tanggal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_tanggal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_tanggal.setText("TANGGAL");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program_uap_datanilai/gambar/perpustakaan sdfsad.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 28)); // NOI18N
        jLabel3.setText("EDU SMART SCORE SYSTEM");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Sistem Pendataan Nilai Akhir Murid Bimbingan Belajar EDU SMART ");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setText("By : Elys Sugiarti (180441100099), Mellania Permata Sylvie (180441100101), Siti Nabila Khofifah (180441100118)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tanggal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_jam, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lbl_jam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_tanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(15, 15, 15)))
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit1ActionPerformed
        // TODO add your handling code here:
        new Form_Kelas7().setVisible(true);
    }//GEN-LAST:event_btn_edit1ActionPerformed

    private void btn_refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh1ActionPerformed
        // TODO add your handling code here:
        tampil_data7();
    }//GEN-LAST:event_btn_refresh1ActionPerformed

    private void btn_cari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari1ActionPerformed
        // TODO add your handling code here:
        pencarian_kelas7();
        fld_cari.setText("");
    }//GEN-LAST:event_btn_cari1ActionPerformed

    private void btn_edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit2ActionPerformed
        // TODO add your handling code here:
        new Form_Kelas8().setVisible(true);
    }//GEN-LAST:event_btn_edit2ActionPerformed

    private void btn_refresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh2ActionPerformed
        // TODO add your handling code here:
        tampil_data8();
    }//GEN-LAST:event_btn_refresh2ActionPerformed

    private void btn_cari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari2ActionPerformed
        // TODO add your handling code here:
        pencarian_kelas8();
        cari8.setText("");
    }//GEN-LAST:event_btn_cari2ActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        new Form_Kelas9().setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        tampil_data9();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        pencarian_kelas9();
        field_cari.setText("");
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_cetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetak1ActionPerformed
        // TODO add your handling code here:
        try {
            MessageFormat header = new MessageFormat ("Nilai Ujian Akhir Kelas 7");
            MessageFormat footer = new MessageFormat ("Page(1,number,integer)");
            
            tbl_data1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Print GAGAL");
        }
    }//GEN-LAST:event_btn_cetak1ActionPerformed

    private void btn_cetak2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetak2ActionPerformed
        // TODO add your handling code here:
        try {
            MessageFormat header = new MessageFormat ("Nilai Ujian Akhir Kelas 8");
            MessageFormat footer = new MessageFormat ("Page(1,number,integer)");
            
            tbl_data2.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Print GAGAL");
        }
    }//GEN-LAST:event_btn_cetak2ActionPerformed

    private void btn_cetak3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetak3ActionPerformed
        // TODO add your handling code here:
        try {
            MessageFormat header = new MessageFormat ("Nilai Ujian Akhir Kelas 9");
            MessageFormat footer = new MessageFormat ("Page(1,number,integer)");
            
            tbl_data3.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Print GAGAL");
        }
    }//GEN-LAST:event_btn_cetak3ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_cari1;
    private javax.swing.JButton btn_cari2;
    private javax.swing.JButton btn_cetak1;
    private javax.swing.JButton btn_cetak2;
    private javax.swing.JButton btn_cetak3;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_edit1;
    private javax.swing.JButton btn_edit2;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_refresh1;
    private javax.swing.JButton btn_refresh2;
    private javax.swing.JTextField cari8;
    private javax.swing.JTextField field_cari;
    private javax.swing.JTextField fld_cari;
    private javax.swing.JPanel fld_cari2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_jam;
    private javax.swing.JLabel lbl_tanggal;
    private javax.swing.JTable tbl_data1;
    private javax.swing.JTable tbl_data2;
    private javax.swing.JTable tbl_data3;
    // End of variables declaration//GEN-END:variables
}
