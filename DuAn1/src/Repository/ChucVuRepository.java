/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.ChucVu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Repository.DBContext;

/**
 *
 * @author ADMIN
 */
public class ChucVuRepository {

    public List<ChucVu> select() {
        ArrayList<ChucVu> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "SELECT [Id]\n"
                    + "      ,[MaCV]\n"
                    + "      ,[Ten]\n"
                    + "  FROM [dbo].[ChucVu]";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaCV = rs.getString("MaCV");
                String TenCV = rs.getString("Ten");
                ChucVu CV = new ChucVu();
                CV.setMaCV(MaCV);
                CV.setTenCV(TenCV);
                list.add(CV);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi Select");
        }
        return list;
    }

    public List<ChucVu> getOne(String macv) {
        ArrayList<ChucVu> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "SELECT [Id]\n"
                    + "      ,[MaCV]\n"
                    + "      ,[Ten]\n"
                    + "  FROM [dbo].[ChucVu] Where MaCV = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, macv);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaCV = rs.getString("MaCV");
                String TenCV = rs.getString("Ten");
                ChucVu CV = new ChucVu();
                CV.setMaCV(MaCV);
                CV.setTenCV(TenCV);
                list.add(CV);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi getOne");
        }
        return list;
    }

    public List<ChucVu> them(String MaCV, String TenCV) {
        ArrayList<ChucVu> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "INSERT INTO ChucVu(MaCV,Ten) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaCV);
            st.setString(2, TenCV);
            st.executeUpdate();
            ChucVu CV = new ChucVu();
            CV.setMaCV(MaCV);
            CV.setTenCV(TenCV);
            list.add(CV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Chức Vụ đã tồn tại");
        }
        return list;
    }

    public List<ChucVu> sua(String MaCV, String TenCV) {
        ArrayList<ChucVu> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "UPDATE ChucVu Set Ten = ? WHERE MaCV = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaCV);
            st.setString(2, TenCV);
            st.executeUpdate();
            ChucVu CV = new ChucVu();
            CV.setMaCV(MaCV);
            CV.setTenCV(TenCV);
            list.add(CV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update lỗi");
        }
        return list;
    }

    public List<ChucVu> xoa(String MaCV) {
        ArrayList<ChucVu> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "DELETE FROM [dbo].[ChucVu]\n"
                    + "      WHERE MaCV = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaCV);
            st.executeUpdate();
            ChucVu CV = new ChucVu();
            CV.setMaCV(MaCV);
            list.add(CV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xoá Lỗi");
        }
        return list;
    }

}
