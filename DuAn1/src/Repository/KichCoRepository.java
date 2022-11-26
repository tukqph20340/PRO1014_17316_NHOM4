/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.KichCo;
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
public class KichCoRepository {

    public List<KichCo> select() {
        ArrayList<KichCo> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "SELECT [Id]\n"
                    + "      ,[MaKC]\n"
                    + "      ,[Ten]\n"
                    + "  FROM [dbo].[KichCo]";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaKC = rs.getString("MaKC");
                String TenKC = rs.getString("Ten");
                KichCo KC = new KichCo();
                KC.setMaKC(MaKC);
                KC.setTenKC(TenKC);
                list.add(KC);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi Select");
        }
        return list;
    }

    public List<KichCo> getOne(String maKC) {
        ArrayList<KichCo> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "SELECT [Id]\n"
                    + "      ,[MaKC]\n"
                    + "      ,[Ten]\n"
                    + "  FROM [dbo].[KichCo] Where MaKC = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, maKC);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaKC = rs.getString("MaKC");
                String TenKC = rs.getString("Ten");
                KichCo KC = new KichCo();
                KC.setMaKC(MaKC);
                KC.setTenKC(TenKC);
                list.add(KC);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi getOne");
        }
        return list;
    }

    public List<KichCo> them(String MaKC, String TenKC) {
        ArrayList<KichCo> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "INSERT INTO KichCo(MaKC, Ten) Values (?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaKC);
            st.setString(2, TenKC);
            st.executeUpdate();
            KichCo KC = new KichCo();
            KC.setMaKC(MaKC);
            KC.setTenKC(TenKC);
            list.add(KC);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Chức Vụ đã tồn tại");
        }
        return list;
    }

    public List<KichCo> sua(String MaKC, String TenKC) {
        ArrayList<KichCo> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "UPDATE KichCo Set MaKC = ?, Ten = ? Where MaKC = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaKC);
            st.setString(2, TenKC);
            st.executeUpdate();
            KichCo KC = new KichCo();
            KC.setMaKC(MaKC);
            KC.setTenKC(TenKC);
            list.add(KC);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update lỗi");
        }
        return list;
    }

    public List<KichCo> xoa(String MaKC) {
        ArrayList<KichCo> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "DELETE FROM [dbo].[KichCo]\n"
                    + "      WHERE MaKC = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaKC);
            st.executeUpdate();
            KichCo KC = new KichCo();
            KC.setMaKC(MaKC);
            list.add(KC);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xoá Lỗi");
        }
        return list;
    }

}
