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
            String sql = "select * from SanPham";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaSP = rs.getString("MaSP");
                String TenCuaHang = rs.getString("MaCH");
                String TenNhaCungCap = rs.getString("MaNCC");
                String Ten = rs.getString("Ten");
                String TenLoai = rs.getString("Loai");
                String TenHang = rs.getString("Hang");
                String TenMau = rs.getString("Mau");
                String TenKichCo = rs.getString("KichCo");
                String TenChatLieu = rs.getString("ChatLieu");
                String TenKieuDang = rs.getString("KieuDang");
                String Mota = rs.getString("Mota");
                String NgaySanXuat = rs.getString("NgaySanXuat");
                Integer GiaNhap = rs.getInt("GiaNhap");
                Integer GiaBan = rs.getInt("GiaBan");
                Integer SoLuong = rs.getInt("SoLuong");
                String TrangThai = rs.getString("TrangThai");
                SanPhamModel sp = new SanPhamModel();
                sp.setMaSP(MaSP);
                sp.setTenCuaHang(TenCuaHang);
                sp.setTenNhaCungCap(TenNhaCungCap);
                sp.setTen(Ten);
                sp.setTenLoai(TenLoai);
                sp.setTenHang(TenHang);
                sp.setTenMau(TenMau);
                sp.setTenKichCo(TenKichCo);
                sp.setTenChatLieu(TenChatLieu);
                sp.setTenKieuDang(TenKieuDang);
                sp.setMota(Mota);
                sp.setNgaySanXuat(NgaySanXuat);
                sp.setGiaNhap(GiaNhap);
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
            String sql = "select * from SanPham where MaSP=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, ma);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                  String MaSP = rs.getString("MaSP");
                String TenCuaHang = rs.getString("MaCH");
                String TenNhaCungCap = rs.getString("MaNCC");
                String Ten = rs.getString("Ten");
                String TenLoai = rs.getString("Loai");
                String TenHang = rs.getString("Hang");
                String TenMau = rs.getString("Mau");
                String TenKichCo = rs.getString("KichCo");
                String TenChatLieu = rs.getString("ChatLieu");
                String TenKieuDang = rs.getString("KieuDang");
                String Mota = rs.getString("Mota");
                String NgaySanXuat = rs.getString("NgaySanXuat");
                Integer GiaNhap = rs.getInt("GiaNhap");
                Integer GiaBan = rs.getInt("GiaBan");
                Integer SoLuong = rs.getInt("SoLuong");
                String TrangThai = rs.getString("TrangThai");
                SanPhamModel sp = new SanPhamModel();
                sp.setMaSP(MaSP);
                sp.setTenCuaHang(TenCuaHang);
                sp.setTenNhaCungCap(TenNhaCungCap);
                sp.setTen(Ten);
                sp.setTenLoai(TenLoai);
                sp.setTenHang(TenHang);
                sp.setTenMau(TenMau);
                sp.setTenKichCo(TenKichCo);
                sp.setTenChatLieu(TenChatLieu);
                sp.setTenKieuDang(TenKieuDang);
                sp.setMota(Mota);
                sp.setNgaySanXuat(NgaySanXuat);
                sp.setGiaNhap(GiaNhap);
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

    public List<SanPhamModel> insert(String MaSP, String MaCH, String MaNCC, String Ten, String Loai, String Hang, String Mau, String KichCo, String ChatLieu, String KieuDang, String Mota, String NgaySanXuat, int GiaNhap, int GiaBan, int SoLuong) {
        ArrayList<SanPhamModel> listSp = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();

            String sql = "insert SanPham(MaSP, MaCH,MaNCC,Ten,Loai,Hang,Mau,KichCo,ChatLieu,KieuDang,Mota,NgaySanXuat,GiaNhap,GiaBan,SoLuong) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaSP);
            st.setString(2, MaCH);
            st.setString(3, MaNCC);
            st.setString(4, Ten);
            st.setString(5, Loai);
            st.setString(6, Hang);
            st.setString(7, Mau);
            st.setString(8, KichCo);
            st.setString(9, ChatLieu);
            st.setString(10, KieuDang);
            st.setString(11, Mota);
            st.setString(12, NgaySanXuat);
            st.setInt(13, GiaNhap);
            st.setInt(14, GiaBan);
            st.setInt(15, SoLuong);
            st.executeUpdate();
            SanPhamModel sp = new SanPhamModel();
            sp.setMaSP(MaSP);
            sp.setTenCuaHang(MaCH);
            sp.setTenNhaCungCap(MaNCC);
            sp.setTen(Ten);
            sp.setTenLoai(Loai);
            sp.setTenHang(Hang);
            sp.setTenMau(Mau);
            sp.setTenKichCo(KichCo);
            sp.setTenChatLieu(ChatLieu);
            sp.setTenKieuDang(KieuDang);
            sp.setMota(Mota);
            sp.setNgaySanXuat(NgaySanXuat);
            sp.setGiaNhap(GiaNhap);
            sp.setGiaBan(GiaBan);
            sp.setSoLuong(SoLuong);
            listSp.add(sp);
            st.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Bạn Đã Thêm Thành Công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bạn Đã Thêm Thất Bại");
            e.printStackTrace();
        }
        return listSp;
    }
//
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
//
     public List<SanPhamModel> update(String MaSP, String MaCH, String MaNCC, String Ten, String Loai, String Hang, String Mau, String KichCo, String ChatLieu, String KieuDang, String Mota, String NgaySanXuat, int GiaNhap, int GiaBan, int SoLuong) {
        ArrayList<SanPhamModel> listSp = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "update SanPham set  MaCH=?,MaNCC=?,Ten=?,Loai=?,Hang=?,Mau=?,KichCo=?,ChatLieu=?,KieuDang=?,Mota=?,NgaySanXuat=?,GiaNhap=?,GiaBan=?,SoLuong=? where MaSP=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(15, MaSP);
            st.setString(1, MaCH);
            st.setString(2, MaNCC);
            st.setString(3, Ten);
            st.setString(4, Loai);
            st.setString(5, Hang);
            st.setString(6, Mau);
            st.setString(7, KichCo);
            st.setString(8, ChatLieu);
            st.setString(9, KieuDang);
            st.setString(10, Mota);
            st.setString(11, NgaySanXuat);
            st.setInt(12, GiaNhap);
            st.setInt(13, GiaBan);
            st.setInt(14, SoLuong);
            st.executeUpdate();
            SanPhamModel sp = new SanPhamModel();
            sp.setMaSP(MaSP);
            sp.setTenCuaHang(MaCH);
            sp.setTenNhaCungCap(MaNCC);
            sp.setTen(Ten);
            sp.setTenLoai(Loai);
            sp.setTenHang(Hang);
            sp.setTenMau(Mau);
            sp.setTenKichCo(KichCo);
            sp.setTenChatLieu(ChatLieu);
            sp.setTenKieuDang(KieuDang);
            sp.setMota(Mota);
            sp.setNgaySanXuat(NgaySanXuat);
            sp.setGiaNhap(GiaNhap);
            sp.setGiaBan(GiaBan);
            sp.setSoLuong(SoLuong);
            listSp.add(sp);
            st.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Bạn Đã Sửa Thành Công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bạn Đã Sửa Thất Bại");
            e.printStackTrace();
        }
        return listSp;
     }
    public List<SanPhamModel> selectLoc(Integer GiaBan1 ,Integer GiaBan2 ) {
        ArrayList<SanPhamModel> listSp = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "select * from SanPham where GiaBan >= ? and GiaBan <=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, GiaBan1);
             st.setInt(2, GiaBan2);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                  String MaSP = rs.getString("MaSP");
                String TenCuaHang = rs.getString("MaCH");
                String TenNhaCungCap = rs.getString("MaNCC");
                String Ten = rs.getString("Ten");
                String TenLoai = rs.getString("Loai");
                String TenHang = rs.getString("Hang");
                String TenMau = rs.getString("Mau");
                String TenKichCo = rs.getString("KichCo");
                String TenChatLieu = rs.getString("ChatLieu");
                String TenKieuDang = rs.getString("KieuDang");
                String Mota = rs.getString("Mota");
                String NgaySanXuat = rs.getString("NgaySanXuat");
                Integer GiaNhap = rs.getInt("GiaNhap");
                Integer GiaBan = rs.getInt("GiaBan");
                Integer SoLuong = rs.getInt("SoLuong");
                String TrangThai = rs.getString("TrangThai");
                SanPhamModel sp = new SanPhamModel();
                sp.setMaSP(MaSP);
                sp.setTenCuaHang(TenCuaHang);
                sp.setTenNhaCungCap(TenNhaCungCap);
                sp.setTen(Ten);
                sp.setTenLoai(TenLoai);
                sp.setTenHang(TenHang);
                sp.setTenMau(TenMau);
                sp.setTenKichCo(TenKichCo);
                sp.setTenChatLieu(TenChatLieu);
                sp.setTenKieuDang(TenKieuDang);
                sp.setMota(Mota);
                sp.setNgaySanXuat(NgaySanXuat);
                sp.setGiaNhap(GiaNhap);
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
}
