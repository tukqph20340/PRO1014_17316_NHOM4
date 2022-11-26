/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiceITF;

import DomainModels.SanPhamModel;
import ViewModels.SanPhamView;
import java.util.List;
import java.sql.*;

/**
 *
 * @author fptshop
 */
public interface SanPhamITF {

    public List<SanPhamView> select();
//
//    public List<SanPhamModel> select1();
//
    public List<SanPhamModel> selectTimKiem(String Ma);
//public List<SanPhamModel> selectLoc(String GiaThap , String Giacao);
    public List<SanPhamModel> insert(String MaSP, String IdCH, String IdNCC, String Ten, String IdLoai, String IdHang, String IdMau, String IdKichCo, String IdChatLieu, String IdKieuDang, String Mota, String NgaySanXuat, Integer GiaBan, Integer SoLuong);
    public List<SanPhamModel> delete(String id);
     public List<SanPhamModel> update(String Id,String MaSP, String IdCH, String IdNCC, String Ten, String IdLoai, String IdHang, String IdMau, String IdKichCo, String IdChatLieu, String IdKieuDang, String Mota, String NgaySanXuat, int GiaBan, int SoLuong) ;
}
