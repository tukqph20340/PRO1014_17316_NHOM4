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
    private String MaND;
    private String HoTen;
    private String DiaChi;
    private String gioiTinh;
    private String SoDT;
    private String TKhoan;
    private String MKhau;
    private String NgaySinh;
    private String ChucVu;
    private String MaCH;

    public NhanVien() {
    }

    public NhanVien(String MaND, String HoTen, String DiaChi, String gioiTinh, String SoDT, String TKhoan, String MKhau, String NgaySinh, String ChucVu, String MaCH) {
        this.MaND = MaND;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.gioiTinh = gioiTinh;
        this.SoDT = SoDT;
        this.TKhoan = TKhoan;
        this.MKhau = MKhau;
        this.NgaySinh = NgaySinh;
        this.ChucVu = ChucVu;
        this.MaCH = MaCH;
    }

    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getTKhoan() {
        return TKhoan;
    }

    public void setTKhoan(String TKhoan) {
        this.TKhoan = TKhoan;
    }

    public String getMKhau() {
        return MKhau;
    }

    public void setMKhau(String MKhau) {
        this.MKhau = MKhau;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getMaCH() {
        return MaCH;
    }

    public void setMaCH(String MaCH) {
        this.MaCH = MaCH;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaND=" + MaND + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", gioiTinh=" + gioiTinh + ", SoDT=" + SoDT + ", TKhoan=" + TKhoan + ", MKhau=" + MKhau + ", NgaySinh=" + NgaySinh + ", ChucVu=" + ChucVu + ", MaCH=" + MaCH + '}';
    }

    

    
    
    
}
