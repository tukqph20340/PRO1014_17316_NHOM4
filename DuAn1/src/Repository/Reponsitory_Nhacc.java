/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DomainModels.Nhacungcap_model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vitam
 */
public class Reponsitory_Nhacc {
    DBConnection conn;
    PreparedStatement pst = null;
    ResultSet rs = null;
    List<Nhacungcap_model> list = null;

    public Reponsitory_Nhacc() {
        conn = new DBConnection();
    }
    public List<Nhacungcap_model> getAllFormNhaCC(){
        String select ="SELECT Id,MaNCC,Ten,DiaChi,Sdt from NhaCungCap";
        list = new ArrayList<>();
        try {
            pst = conn.openDBConnection().prepareStatement(select);
            rs = pst.executeQuery();
            while (rs.next()) {                
                list.add(new Nhacungcap_model(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reponsitory_Nhacc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
      public String AddFormNhaCC(Nhacungcap_model nc){
        String select ="Insert into NhaCungCap(MaNCC,Ten,DiaChi,Sdt) values (?,?,?,?)";
        try {
            pst = conn.openDBConnection().prepareStatement(select);
//            pst.setString(1, nc.getId());
            pst.setString(1, nc.getMaCC());
            pst.setString(2, nc.getTenCC());
            pst.setString(3, nc.getDiaChi());
            pst.setString(4, nc.getSdt());
            pst.executeUpdate();
            return "Thêm thành công";
        } catch (SQLException ex) {
            Logger.getLogger(Reponsitory_Nhacc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return"Thêm Thất bại";
    }
       public String DeleteFormNhaCC(Nhacungcap_model nc){
        String Delete ="Delete from NhaCungCap where Id=?";
        try {
            pst = conn.openDBConnection().prepareStatement(Delete);
            pst.setString(1, nc.getId());
           pst.executeUpdate();
            return "Xóa thành công";
        } catch (SQLException ex) {
            Logger.getLogger(Reponsitory_Nhacc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return"Xóa Thất bại";
    }
        public String UpdateFormNhaCC(Nhacungcap_model nc){
        String up ="Update NhaCungCap set MaNCC=?,Ten=?,Diachi=?,Sdt=? where Id=?";
        try {
            pst = conn.openDBConnection().prepareStatement(up);
            pst.setString(1, nc.getMaCC());
            pst.setString(2, nc.getTenCC());
            pst.setString(3, nc.getDiaChi());
            pst.setString(4, nc.getSdt());
            pst.setString(5, nc.getId());
            return "Sửa thành công";
        } catch (SQLException ex) {
            Logger.getLogger(Reponsitory_Nhacc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return"Sửa Thất bại";
    }
    
}
