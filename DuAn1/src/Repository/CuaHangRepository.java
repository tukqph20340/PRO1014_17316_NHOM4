/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.List;
import DomainModels.CuaHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Kien
 */
public class CuaHangRepository {

    public List<CuaHang> getAll() {
        String query = "select * from CuaHang";
        List<CuaHang> list = new ArrayList<>();
        try ( Connection con = DBContextTu.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new CuaHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean them(CuaHang x) {
        String query = "insert into CuaHang(MaCH, Ten, DiaChi, ThanhPho) values (?,?,?,?)";
        try ( Connection con = DBContextTu.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, x.getMaCh());
            ps.setObject(2, x.getTenCh());
            ps.setObject(3, x.getDiaChi());
            ps.setObject(4, x.getThanhPho());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<String> getlistMaCH() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "select MaCH from CuaHang";
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

    public Boolean xoa(String maCH) {
        String sql = "delete CuaHang where MaCH=?";
        try ( Connection con = DBContextTu.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, maCH);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean sua(CuaHang x, String maCH) {
        String sql = "UPDATE [dbo].[CuaHang]\n"
                + "   SET [Ten] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + " WHERE MaCH = ?";
        try ( Connection con = DBContextTu.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, x.getTenCh());
            ps.setObject(2, x.getDiaChi());
            ps.setObject(3, x.getThanhPho());
            ps.setObject(4, maCH);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
