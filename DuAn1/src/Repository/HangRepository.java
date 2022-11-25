/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.CuaHang;
import DomainModels.Hang;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Kien
 */
public class HangRepository {

    public List<Hang> getAll() {
        String query = "select * from Hang";
        List<Hang> list = new ArrayList<>();
        try ( Connection con = DBContextTu.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Hang(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean them(Hang x) {
        String query = "insert into Hang(MaH,Ten) values(?,?)";
        try ( Connection con = DBContextTu.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, x.getMaH());
            ps.setObject(2, x.getTenH());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<String> getlistMaCH() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "select MaH from Hang";
        try ( Connection con = DBContextTu.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String x = rs.getString(1);
                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }

    public Boolean xoa(String maH) {
        String sql = "delete Hang where MaH=?";
        try ( Connection con = DBContextTu.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, maH);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean sua(Hang x, String maH) {
        String sql = "UPDATE [dbo].[Hang]\n"
                + "      SET [Ten] = ?\n"
                + " WHERE MaH = ?";
        try ( Connection con = DBContextTu.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, x.getTenH());
            ps.setObject(2, maH);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
