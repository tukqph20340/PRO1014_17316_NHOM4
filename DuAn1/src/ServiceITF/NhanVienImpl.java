/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiceITF;

import DomainModels.NhanVien;
import ViewModels.NhanVienViews;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NhanVienImpl {
    
    public List<NhanVienViews> select();
    
    public List<NhanVien> getOne(String manv);
            
    public List<NhanVien> fina();
    
    public List<NhanVien> them(String MaND, String HoTen, String DiaChi, String GioiTinh, String SoDT, String TKhoan, String MKhau, String NgaySinh, String ChucVu, String MaCH);
    
    public List<NhanVien> sua(String MaND, String HoTen, String DiaChi, String GioiTinh, String SoDT, String TKhoan, String MKhau, String NgaySinh, String ChucVu, String MaCH);
    
    public List<NhanVien> xoa(String MaND);
}
