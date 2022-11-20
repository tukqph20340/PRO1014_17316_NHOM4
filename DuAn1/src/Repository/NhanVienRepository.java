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
import Repository.DBContext;

/**
 *
 * @author ADMIN
 */
public class NhanVienRepository {

    public List<NhanVien> select() {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "select MaNV,HoVaTen,DiaChi,GioiTinh,Sdt,NgaySinh,MaTK,MaCH,MaBH from NhanVien";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaNV = rs.getString("MaNV");
                String HoVaTen = rs.getString("HoVaTen");
                String DiaChi = rs.getString("DiaChi");
                String GioiTinh = rs.getString("GioiTinh");
                String Sdt = rs.getString("Sdt");
                String NgaySinh = rs.getString("NgaySinh");
                String MaTK = rs.getString("MaTK");
                String MaCH = rs.getString("MaCH");
                String MaBH = rs.getString("MaBH");
                NhanVien NV = new NhanVien();
                NV.setMaNV(MaNV);
                NV.setHoVaTen(HoVaTen);
                NV.setDiaChi(DiaChi);
                NV.setGioiTinh(GioiTinh);
                NV.setSDT(Sdt);
                NV.setNgaySinh(NgaySinh);
                NV.setMaTK(MaTK);
                NV.setMaCH(MaCH);
                NV.setMaBH(MaBH);
                list.add(NV);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi Select");
        }
        return list;
    }
    
    public List<NhanVien> getOne(String manv) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "select MaNV,HoVaTen,DiaChi,GioiTinh,Sdt,NgaySinh,MaTK,MaCH,MaBH from NhanVien";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, manv);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaNV = rs.getString("MaNV");
                String HoVaTen = rs.getString("HoVaTen");
                String DiaChi = rs.getString("DiaChi");
                String GioiTinh = rs.getString("GioiTinh");
                String Sdt = rs.getString("Sdt");
                String NgaySinh = rs.getString("NgaySinh");
                String MaTK = rs.getString("MaTK");
                String MaCH = rs.getString("MaCH");
                String MaBH = rs.getString("MaBH");
                NhanVien NV = new NhanVien();
                NV.setMaNV(MaNV);
                NV.setHoVaTen(HoVaTen);
                NV.setDiaChi(DiaChi);
                NV.setGioiTinh(GioiTinh);
                NV.setSDT(Sdt);
                NV.setNgaySinh(NgaySinh);
                NV.setMaTK(MaTK);
                NV.setMaCH(MaCH);
                NV.setMaBH(MaBH);
                list.add(NV);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi Select");
        }
        return list;
    }
    

    public List<NhanVien> insert(String MaNV, String HoVaTen, String DiaChi, String GioiTinh, String Sdt, String NgaySinh) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "insert NhanVien(MaNV,HoVaTen,DiaChi,GioiTinh,Sdt,NgaySinh)values(?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaNV);
            st.setString(2, HoVaTen);
            st.setString(3, DiaChi);
            st.setString(4, GioiTinh);
            st.setString(5, Sdt);
            st.setString(6, NgaySinh);
            st.executeUpdate();
            NhanVien NV = new NhanVien();
            NV.setMaNV(MaNV);
            NV.setHoVaTen(HoVaTen);
            NV.setDiaChi(DiaChi);
            NV.setGioiTinh(GioiTinh);
            NV.setSDT(Sdt);
            NV.setNgaySinh(NgaySinh);
            list.add(NV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Nhân Viên đã tồn tại");

        }
        return list;
    }
    
    public List<NhanVien> update(String MaNV, String HoVaTen, String DiaChi, String GioiTinh, String Sdt, String NgaySinh) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "Update NhanVien set HoVaTen=?,DiaChi=?,GioiTinh=?,Sdt=?,NgaySinh=? where MaNV=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaNV);
            st.setString(2, HoVaTen);
            st.setString(3, DiaChi);
            st.setString(4, GioiTinh);
            st.setString(5, Sdt);
            st.setString(6, NgaySinh);
            st.executeUpdate();
            NhanVien NV = new NhanVien();
            NV.setMaNV(MaNV);
            NV.setHoVaTen(HoVaTen);
            NV.setDiaChi(DiaChi);
            NV.setGioiTinh(GioiTinh);
            NV.setSDT(Sdt);
            NV.setNgaySinh(NgaySinh);
            list.add(NV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Lỗi");

        }
        return list;
    }
    
    public List<NhanVien> delete(String MaNV) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBContext.getConnection();
            String sql = "delete from NhanVien where MaNV=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, MaNV);
            st.executeUpdate();
            NhanVien NV = new NhanVien();
            NV.setMaNV(MaNV);
            list.add(NV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete Lỗi");
        }
        return list;

    }
    
}
