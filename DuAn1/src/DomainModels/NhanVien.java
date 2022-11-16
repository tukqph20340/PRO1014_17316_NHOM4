/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private String MaNV;
    private String HoVaTen;
    private String DiaChi;
    private String GioiTinh;
    private String SDT;
    private String NgaySinh;
    private String MaTK;
    private String MaCH;
    private String MaBH;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String HoVaTen, String DiaChi, String GioiTinh, String SDT, String NgaySinh, String MaTK, String MaCH, String MaBH) {
        this.MaNV = MaNV;
        this.HoVaTen = HoVaTen;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.NgaySinh = NgaySinh;
        this.MaTK = MaTK;
        this.MaCH = MaCH;
        this.MaBH = MaBH;
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

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
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

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getMaCH() {
        return MaCH;
    }

    public void setMaCH(String MaCH) {
        this.MaCH = MaCH;
    }

    public String getMaBH() {
        return MaBH;
    }

    public void setMaBH(String MaBH) {
        this.MaBH = MaBH;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", HoVaTen=" + HoVaTen + ", DiaChi=" + DiaChi + ", GioiTinh=" + GioiTinh + ", SDT=" + SDT + ", NgaySinh=" + NgaySinh + ", MaTK=" + MaTK + ", MaCH=" + MaCH + ", MaBH=" + MaBH + '}';
    }
    
    
}
