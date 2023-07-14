/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penjualan;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Iqbal
 * @nim A11.2021.13691
 * @compiled in: Apache NetBeans
 */
public class Barang extends javax.swing.JFrame {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/test?autoReconnect=true&useSSL=false";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    /**
     * Creates new form barang1
     */
    public Barang() {
        initComponent();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtSatuan = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        txtStokMin = new javax.swing.JTextField();
        tblUpdate = new javax.swing.JButton();
        tblDelete = new javax.swing.JButton();
        tblClear = new javax.swing.JButton();
        tblSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane3.setViewportView(jLabel1);

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Satuan");

        jLabel5.setText("Stok");

        jLabel6.setText("Stok Minimal");

        tblUpdate.setText("Update");

        tblDelete.setText("Hapus");

        tblClear.setText("Kosongkan");

        tblSimpan.setText("Simpan");

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelData);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tblUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(tblDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tblClear))
                            .addComponent(tblSimpan)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtStokMin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(111, 111, 111)
                                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStokMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tblUpdate)
                            .addComponent(tblDelete)
                            .addComponent(tblClear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tblSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initComponent(){
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStokMin = new javax.swing.JTextField();
        tblSimpan = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        tblUpdate = new javax.swing.JButton();
        tblDelete = new javax.swing.JButton();
        tblClear = new javax.swing.JButton();
        
        tabelData.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                }, new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane3.setViewportView(tabelData);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Master Barang");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        
        jLabel1.setText("Kode Barang");
        jLabel2.setText("Nama Barang");
        jLabel3.setText("Satuan");
        jLabel4.setText("Stok Barang");
        jLabel5.setText("Stok Minimal");
        
        tblSimpan.setText("Simpan");
        tblSimpan.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                tblSimpanActionPerformed(e);
            }
        });
        
        tabelData.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                }, new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e){
                tabelDataMouseClicked(e);
            }
        });
        
        jScrollPane2.setViewportView(tabelData);
        
        tblUpdate.setText("Update");
        tblUpdate.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                tblUpdateActionPerformed(e);
            }
        });
        
        tblDelete.setText("Hapus");
        tblDelete.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                tblDeleteActionPerformed(e);
            }
        });
        
        tblClear.setText("Kosongkan");
        tblClear.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                tblClearActionPerformed(e);
            }
        });
        
        
        pack();
    }
        
    private void tblSimpanActionPerformed(java.awt.event.ActionEvent e){
        String kode = txtKode.getText().toString().trim();
        String nama = txtNama.getText();
        String satuan = txtSatuan.getText();
        int stok = Integer.parseInt(txtStok.getText());
        int stok_min = Integer.parseInt(txtStokMin.getText());
        insert(kode,nama,satuan,stok,stok_min);
        showtable();
        clear();
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent e){
        showtable();
    }
    
    private void tabelDataMouseClicked(java.awt.event.MouseEvent e){
        getData();
    }
    
    private void tblClearActionPerformed(java.awt.event.ActionEvent e){
        clear();
    }
    
    private void tblUpdateActionPerformed(java.awt.event.ActionEvent e){
        String kode = txtKode.getText().toString().trim();
        String nama = txtNama.getText();
        String satuan = txtSatuan.getText();
        int stok = Integer.parseInt(txtStok.getText());
        int stok_min = Integer.parseInt(txtStokMin.getText());
        update(kode,nama,satuan,stok,stok_min);
        showtable();
        clear();
    }
    
    private void tblDeleteActionPerformed(java.awt.event.ActionEvent e){
        String kode = txtKode.getText().toString().trim();
        try{
            Class.forName(JDBC_DRIVER);
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            stmt = conn.createStatement();
            
            String sql = "DELETE FROM barang WHERE kd_brg=?";
            
            PreparedStatement pms = conn.prepareStatement(sql);
            pms.setString(1, kode);
            
            pms.execute();
            
            stmt.close();
            conn.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        showtable();
        clear();
    }
    
    public void getData(){
        int baris = tabelData.getSelectedRow();
        txtKode.setText(String.valueOf(tabelData.getValueAt(baris, 1)));
        txtNama.setText(String.valueOf(tabelData.getValueAt(baris, 2)));
        txtSatuan.setText(String.valueOf(tabelData.getValueAt(baris, 3)));
        txtStok.setText(String.valueOf(tabelData.getValueAt(baris, 4)));
        txtStokMin.setText(String.valueOf(tabelData.getValueAt(baris, 5)));
    }
    
    public void insert(String kode, String nama, String satuan, int stok, int stokmin){
        try {
            Class.forName(JDBC_DRIVER);
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
 
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO barang (kd_brg, nm_brg, satuan, stok_brg, stok_min) VALUES (?,?,?,?,?)";
            
            PreparedStatement pms = conn.prepareStatement(sql);
            pms.setString(1, kode);
            pms.setString(2, nama);
            pms.setString(3, satuan);
            pms.setInt(4, stok);
            pms.setInt(5, stokmin);
            
            pms.execute();
            
            stmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showtable(){
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            model.addColumn("No");
            model.addColumn("Kode Barang");
            model.addColumn("Nama Barang");
            model.addColumn("Satuan");
            model.addColumn("Stok");
            model.addColumn("Stok Barang");
            
            stmt = conn.createStatement();
            String sql = "SELECT * FROM barang";
            int i = 1;
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[] {
                    i,
                    rs.getString("kd_brg"),
                    rs.getString("satuan"),
                    rs.getString("satuan"),
                    rs.getInt("stok_brg"),
                    rs.getInt("stok_min")
                });
                i++;
            }
            rs.close();
            conn.close();
            stmt.close();
            
            tabelData.setModel(model);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clear(){
        txtKode.setText("");
        txtNama.setText("");
        txtSatuan.setText("");
        txtStok.setText("");
        txtStokMin.setText("");
    }
    
    public void update(String kode, String nama, String satuan, int stok, int stokmin){
        try {
            Class.forName(JDBC_DRIVER);
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            stmt = conn.createStatement();
            
            String sql = "UPDATE barang SET kd_brg=?, nm_brg=?, satuan=?, stok_brg=?, stok_min=? WHERE kd_brg='"+kode+"'";
            
            PreparedStatement pms = conn.prepareStatement(sql);
            pms.setString(1, kode);
            pms.setString(2, nama);
            pms.setString(3, satuan);
            pms.setInt(4, stok);
            pms.setInt(5, stokmin);
            
            pms.execute();
            
            stmt.close();
            conn.close();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelData;
    private javax.swing.JButton tblClear;
    private javax.swing.JButton tblDelete;
    private javax.swing.JButton tblSimpan;
    private javax.swing.JButton tblUpdate;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtStokMin;
    // End of variables declaration//GEN-END:variables
}
