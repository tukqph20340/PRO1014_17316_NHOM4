/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.TaiKhoan;
import ServiceIplm.TaiKhoanServece;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fptshop
 */
public class TaiKhoanJF extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    List<TaiKhoan> list = new ArrayList<>();
    TaiKhoanServece tk = new TaiKhoanServece();

    /**
     * Creates new form TaiKhoanJF
     */
    public TaiKhoanJF() {
        initComponents();
        setLocationRelativeTo(this);
        list = tk.getall();
        show(list);

    }

    public void show(List<TaiKhoan> lisst) {
        model.setRowCount(0);
        model = (DefaultTableModel) tblbang.getModel();
        for (TaiKhoan taiKhoan : lisst) {
            model.addRow(taiKhoan.data());
        }
        tblbang.setModel(model);
    }

    public void clear() {
        txtMaTK.setText("");
        txtMaChucVu.setText("");
        txtSDT.setText("");
        txtTaiKhoan.setText("");
        txtMatKhau.setText("");
        txtEmail.setText("");

    }

    public void check() {
        if (txtMaTK.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
            return;
        }
        if (txtMaChucVu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã chức vụ không được để trống");
            return;
        }
        if (txtSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống");
            return;
        }
        if (txtTaiKhoan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tài khoản không được để trống");
            return;
        }
        if (txtMatKhau.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
            return;
        }
        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email không được để trống");
            return;
        }

    }

//    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    TaiKhoan fill() {
        return new TaiKhoan(txtMaTK.getText(), txtMaChucVu.getText(), txtSDT.getText(), txtTaiKhoan.getText(), txtMatKhau.getText(), txtEmail.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton11 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jButton10 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbang = new javax.swing.JTable();
        txtMaTK = new javax.swing.JTextField();
        txtMaChucVu = new javax.swing.JTextField();
        txtTaiKhoan = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar2.setRollover(true);

        jButton9.setText("ĐIỆN THOẠI");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton9);

        jButton3.setText("CHI TIẾT ĐIỆN THOẠI");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton3);
        jToolBar2.add(jSeparator5);

        jButton11.setText("HÓA ĐƠN");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton11);
        jToolBar2.add(jSeparator12);

        jButton10.setText("BẢO HÀNH");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton10);
        jToolBar2.add(jSeparator1);

        jButton2.setText("NHÂN VIÊN");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton2);

        jButton1.setText("KHÁCH HÀNG");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);

        jButton12.setText("TÀI KHOẢN ");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton12);

        jButton4.setText("CỬA HÀNG");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton4);

        jButton13.setText("ĐỔI MẬT KHẨU");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton13);

        jButton14.setText("ĐĂNG XUẤT");
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("12:12:12");

        tblbang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaTK", "MaCV", "SDT", "Tai Khoan", "Mat Khau", "Email"
            }
        ));
        tblbang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbang);

        btnThem.setText("THÊM ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("TÌM KIẾM");

        jLabel1.setText("MÃ TÀI KHOẢN");

        jLabel3.setText("MÃ CHỨC VỤ");

        jLabel4.setText("TÀI KHOẢN");

        jLabel5.setText("MẬT KHẨU");

        jLabel6.setText("GMAIL");

        jLabel7.setText("SỐ ĐIỆN THOẠI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnThem)
                .addGap(97, 97, 97)
                .addComponent(btnSua)
                .addGap(115, 115, 115)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnTimKiem)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(txtMaTK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSDT)
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addComponent(txtMatKhau))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(682, 682, 682)
                            .addComponent(jLabel2)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (txtMaTK.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
            return;
        }
        if (txtMaChucVu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã chức vụ không được để trống");
            return;
        }
        if (txtSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống");
            return;
        }
        if (txtTaiKhoan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tài khoản không được để trống");
            return;
        }
        if (txtMatKhau.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
            return;
        }
        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email không được để trống");
            return;
        }
        JOptionPane.showMessageDialog(this, tk.add(fill()));
        list = tk.getall();
        show(list);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        JOptionPane.showMessageDialog(this, tk.update(fill()));
        list = tk.getall();
        show(list);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Banj có muốn xóa không?", "Xóa", JOptionPane.YES_NO_CANCEL_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, tk.delete(fill()));
            clear();
            list = tk.getall();
            show(list);
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    public void mouseclick(List<TaiKhoan> list, int index) {
        txtMaTK.setText(list.get(index).getMaTK());
        txtMaChucVu.setText(list.get(index).getMaCV());
        txtSDT.setText(list.get(index).getSdt());
        txtTaiKhoan.setText(list.get(index).getTaiKhoan());
        txtMatKhau.setText(list.get(index).getMatKhau());
        txtEmail.setText(list.get(index).getEmail());
    }
    private void tblbangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangMouseClicked
        int index = tblbang.getSelectedRow();
        mouseclick(list, index);
    }//GEN-LAST:event_tblbangMouseClicked

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
            java.util.logging.Logger.getLogger(TaiKhoanJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaiKhoanJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaiKhoanJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaiKhoanJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaiKhoanJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tblbang;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaChucVu;
    private javax.swing.JTextField txtMaTK;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
