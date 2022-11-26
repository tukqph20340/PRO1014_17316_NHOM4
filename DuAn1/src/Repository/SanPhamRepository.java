/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.SanPhamModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fptshop
 */
public class SanPhamRepository {

    public List<SanPhamModel> select() {
        ArrayList<SanPhamModel> listSp = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "select SanPham.Id  ,SanPham.MaSP,CuaHang.Ten as'CuaHang' ,NhaCungCap.Ten as'NhaCungCap'  ,SanPham.Ten ,Loai.Ten as'Loai', Hang.Ten as'Hang', Mau.Ten as'Mau' ,KichCo.Ten as'KichCo' ,ChatLieu.Ten as'ChatLieu' ,KieuDang.Ten as'KieuDang' ,SanPham.Mota ,SanPham.NgaySanXuat ,SanPham.GiaBan ,SanPham.SoLuong, SanPham.TrangThai   from (((((((SanPham INNER JOIN CuaHang ON SanPham.IdCH = CuaHang.Id ) INNER JOIN NhaCungCap on SanPham.IdNCC = NhaCungCap.Id) INNER JOIN Loai on SanPham.IdLoai =  Loai.Id ) INNER JOIN Mau on  SanPham.IdMau =  Mau.Id)  INNER JOIN KichCo  on SanPham.IdKichCo = KichCo.Id)INNER JOIN ChatLieu on SanPham.IdChatLieu =  ChatLieu.Id)INNER JOIN KieuDang on SanPham.IdKieuDang =  KieuDang.Id)INNER JOIN Hang  on SanPham.IdHang =  Hang.Id ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String Id = rs.getString("Id");
                String MaSP = rs.getString("MaSP");
                String TenCuaHang = rs.getString("CuaHang");
                String TenNhaCungCap = rs.getString("NhaCungCap");
                String Ten = rs.getString("Ten");
                String TenLoai = rs.getString("Loai");
                String TenHang = rs.getString("Hang");
                String TenMau = rs.getString("Mau");
                String TenKichCo = rs.getString("KichCo");
                String TenChatLieu = rs.getString("ChatLieu");
                String TenKieuDang = rs.getString("KieuDang");
                String Mota = rs.getString("Mota");
                String NgaySanXuat = rs.getString("NgaySanXuat");
                Integer GiaBan = rs.getInt("GiaBan");
                Integer SoLuong = rs.getInt("SoLuong");
                String TrangThai = rs.getString("TrangThai");
                SanPhamModel sp = new SanPhamModel();
                sp.setId(Id);
                sp.setMaSP(MaSP);
                sp.setTenCuaHang(TenCuaHang);
                sp.setTenNhaCungCap(TenNhaCungCap);
                sp.setTen(Ten);
                sp.setTenLoai(TenLoai);
                sp.setTenHang(TenHang);
                sp.setTenMau(TenMau);
                sp.setTenKichCo(TenKichCo);
                sp.setTenChatLieu(TenChatLieu);
                sp.setTenieuDang(TenKieuDang);
                sp.setMota(Mota);
                sp.setNgaySanXuat(NgaySanXuat);
                sp.setGiaBan(GiaBan);
                sp.setSoLuong(SoLuong);
                sp.setTrangThai(TrangThai);
                listSp.add(sp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi hiển thị");
        }
        return listSp;
    }

 public List<SanPhamModel> select1(String ma) {
        ArrayList<SanPhamModel> listSp = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "select SanPham.Id  ,SanPham.MaSP,CuaHang.Ten as'CuaHang' ,NhaCungCap.Ten as'NhaCungCap'  ,SanPham.Ten ,Loai.Ten as'Loai', Hang.Ten as'Hang', Mau.Ten as'Mau' ,KichCo.Ten as'KichCo' ,ChatLieu.Ten as'ChatLieu' ,KieuDang.Ten as'KieuDang' ,SanPham.Mota ,SanPham.NgaySanXuat ,SanPham.GiaBan ,SanPham.SoLuong, SanPham.TrangThai   from (((((((SanPham INNER JOIN CuaHang ON SanPham.IdCH = CuaHang.Id ) INNER JOIN NhaCungCap on SanPham.IdNCC = NhaCungCap.Id) INNER JOIN Loai on SanPham.IdLoai =  Loai.Id ) INNER JOIN Mau on  SanPham.IdMau =  Mau.Id)  INNER JOIN KichCo  on SanPham.IdKichCo = KichCo.Id)INNER JOIN ChatLieu on SanPham.IdChatLieu =  ChatLieu.Id)INNER JOIN KieuDang on SanPham.IdKieuDang =  KieuDang.Id)INNER JOIN Hang  on SanPham.IdHang =  Hang.Id  where MaSP=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, ma);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String Id = rs.getString("Id");
                String MaSP = rs.getString("MaSP");
                String TenCuaHang = rs.getString("CuaHang");
                String TenNhaCungCap = rs.getString("NhaCungCap");
                String Ten = rs.getString("Ten");
                String TenLoai = rs.getString("Loai");
                String TenHang = rs.getString("Hang");
                String TenMau = rs.getString("Mau");
                String TenKichCo = rs.getString("KichCo");
                String TenChatLieu = rs.getString("ChatLieu");
                String TenKieuDang = rs.getString("KieuDang");
                String Mota = rs.getString("Mota");
                String NgaySanXuat = rs.getString("NgaySanXuat");
                Integer GiaBan = rs.getInt("GiaBan");
                Integer SoLuong = rs.getInt("SoLuong");
                String TrangThai = rs.getString("TrangThai");
                SanPhamModel sp = new SanPhamModel();
                sp.setId(Id);
                sp.setMaSP(MaSP);
                sp.setTenCuaHang(TenCuaHang);
                sp.setTenNhaCungCap(TenNhaCungCap);
                sp.setTen(Ten);
                sp.setTenLoai(TenLoai);
                sp.setTenHang(TenHang);
                sp.setTenMau(TenMau);
                sp.setTenKichCo(TenKichCo);
                sp.setTenChatLieu(TenChatLieu);
                sp.setTenieuDang(TenKieuDang);
                sp.setMota(Mota);
                sp.setNgaySanXuat(NgaySanXuat);
                sp.setGiaBan(GiaBan);
                sp.setSoLuong(SoLuong);
                sp.setTrangThai(TrangThai);
                listSp.add(sp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi Tìm");
        }
        return listSp;
    }
//
////    public static void main(String[] args) {
////        try {
////            String ma = "SP1";
////            List<SanPhamModel> kq = selecttimKiem(ma);
////            System.out.println(kq);
////        } catch (Exception e) {
////        }
////    }
    public List<SanPhamModel> insert(String MaSP, String IdCH, String IdNCC, String Ten, String IdLoai, String IdHang, String IdMau, String IdKichCo, String IdChatLieu, String IdKieuDang, String Mota, String NgaySanXuat, int GiaBan, int SoLuong) {
        ArrayList<SanPhamModel> listSp = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();

            String sql = "             declare  @idsp UNIQUEIDENTIFIER\n"
                    + "                set @idsp = (select Id from CuaHang where Ten =?)			\n"
                    + "                declare  @idsp1 UNIQUEIDENTIFIER\n"
                    + "                set @idsp1 = (select Id from NhaCungCap where Ten=?)\n"
                    + "                declare  @idsp2 UNIQUEIDENTIFIER\n"
                    + "                set @idsp2 = (select Id from Loai where Ten=?)\n"
                    + "                declare  @idsp3 UNIQUEIDENTIFIER\n"
                    + "                set @idsp3 =(select Id from Hang where Ten=?)			\n"
                    + "                declare  @idsp4 UNIQUEIDENTIFIER\n"
                    + "                set @idsp4 = (select Id from Mau where Ten=?)		\n"
                    + "                declare  @idsp5 UNIQUEIDENTIFIER\n"
                    + "                set @idsp5 = (select Id from KichCo where Ten=?)	\n"
                    + "                declare  @idsp6 UNIQUEIDENTIFIER\n"
                    + "                set @idsp6 =  (select Id from ChatLieu where Ten=?)\n"
                    + "                declare  @idsp7 UNIQUEIDENTIFIER\n"
                    + "                set @idsp7 =  (select Id from KieuDang where Ten=?)\n"
                    + "                insert into SanPham(MaSP ,IdCH ,IdNCC ,Ten ,IdLoai ,IdHang ,IdMau ,IdKichCo,IdChatLieu ,IdKieuDang,Mota ,NgaySanXuat,GiaBan ,SoLuong) values (?,@idsp,@idsp1,?,@idsp2,@idsp3,@idsp4,@idsp5,@idsp6,@idsp7,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.executeUpdate();
            st.setString(1, IdCH);
            st.setString(2, IdNCC);
            st.setString(3, IdLoai);
            st.setString(4, IdHang);
            st.setString(5, IdMau);
            st.setString(6, IdKichCo);
            st.setString(7, IdChatLieu);
            st.setString(8, IdKieuDang);
            st.setString(9, MaSP);
            st.setString(10, Ten);
            st.setString(11, Mota);
            st.setString(12, NgaySanXuat);
            st.setInt(13, GiaBan);
            st.setInt(14, SoLuong);
            SanPhamModel sp = new SanPhamModel(MaSP, IdCH, IdNCC, Ten, IdLoai, IdHang, IdMau, IdKichCo, IdChatLieu, IdKieuDang, Mota, NgaySanXuat, GiaBan, SoLuong);
            listSp.add(sp);
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSp;
    }

    public List<SanPhamModel> delete(String Ma) {
        ArrayList<SanPhamModel> listSp = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "delete from SanPham where MaSP=?  ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Ma);
            st.executeUpdate();
            SanPhamModel sp = new SanPhamModel();
            sp.setMaSP(Ma);
            listSp.add(sp);
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSp;
    }

    public List<SanPhamModel> update(String Id, String MaSP, String IdCH, String IdNCC, String Ten, String IdLoai, String IdHang, String IdMau, String IdKichCo, String IdChatLieu, String IdKieuDang, String Mota, String NgaySanXuat, int GiaBan, int SoLuong) {
        ArrayList<SanPhamModel> listSp = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql =  "    declare  @idsp UNIQUEIDENTIFIER\n"
                    + "                set @idsp = (select Id from CuaHang where Ten =?)			\n"
                    + "                declare  @idsp1 UNIQUEIDENTIFIER\n"
                    + "                set @idsp1 = (select Id from NhaCungCap where Ten=?)\n"
                    + "                declare  @idsp2 UNIQUEIDENTIFIER\n"
                    + "                set @idsp2 = (select Id from Loai where Ten=?)\n"
                    + "                declare  @idsp3 UNIQUEIDENTIFIER\n"
                    + "                set @idsp3 =(select Id from Hang where Ten=?)			\n"
                    + "                declare  @idsp4 UNIQUEIDENTIFIER\n"
                    + "              set @idsp4 = (select Id from Mau where Ten=?)		\n"
                    + "                declare  @idsp5 UNIQUEIDENTIFIER\n"
                    + "               set @idsp5 = (select Id from KichCo where Ten=?)	\n"
                    + "                declare  @idsp6 UNIQUEIDENTIFIER\n"
                    + "               set @idsp6 =  (select Id from ChatLieu where Ten=?)\n"
                    + "                 declare  @idsp7 UNIQUEIDENTIFIER\n"
                    + "               set @idsp7 =  (select Id from KieuDang where Ten=?)\n"
                    + "update SanPham set MaSP=? ,IdCH=@idsp  ,IdNCC=@idsp1 ,Ten=?  ,IdLoai=@idsp2  ,IdHang=@idsp3  ,IdMau=@idsp4 ,IdKichCo=@idsp5 ,IdChatLieu=@idsp6 ,IdKieuDang=@idsp7 ,Mota =? ,NgaySanXuat=? ,GiaBan=?  ,SoLuong=?    where Id=? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(15, Id);
            st.setString(1, MaSP);
            st.setString(2, IdCH);
            st.setString(3, IdNCC);
            st.setString(4, Ten);
            st.setString(5, IdLoai);
            st.setString(6, IdHang);
            st.setString(7, IdMau);
            st.setString(8, IdKichCo);
            st.setString(9, IdChatLieu);
            st.setString(10, IdKieuDang);
            st.setString(11, Mota);
            st.setString(12, NgaySanXuat);
            st.setInt(13, GiaBan);
            st.setInt(14, SoLuong);
            st.executeUpdate();
            SanPhamModel sp = new SanPhamModel();
            sp.setId(Id);
            sp.setMaSP(MaSP);
            sp.setTenCuaHang(IdCH);
            sp.setTenNhaCungCap(IdNCC);
            sp.setTen(Ten);
            sp.setTenLoai(IdLoai);
            sp.setTenHang(IdHang);
            sp.setTenMau(IdMau);
            sp.setTenKichCo(IdKichCo);
            sp.setTenChatLieu(IdChatLieu);
            sp.setMota(Mota);
            sp.setNgaySanXuat(NgaySanXuat);
            sp.setGiaBan(GiaBan);
            sp.setSoLuong(SoLuong);
            listSp.add(sp);
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSp;
    }

//    public List<SanPhamModel> selectLoc(String GiaThap, String Giacao) {
//        ArrayList<SanPhamModel> listSp = new ArrayList<>();
//        try {
//            Connection con = DBContextTu.getConnection();
//            String sql = "select SanPham.Id ,SanPham.MaSP, CuaHang.Ten as'CuaHang' ,NhaCungCap.Ten as'NhaCungCap'  ,SanPham.Ten ,Loai.Ten as'Loai', Hang.Ten as'Hang', Mau.Ten as'Mau' ,KichCo.Ten as'KichCo' ,ChatLieu.Ten as'ChatLieu' ,KieuDang.Ten as'KieuDang' ,SanPham.Mota ,SanPham.NgaySanXuat ,SanPham.GiaNhap,SanPham.GiaBan ,SanPham.SoLuong, SanPham.TrangThai   from (((((((SanPham INNER JOIN CuaHang ON SanPham.IdCH = CuaHang.Id ) INNER JOIN NhaCungCap on SanPham.IdNCC = NhaCungCap.Id) INNER JOIN Loai on SanPham.IdLoai =  Loai.Id ) INNER JOIN Mau on  SanPham.IdMau =  Mau.Id)  INNER JOIN KichCo  on SanPham.IdKichCo = KichCo.Id)INNER JOIN ChatLieu on SanPham.IdChatLieu =  ChatLieu.Id)INNER JOIN KieuDang on SanPham.IdKieuDang =  KieuDang.Id)INNER JOIN Hang  on SanPham.IdHang =  Hang.Id where SanPham.GiaBan > ? and am.GiaBan < ?";
//            PreparedStatement st = con.prepareStatement(sql);
//            st.setString(1, GiaThap);
//            st.setString(2, Giacao);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                String Id = rs.getString("Id");
//                String MaSP = rs.getString("MaSP");
//                String TenCuaHang = rs.getString("CuaHang");
//                String TenNhaCungCap = rs.getString("NhaCungCap");
//                String Ten = rs.getString("Ten");
//                String TenLoai = rs.getString("Loai");
//                String TenHang = rs.getString("Hang");
//                String TenMau = rs.getString("Mau");
//                String TenKichCo = rs.getString("KichCo");
//                String TenChatLieu = rs.getString("ChatLieu");
//                String TenKieuDang = rs.getString("KieuDang");
//                String Mota = rs.getString("Mota");
//                String NgaySanXuat = rs.getString("NgaySanXuat");
//                Integer GiaBan = rs.getInt("GiaBan");
//                Integer SoLuong = rs.getInt("SoLuong");
//                String TrangThai = rs.getString("TrangThai");
//                String IdCH = rs.getString("IdCH");
//                String IdNCC = rs.getString("IdNCC");
//                String IdLoai = rs.getString("IdLoai");
//                String IdHang = rs.getString("IdHang");
//                String IdMau = rs.getString("IdMau");
//                String IdKichCo = rs.getString("IdKichCo");
//                String IdChatLieu = rs.getString("IdChatLieu");
//                SanPhamModel sp = new SanPhamModel();
//                sp.setId(Id);
//                sp.setMaSP(MaSP);
//                sp.setIdCuaHang(IdCH);
//                sp.setIdNhaCungCap(IdNCC);
//
//                sp.setTen(Ten);
//                sp.setIdLoai(IdLoai);
//
//                sp.setIdHang(IdHang);
//
//                sp.setIdMau(IdMau);
//
//                sp.setIdKichCo(IdKichCo);
//
//                sp.setIdChatLieu(IdChatLieu);
//
//                sp.setIdKieuDang(TenKieuDang);
//                sp.setMota(Mota);
//                sp.setNgaySanXuat(NgaySanXuat);
//                sp.setGiaBan(GiaBan);
//                sp.setSoLuong(SoLuong);
//                sp.setTrangThai(TrangThai);
//                listSp.add(sp);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Lỗi Lọc ");
//        }
//        return listSp;
//    }
}
