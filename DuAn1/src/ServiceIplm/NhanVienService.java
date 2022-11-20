/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceIplm;

import DomainModels.NhanVien;
import Repository.NhanVienRepository;
import ViewModels.NhanVienViewModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ServiceITF.NhanVienImpl;

/**
 *
 * @author ADMIN
 */
public class NhanVienService implements NhanVienImpl {

    private NhanVienRepository nvlist = new NhanVienRepository();

    public List<NhanVienViewModel> select() {
        try {
            List<NhanVien> nv = nvlist.select();
            List<NhanVienViewModel> list = new ArrayList<>();
            for (NhanVien nhanVien : nv) {
                NhanVienViewModel nv1 = new NhanVienViewModel(
                        nhanVien.getMaNV(),
                        nhanVien.getHoVaTen(),
                        nhanVien.getDiaChi(),
                        nhanVien.getGioiTinh(),
                        nhanVien.getSDT(),
                        nhanVien.getNgaySinh(),
                        nhanVien.getMaCH()
                );
                list.add(nv1);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "lỗi sevice");
            return null;
        }
    }

    @Override
    public List<NhanVien> getOne(String maNV) {
        try {
            JOptionPane.showMessageDialog(null, "get success");
            return nvlist.getOne(maNV);
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
    public List<NhanVien> insert(String MaNV, String HoVaTen, String DiaChi, String GioiTinh, String Sdt, String NgaySinh) {
        try {
            JOptionPane.showMessageDialog(null, "insert success");
            return nvlist.insert(MaNV, HoVaTen, DiaChi, GioiTinh, Sdt, NgaySinh);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<NhanVien> update(String MaNV, String HoVaTen, String DiaChi, String GioiTinh, String Sdt, String NgaySinh) {
        try {
            JOptionPane.showMessageDialog(null, "update success");
            return nvlist.update(MaNV, HoVaTen, DiaChi, GioiTinh, Sdt, NgaySinh);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<NhanVien> delete(String maKH) {
        try {
            JOptionPane.showMessageDialog(null, "delete success");
            return nvlist.delete(maKH);
        } catch (Exception e) {
            return null;
        }
    }
    
    

}
