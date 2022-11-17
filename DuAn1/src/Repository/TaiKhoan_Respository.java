/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;
import DomainModels.TaiKhoan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vitam
 */
public class TaiKhoan_Respository {
    DBContext conn;
    ResultSet rs = null;
    Statement st = null;
    PreparedStatement pst = null;
    List<TaiKhoan> listTK =null;

    public TaiKhoan_Respository() {
        conn = new DBContext();
    }
    public List<TaiKhoan> getallTaiKhoan(){
        String select = "Select MaTK,MaCV,TaiKhoan,Email,Sdt,MatKhau from TaiKhoan ";
        listTK = new ArrayList<>();
        try {
            
            rs = pst.executeQuery();
            while (rs.next()) {                
                listTK.add(new TaiKhoan(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_Respository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTK;
        
    }
    public String addTK(TaiKhoan tk){
        String add = "Insert into TaiKhoan(MaTK,MaCV,Sdt,TaiKhoan,MatKhau,Email) values (?,?,?,?,?,?)";
        try {
            pst = conn.openDBConnection().prepareStatement(add);
            pst.setString(1, tk.getMaTK());
            pst.setString(2, tk.getMaCV());
            pst.setString(3, tk.getTaiKhoan());
            pst.setString(4, tk.getEmail());
            pst.setString(5, tk.getSdt());
            pst.setString(6, tk.getMatKhau());
            pst.executeUpdate();
            return"Thêm thành công";
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_Respository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return"Thêm faile";
    }
    public String XoaTK(TaiKhoan tk){
        String delete = "delete from TaiKhoan where MaTK =?";
        try {
            pst = conn.openDBConnection().prepareStatement(delete);
            pst.setString(1, tk.getMaTK());
            pst.executeUpdate();
            return"xóa thành công";
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_Respository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return"xóa faile";
    }
    public String SuaTK(TaiKhoan tk){
        String Update = "Update TaiKhoan set MaCV=?,TaiKhoan=?,Sdt=?,MatKhau=?,Email=? where MaTK=?";
        try {
            pst = conn.openDBConnection().prepareStatement(Update);
            pst.setString(1, tk.getMaCV());
            pst.setString(2, tk.getTaiKhoan());
            pst.setString(3, tk.getSdt());
            pst.setString(4, tk.getMatKhau());
            pst.setString(5, tk.getEmail());
            pst.setString(6, tk.getMaTK());
            pst.executeUpdate();
            return"Sửa thành công";
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_Respository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return"Sửa faile";
    }
    
    
}
    
