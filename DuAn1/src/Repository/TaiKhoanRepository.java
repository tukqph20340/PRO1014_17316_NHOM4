/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.DangNhap;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author fptshop
 */
public class TaiKhoanRepository {

    public List<DangNhap> xacnhap() {
        ArrayList<DangNhap> listSp = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "select username,pasword from NguoiDung";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String tk = rs.getString("username");
                String pasword = rs.getString("pasword");
                DangNhap dn = new DangNhap();
                dn.setTaiKhoan(tk);
                dn.setMatKhau(pasword);
                listSp.add(dn);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi select");
        }
        return listSp;
    }

    public DangNhap xacthuctk(String tk) {
        List<DangNhap> dn1 = xacnhap();
        for (DangNhap dangNhap1 : dn1) {
            if (dangNhap1.getTaiKhoan().equalsIgnoreCase(tk)) {
                return  dangNhap1;
            }
        }
        return null;
    }
}
