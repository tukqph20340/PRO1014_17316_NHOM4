/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;
import DomainModels.NhaCungCapModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vitam
 */
public class NhaCungCap_Responsitory {
    DBConnection_1 conn;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    List<NhaCungCapModel> list = null;

    public NhaCungCap_Responsitory() {
        conn= new DBConnection_1();
    }
    public List<NhaCungCapModel> getAllFormNhaCC(){
        String select = "SELECT MaNCC,Ten,DiaChi,Sdt from NhaCungCap";
        list = new ArrayList<>();
        try {
            st =conn.openDBConnection_1().createStatement();
            rs = st.executeQuery(select);
            while(rs.next()){
                list.add(new NhaCungCapModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_Responsitory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
     public String AddFormNhaCC(NhaCungCapModel nc){
        String select = "insert into NhaCungCap(MaNCC,Ten,DiaChi,Sdt) values(?,?,?,?)";
        try {
            pst =conn.openDBConnection_1().prepareStatement(select);
            pst.setObject(1, nc.getMaNCC());
            pst.setObject(2, nc.getTenNCC());
            pst.setObject(3, nc.getDiaChi());
            pst.setObject(4, nc.getSdt());
            pst.executeUpdate();
            return"Thêm thành công";
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_Responsitory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Thất bại";
    }
      public String XoaFormNhaCC(NhaCungCapModel nc){
        String select = "DELETE FROM NhaCungCap where MaNCC =?";
        list = new ArrayList<>();
        try {
            pst =conn.openDBConnection_1().prepareStatement(select);
           pst.setObject(1, nc.getMaNCC());
           pst.executeUpdate();
           return "Xóa Thành công";
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_Responsitory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Thất Bại";
    }
       public String UpdateFormNhaCC(NhaCungCapModel nc){
         String up = "UPDATE NhaCungCap set Ten=?,DiaChi=?,Sdt=? where MaNCC=?";
//         list = new ArrayList<>();
        try {
            pst = conn.openDBConnection_1().prepareStatement(up);
            pst.setString(1, nc.getTenNCC());
            pst.setString(2, nc.getDiaChi());
            pst.setString(3, nc.getSdt());
            pst.setString(4, nc.getMaNCC());
            pst.executeUpdate();
            pst.close();
            return "update thành công";
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "thất bại";
        }

    }
    
}
