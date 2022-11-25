/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DomainModels.ChatLieu;
import DomainModels.Loai;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class LoaiRepository {

    private DBConnection db;

    public ArrayList<Loai> getListLoai() {
        ArrayList<Loai> list = new ArrayList<>();
        String sql = "select * from Loai";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Loai x = new Loai();
                x.setId(rs.getString(1));
                x.setMaLoai(rs.getString(2));
                x.setTenLoai(rs.getString(3));
                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<String> getlistMaCL() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "select MaL from Loai";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
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

    public Boolean them(Loai x) {
        String sql = "insert into Loai (MaL,Ten)values (?,?)";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, x.getMaLoai());
            ps.setObject(2, x.getTenLoai());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean sua(Loai x, String maL) {
        String sql = "update Loai set Ten=? where MaL=?";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, x.getTenLoai());
            ps.setObject(2, maL);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean xoa(String maL) {
        String sql = "delete Loai where MaL=?";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, maL);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
        public ArrayList<Loai> tim(String maL) {
            ArrayList<Loai> listTK = new ArrayList<>();
            String query = "select * from Loai where MaL = ?";
            try (Connection con = db.getConnection();
                   PreparedStatement ps = con.prepareStatement(query)) {
                ps.setObject(1, maL);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Loai x = new Loai();
                    x.setId(rs.getString(1));
                    x.setMaLoai(rs.getString(2));
                    x.setTenLoai(rs.getString(3));
                    listTK.add(x);
                }
            } catch (Exception e) {
                e.getMessage();
            }
            return listTK;
        }
}
