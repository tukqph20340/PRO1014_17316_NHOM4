/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceIplm;

import DomainModels.NhanVien;
import Repository.NhanVienRepository;
import ServiceITF.NhanVienImpl;
import ViewModels.NhanVienViews;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class NhanVienService implements NhanVienImpl {

    private NhanVienRepository nvlist = new NhanVienRepository();

    @Override
    public List<NhanVienViews> select() {
        List<NhanVienViews> list = new ArrayList<>();
        try {
            List<NhanVien> nv = nvlist.select();

            for (NhanVien nhanVien : nv) {
                NhanVienViews nv1 = new NhanVienViews(
                        nhanVien.getMaND(),
                        nhanVien.getHoTen(),
                        nhanVien.getDiaChi(),
                        nhanVien.getGioiTinh(),
                        nhanVien.getSoDT(),
                        nhanVien.getTKhoan(),
                        nhanVien.getMKhau(),
                        nhanVien.getNgaySinh(),
                        nhanVien.getChucVu(),
                        nhanVien.getMaCH());
                list.add(nv1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi Service");
            return null;
        }
        return list;
    }

    @Override
    public List<NhanVien> getOne(String manv) {
        try {
            JOptionPane.showMessageDialog(null, "Get thành công");
            return nvlist.getOne(manv);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<NhanVien> fina() {
        try {
            return nvlist.select();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<NhanVien> them(String MaND, String HoTen, String DiaChi, String GioiTinh, String SoDT, String TKhoan, String MKhau, String NgaySinh, String ChucVu, String MaCH) {
        try {
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return nvlist.them(MaND, HoTen, DiaChi, GioiTinh, SoDT, TKhoan, MKhau, NgaySinh, ChucVu, MaCH);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<NhanVien> sua(String MaND, String HoTen, String DiaChi, String GioiTinh, String SoDT, String TKhoan, String MKhau, String NgaySinh, String ChucVu, String MaCH) {
        try {
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            return nvlist.sua(MaND, HoTen, DiaChi, GioiTinh, SoDT, TKhoan, MKhau, NgaySinh, ChucVu, MaCH);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<NhanVien> xoa(String MaND) {
        try {
            JOptionPane.showMessageDialog(null, "Xoá thành công");
            return nvlist.xoa(MaND);
        } catch (Exception e) {
            return null;
        }
    }

}
