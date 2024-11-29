/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpusm3;

/**
 *
 * @author LENOVO
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class kelolaBuku extends javax.swing.JFrame {

    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql= "";
    
    public kelolaBuku() {
        initComponents();
        KoneksiDatabase();
        TampilkanData();
    }
    
    private void KoneksiDatabase() {
        try {
            //Menentukan Driver Database
            //Class.forName("com.mysql.jdbc.Driver");
            //untuk mengkoneksikan DB ke Driver
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kelolaperpus", "root", "");
            // pesan Koneksi Berhasil
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            // pesan Koneksi Gagal
            System.out.println("Koneksi Gagal" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblJudul = new javax.swing.JLabel();
        lblPengarang = new javax.swing.JLabel();
        lblTahun = new javax.swing.JLabel();
        lblKategori = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        txtKategori = new javax.swing.JTextField();
        lblCari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        cmbCari = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Kelola Perpus");

        lblJudul.setText("Judul Buku");

        lblPengarang.setText("Pengarang");

        lblTahun.setText("Tahun Terbit");

        lblKategori.setText("Kategori");

        lblCari.setText("Cari");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        cmbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Judul Buku", "Pengarang", "Tahun Terbit", "Kategori" }));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul Buku", "Pengarang", "Tahun Terbit", "Kategori"
            }
        ));
        jScrollPane1.setViewportView(table);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJudul)
                                    .addComponent(lblPengarang)
                                    .addComponent(lblTahun)
                                    .addComponent(lblKategori))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtPengarang)
                                    .addComponent(txtTahun)
                                    .addComponent(txtKategori)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addComponent(btnEdit)
                                .addGap(40, 40, 40)))
                        .addGap(27, 27, 27)
                        .addComponent(btnHapus)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCari)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCari)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJudul)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPengarang)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTahun)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKategori)
                    .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void TampilkanData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Kosongkan tabel sebelum menampilkan data
        
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM buku");
            while (Rs.next()) {
                model.addRow(new Object[]{
                    Rs.getString("judul"),
                    Rs.getString("pengarang"),
                    Rs.getInt("tahunTerbit"),
                    Rs.getString("kategori")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Menampilkan Data: " + e.getMessage());
        }
    }
    
    // Method untuk membersihkan field input setelah melakukan aksi
    private void clearFields() {
        txtJudul.setText("");
        txtPengarang.setText("");
        txtTahun.setText("");
        txtKategori.setText("");
    }
    
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String keyword = txtCari.getText();
        String category = cmbCari.getSelectedItem().toString();
        String columnName = ""; // Tentukan nama kolom berdasarkan pilihan

        switch (category) {
            case "Judul Buku":
                columnName = "judul";
                break;
            case "Pengarang":
                columnName = "pengarang";
                break;
            case "Tahun Terbit":
                columnName = "tahunTerbit";
                break;
            case "Kategori":
                columnName = "kategori";
                break;
        }

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Kosongkan tabel sebelum menampilkan data pencarian

        try {
            String sql = "SELECT * FROM buku WHERE " + columnName + " LIKE ?";
            PreparedStatement pst = Con.prepareStatement(sql);
            pst.setString(1, "%" + keyword + "%");
            Rs = pst.executeQuery();
            while (Rs.next()) {
                model.addRow(new Object[]{
                    Rs.getString("judul"),
                    Rs.getString("pengarang"),
                    Rs.getInt("tahunTerbit"),
                    Rs.getString("kategori")
                });
            }
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Mencari Data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String judulLama = table.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "UPDATE buku SET judul=?, pengarang=?, tahunTerbit=?, kategori=? WHERE judul=?";
                PreparedStatement pst = Con.prepareStatement(sql);
                pst.setString(1, txtJudul.getText());
                pst.setString(2, txtPengarang.getText());
                pst.setInt(3, Integer.parseInt(txtTahun.getText()));
                pst.setString(4, txtKategori.getText());
                pst.setString(5, judulLama);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
                clearFields();
                TampilkanData();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error Memperbarui Data: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diedit!");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String sql = "INSERT INTO buku (judul, pengarang, tahunTerbit, kategori) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = Con.prepareStatement(sql);
            pst.setString(1, txtJudul.getText());
            pst.setString(2, txtPengarang.getText());
            pst.setInt(3, Integer.parseInt(txtTahun.getText()));
            pst.setString(4, txtKategori.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
            clearFields();
            TampilkanData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Menambahkan Data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String judul = table.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM buku WHERE judul=?";
                PreparedStatement pst = Con.prepareStatement(sql);
                pst.setString(1, judul);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
                clearFields();
                TampilkanData();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error Menghapus Data: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new kelolaBuku().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCari;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblPengarang;
    private javax.swing.JLabel lblTahun;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
