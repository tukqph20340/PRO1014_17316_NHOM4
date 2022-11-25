/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;


import DomainModels.ChatLieu;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ChatLieuRepository {
    private DBConnection db;

    public ArrayList<ChatLieu> getlistChatLieu() {
        ArrayList<ChatLieu> list = new ArrayList<>();
        String sql = "select * from ChatLieu";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChatLieu x=new ChatLieu();
                x.setId((rs.getString(1)));
                x.setMaChatLieu(rs.getString(2));
                x.setTenChatLieu(rs.getString(3));               
                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }
    
    public ArrayList<String> getlistMaCL() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "select MaCL from ChatLieu";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String x=rs.getString(1);                
                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return list;
    }

    public Boolean them(ChatLieu x) {
        String sql = "insert into ChatLieu (MaCL,Ten)values (?,?)";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, x.getMaChatLieu());
            ps.setObject(2, x.getTenChatLieu());            
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean sua(ChatLieu x, String maCL) {
        String sql = "update ChatLieu set Ten=? where MaCL=?";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {         
            ps.setObject(1, x.getTenChatLieu());
            ps.setObject(2, maCL);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean xoa(String maCL) {
        String sql = "delete ChatLieu where MaCL=?";
        try (Connection con = db.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, maCL);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<ChatLieu> tim(String maCL) {
        ArrayList<ChatLieu> listTK = new ArrayList<>();
        String query = "select * from ChatLieu where MaCL = ?";
        try (Connection con = db.getConnection();
               PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maCL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChatLieu x = new ChatLieu();
                x.setId(rs.getString(1));
                x.setMaChatLieu(rs.getString(2));
                x.setTenChatLieu(rs.getString(3));
                listTK.add(x);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return listTK;
    }
}
