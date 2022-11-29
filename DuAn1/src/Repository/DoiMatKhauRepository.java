/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.NhanVien;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class DoiMatKhauRepository {

    private DBConnection db;

    public ArrayList<NhanVien> getList() {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "select MaND, username, pasword from NhanVien";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                NhanVien x = new NhanVien();
                x.setMaND(rs.getString(1));
                x.setTKhoan(rs.getString(2));
                x.setMKhau(rs.getString(3));
                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean doiMK(NhanVien x, String tk, String mk) {
        String sql = "update NguoiDung set pasword=? where username=? and pasword=?";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, x.getMKhau());
            ps.setObject(2, tk);
            ps.setObject(3, mk);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
