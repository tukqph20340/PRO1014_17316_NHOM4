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

    public List<SanPhamModel> select1();

    public List<SanPhamModel> selectTimKiem(String Ma);

    public List<SanPhamModel> insert(String MaSP, String MaCH, String MaNCC, String Ten, String Loai, String Hang, String Mau, String KichCo, String ChatLieu, String KieuDang, String Mota, String NgaySanXuat, int GiaNhap, int GiaBan, int SoLuong);

    public List<SanPhamModel> update(String MaSP, String MaCH, String MaNCC, String Ten, String Loai, String Hang, String Mau, String KichCo, String ChatLieu, String KieuDang, String Mota, String NgaySanXuat, int GiaNhap, int GiaBan, int SoLuong);

    public List<SanPhamModel> selectLoc(Integer GiaBan1, Integer GiaBan2);

    public List<SanPhamModel> delete(String Ma);

}
