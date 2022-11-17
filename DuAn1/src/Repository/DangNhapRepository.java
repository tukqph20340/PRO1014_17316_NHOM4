/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.DangNhap;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author fptshop
 */
public class DangNhapRepository {
    public List<DangNhap> select(){
        ArrayList<DangNhap> list = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "select TaiKhoan , MatKhau , Ten from TaiKhoan inner join ChucVu on TaiKhoan.MaCV = ChucVu.MaCV";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                String tk = rs.getString("TaiKhoan");
                String MatKhau = rs.getString("MatKhau");
                String MaCV = rs.getString("Ten");
                DangNhap dn = new DangNhap();
                dn.setTaiKhoan(tk);
                dn.setMatKhau(MatKhau);
                dn.setChucVu(MaCV);
                list.add(dn);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi select");
            
        }
        return  list;
    }
    public DangNhap xacthuc(String tk){
            List<DangNhap> dn = select();
            for (DangNhap dangNhap : dn) {
                if (dangNhap.getTaiKhoan().equalsIgnoreCase(tk)) {
                    return dangNhap;
                }
            }
        return null;
    }
    
}
