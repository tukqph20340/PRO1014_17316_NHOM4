/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.GioHang;
import DomainModels.SanPhamModel;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class GioHangRepository {
    private DBConnection db;

    public ArrayList<GioHang> getlistGioHang(String ma) {
        ArrayList<GioHang> list = new ArrayList<>();
        String sql = "select MaSP, Ten, SoLuong, Gia from SanPham where MaSP=?";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GioHang x = new GioHang();
                x.setMaSP((rs.getString(1)));
                x.setTen(rs.getString(2));
                x.setSoluong(Integer.parseInt(rs.getString(3)));
                x.setGiaBan(Integer.parseInt(rs.getString(4)));
                list.add(x);
            }
            ps.setObject(5, ma);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }
    /*public boolean tangSL(String ma){
        String sql="update ";
        return true;
    }*/
    
    
}
