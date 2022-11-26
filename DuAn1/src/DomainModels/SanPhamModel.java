/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author fptshop
 */
public class SanPhamModel {

    private String Id;
    private String MaSP;
    private String TenCuaHang;
    private String TenNhaCungCap;
    private String Ten;
    private String TenLoai;
    private String TenHang;
    private String TenMau;
    private String TenKichCo;
    private String TenChatLieu;
    private String TenieuDang;
    private String Mota;
    private String NgaySanXuat;
    private Integer GiaBan;
    private Integer SoLuong;
    private String TrangThai;

    public SanPhamModel() {
    }

    public SanPhamModel(String MaSP, String TenCuaHang, String TenNhaCungCap, String Ten, String TenLoai, String TenHang, String TenMau, String TenKichCo, String TenChatLieu, String TenieuDang, String Mota, String NgaySanXuat, Integer GiaBan, Integer SoLuong) {
        this.MaSP = MaSP;
        this.TenCuaHang = TenCuaHang;
        this.TenNhaCungCap = TenNhaCungCap;
        this.Ten = Ten;
        this.TenLoai = TenLoai;
        this.TenHang = TenHang;
        this.TenMau = TenMau;
        this.TenKichCo = TenKichCo;
        this.TenChatLieu = TenChatLieu;
        this.TenieuDang = TenieuDang;
        this.Mota = Mota;
        this.NgaySanXuat = NgaySanXuat;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
    }

   

    public SanPhamModel(String Id, String MaSP, String TenCuaHang, String TenNhaCungCap, String Ten, String TenLoai, String TenHang, String TenMau, String TenKichCo, String TenChatLieu, String TenieuDang, String Mota, String NgaySanXuat, Integer GiaBan, Integer SoLuong, String TrangThai) {
        this.Id = Id;
        this.MaSP = MaSP;
        this.TenCuaHang = TenCuaHang;
        this.TenNhaCungCap = TenNhaCungCap;
        this.Ten = Ten;
        this.TenLoai = TenLoai;
        this.TenHang = TenHang;
        this.TenMau = TenMau;
        this.TenKichCo = TenKichCo;
        this.TenChatLieu = TenChatLieu;
        this.TenieuDang = TenieuDang;
        this.Mota = Mota;
        this.NgaySanXuat = NgaySanXuat;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
        this.TrangThai = TrangThai;
    }

    

   
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenCuaHang() {
        return TenCuaHang;
    }

    public void setTenCuaHang(String TenCuaHang) {
        this.TenCuaHang = TenCuaHang;
    }

    public String getTenNhaCungCap() {
        return TenNhaCungCap;
    }

    public void setTenNhaCungCap(String TenNhaCungCap) {
        this.TenNhaCungCap = TenNhaCungCap;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getTenMau() {
        return TenMau;
    }

    public void setTenMau(String TenMau) {
        this.TenMau = TenMau;
    }

    public String getTenKichCo() {
        return TenKichCo;
    }

    public void setTenKichCo(String TenKichCo) {
        this.TenKichCo = TenKichCo;
    }

    public String getTenChatLieu() {
        return TenChatLieu;
    }

    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }

    public String getTenieuDang() {
        return TenieuDang;
    }

    public void setTenieuDang(String TenieuDang) {
        this.TenieuDang = TenieuDang;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public String getNgaySanXuat() {
        return NgaySanXuat;
    }

    public void setNgaySanXuat(String NgaySanXuat) {
        this.NgaySanXuat = NgaySanXuat;
    }

    public Integer getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Integer GiaBan) {
        this.GiaBan = GiaBan;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    
 @Override
    public String toString() {
        return "SanPhamModel{" + "Id=" + Id + ", MaSP=" + MaSP + ", TenCuaHang=" + TenCuaHang + ", TenNhaCungCap=" + TenNhaCungCap + ", Ten=" + Ten + ", TenLoai=" + TenLoai + ", TenHang=" + TenHang + ", TenMau=" + TenMau + ", TenKichCo=" + TenKichCo + ", TenChatLieu=" + TenChatLieu + ", TenKieuDang=" + TenieuDang + ", Mota=" + Mota + ", NgaySanXuat=" + NgaySanXuat + ", GiaBan=" + GiaBan + ", SoLuong=" + SoLuong + ", TrangThai=" + TrangThai + '}';
    }

   

   

   

}
