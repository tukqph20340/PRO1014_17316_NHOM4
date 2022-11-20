/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ADMIN
 */
public class NhanVienViewModel {

    private String MaNV;
    private String HoVaTen;
    private String DiaChi;
    private String SDT;
    private String NgaySinh;
    private String MaCH;
    private String GioiTinh;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String MaNV, String HoVaTen, String DiaChi, String SDT, String NgaySinh, String MaCH, String GioiTinh) {
        this.MaNV = MaNV;
        this.HoVaTen = HoVaTen;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.NgaySinh = NgaySinh;
        this.MaCH = MaCH;
        this.GioiTinh = GioiTinh;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getMaCH() {
        return MaCH;
    }

    public void setMaCH(String MaCH) {
        this.MaCH = MaCH;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    @Override
    public String toString() {
        return "NhanVienViewModel{" + "MaNV=" + MaNV + ", HoVaTen=" + HoVaTen + ", DiaChi=" + DiaChi + ", SDT=" + SDT + ", NgaySinh=" + NgaySinh + ", MaCH=" + MaCH + ", GioiTinh=" + GioiTinh + '}';
    }

    
}
