/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Kien
 */
public class DienThoai {

    private String maDt;
    private String maCh;
    private String ten;
    private String loai;
    private String hang;
    private String mau;
    private String ngaySanXuat;
    private String ngayXuatBan;
    private String soLuong;
    private String trangThai;
    private String gia;
    private String ram;
    private String heDieuHanh;
    private String chipSuLy;
    private String cpu;

    public DienThoai() {
    }

    public DienThoai(String maDt, String maCh, String ten, String loai, String hang, String mau, String ngaySanXuat, String ngayXuatBan, String soLuong, String trangThai, String gia, String ram, String heDieuHanh, String chipSuLy, String cpu) {
        this.maDt = maDt;
        this.maCh = maCh;
        this.ten = ten;
        this.loai = loai;
        this.hang = hang;
        this.mau = mau;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayXuatBan = ngayXuatBan;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
        this.gia = gia;
        this.ram = ram;
        this.heDieuHanh = heDieuHanh;
        this.chipSuLy = chipSuLy;
        this.cpu = cpu;
    }

    public String getMaDt() {
        return maDt;
    }

    public void setMaDt(String maDt) {
        this.maDt = maDt;
    }

    public String getMaCh() {
        return maCh;
    }

    public void setMaCh(String maCh) {
        this.maCh = maCh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(String ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public String getChipSuLy() {
        return chipSuLy;
    }

    public void setChipSuLy(String chipSuLy) {
        this.chipSuLy = chipSuLy;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Object[] toRowData() {
        return new Object[]{maDt, maCh, ten, loai, hang, mau, ngaySanXuat, ngayXuatBan, soLuong, trangThai, gia, ram, heDieuHanh, chipSuLy, cpu};
    }
}
