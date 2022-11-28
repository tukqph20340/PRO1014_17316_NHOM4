/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class NhanVienRepository {

    public List<NhanVien> select() {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "SELECT [MaND]\n"
                    + "      ,[HoVaTen]\n"
                    + "      ,[DiaChi]\n"
                    + "      ,[GioiTinh]\n"
                    + "      ,[Sdt]\n"
                    + "      ,[username]\n"
                    + "      ,[pasword]\n"
                    + "      ,[NgaySinh]\n"
                    + "      ,[ChucVu]\n"
                    + "      ,[MaCH]\n"
                    + "  FROM [dbo].[NguoiDung]";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaND = rs.getString("MaND");
                String HoTen = rs.getString("HoVaTen");
                String DiaChi = rs.getString("DiaChi");
                String gioiTinh = rs.getString("GioiTinh");
                String Sdt = rs.getString("Sdt");
                String TKhoan = rs.getString("username");
                String MKhau = rs.getString("pasword");
                String ngaySinh = rs.getString("NgaySinh");
                String ChucVu = rs.getString("ChucVu");
                String MaCH = rs.getString("MaCH");
                NhanVien NV = new NhanVien();
                NV.setMaND(MaND);
                NV.setHoTen(HoTen);
                NV.setDiaChi(DiaChi);
                NV.setGioiTinh(gioiTinh);
                NV.setSoDT(Sdt);
                NV.setTKhoan(TKhoan);
                NV.setMKhau(MKhau);
                NV.setNgaySinh(ngaySinh);
                NV.setChucVu(ChucVu);
                NV.setMaCH(MaCH);
                list.add(NV);
                
            }
        } catch (Exception e ) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "lỗi Select");
        }
        return list;
    }

    public List<NhanVien> getOne(String manv) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "SELECT * FROM NguoiDung";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, manv);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaND = rs.getString("MaND");
                String HoTen = rs.getString("HoVaTen");
                String DiaChi = rs.getString("DiaChi");
                String GioiTinh = rs.getString("GioiTinh");
                String Sdt = rs.getString("Sdt");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String ngaySinh = rs.getString("NgaySinh");
                String ChucVu = rs.getString("ChucVu");
                String MaCH = rs.getString("MaCH");
                NhanVien NV = new NhanVien();
                NV.setMaND(MaND);
                NV.setHoTen(HoTen);
                NV.setDiaChi(DiaChi);
                NV.setGioiTinh(GioiTinh);
                NV.setSoDT(Sdt);
                NV.setTKhoan(username);
                NV.setMKhau(password);
                NV.setNgaySinh(ngaySinh);
                NV.setChucVu(ChucVu);
                NV.setMaCH(MaCH);
                list.add(NV);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi getOne");
        }
        return list;
    }

    public List<NhanVien> them(String MaND, String HoTen, String DiaChi, String GioiTinh, String SoDT, String TKhoan, String MKhau, String NgaySinh, String ChucVu, String MaCH) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "INSERT INTO [dbo].[NguoiDung]\n"
                    + "           ([MaND]\n"
                    + "           ,[HoVaTen]\n"
                    + "           ,[DiaChi]\n"
                    + "           ,[GioiTinh]\n"
                    + "           ,[Sdt]\n"
                    + "           ,[username]\n"
                    + "           ,[pasword]\n"
                    + "           ,[NgaySinh]\n"
                    + "           ,[ChucVu]\n"
                    + "           ,[MaCH])\n"
                    + "     VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaND);
            st.setString(2, HoTen);
            st.setString(3, GioiTinh);
            st.setString(4, MaCH);
            st.setString(5, ChucVu);
            st.setString(6, DiaChi);
            st.setString(7, SoDT);
            st.setString(8, NgaySinh);
            st.setString(9, TKhoan);
            st.setString(10, MKhau);
            st.executeUpdate();
            NhanVien NV = new NhanVien();
            NV.setMaND(MaND);
            NV.setHoTen(HoTen);
            NV.setDiaChi(DiaChi);
            NV.setGioiTinh(GioiTinh);
            NV.setSoDT(SoDT);
            NV.setTKhoan(TKhoan);
            NV.setMKhau(MKhau);
            NV.setNgaySinh(NgaySinh);
            NV.setChucVu(ChucVu);
            NV.setMaCH(MaCH);
            list.add(NV);
            st.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Bạn đã thêm thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Nhân Viên đã tồn tại");
        }
        return list;
    }

    public List<NhanVien> sua(String MaND, String HoTen, String DiaChi, String GioiTinh, String SoDT, String TKhoan, String MKhau, String NgaySinh, String ChucVu, String MaCH) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "INSERT INTO [dbo].[NguoiDung]\n"
                    + "           ([MaND]\n"
                    + "           ,[HoVaTen]\n"
                    + "           ,[DiaChi]\n"
                    + "           ,[GioiTinh]\n"
                    + "           ,[Sdt]\n"
                    + "           ,[username]\n"
                    + "           ,[pasword]\n"
                    + "           ,[NgaySinh]\n"
                    + "           ,[ChucVu]\n"
                    + "           ,[MaCH])\n"
                    + "     VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaND);
            st.setString(2, HoTen);
            st.setString(3, DiaChi);
            st.setString(4, GioiTinh);
            st.setString(5, SoDT);
            st.setString(6, TKhoan);
            st.setString(7, MKhau);
            st.setString(8, NgaySinh);
            st.setString(9, ChucVu);
            st.setString(10, MaCH);
            st.executeUpdate();
            NhanVien NV = new NhanVien();
            NV.setMaND(MaND);
            NV.setHoTen(HoTen);
            NV.setDiaChi(DiaChi);
            NV.setGioiTinh(GioiTinh);
            NV.setSoDT(SoDT);
            NV.setTKhoan(TKhoan);
            NV.setMKhau(MKhau);
            NV.setNgaySinh(NgaySinh);
            NV.setChucVu(ChucVu);
            NV.setMaCH(MaCH);
            list.add(NV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Nhân Viên ");
        }
        return list;
    }

    public List<NhanVien> xoa(String MaND) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContextTu.getConnection();
            String sql = "DELETE FROM [dbo].[ChucVu]\n"
                    + "      WHERE MaCV = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaND);
            st.executeUpdate();
            NhanVien NV = new NhanVien();
            NV.setMaND(MaND);
            list.add(NV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xoá Lỗi");
        }
        return list;
    }
}
