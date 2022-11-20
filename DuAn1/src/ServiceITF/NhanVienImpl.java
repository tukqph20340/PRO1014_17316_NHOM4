/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiceITF;

import DomainModels.NhanVien;
import ViewModels.NhanVienViewModel;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NhanVienImpl {

    public List<NhanVienViewModel> select();

    public List<NhanVien> getOne(String maNV);

    public List<NhanVien> fina();
    
    public List<NhanVien> insert(String MaNV, String HoVaTen, String DiaChi, String GioiTinh, String Sdt, String NgaySinh);

    public List<NhanVien> update(String MaNV, String HoVaTen, String DiaChi, String GioiTinh, String Sdt, String NgaySinh);

    public List<NhanVien> delete(String maKH);
}
