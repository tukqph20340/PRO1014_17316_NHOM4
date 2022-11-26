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
    private String IdCuaHang;
    private String TenCuaHang;
    private String IdNhaCungCap;
    private String TenNhaCungCap;
    private String Ten;
    private String IdLoai;
    private String TenLoai;
    private String IdHang;
    private String TenHang;
    private String IdMau;
    private String TenMau;
    private String IdKichCo;
    private String TenKichCo;
    private String IdChatLieu;
    private String TenChatLieu;
    private String IdKieuDang;
    private String TenieuDang;
    private String Mota;
    private String NgaySanXuat;
    private Integer GiaBan;
    private Integer SoLuong;
    private String TrangThai;

    
    public SanPhamModel(String Id, String MaSP, String IdCuaHang, String TenCuaHang, String IdNhaCungCap, String TenNhaCungCap, String Ten, String IdLoai, String TenLoai, String IdHang, String TenHang, String IdMau, String TenMau, String IdKichCo, String TenKichCo, String IdChatLieu, String TenChatLieu, String IdKieuDang, String TenieuDang, String Mota, String NgaySanXuat, Integer GiaBan, Integer SoLuong, String TrangThai) {
        this.Id = Id;
        this.MaSP = MaSP;
        this.IdCuaHang = IdCuaHang;
        this.TenCuaHang = TenCuaHang;
        this.IdNhaCungCap = IdNhaCungCap;
        this.TenNhaCungCap = TenNhaCungCap;
        this.Ten = Ten;
        this.IdLoai = IdLoai;
        this.TenLoai = TenLoai;
        this.IdHang = IdHang;
        this.TenHang = TenHang;
        this.IdMau = IdMau;
        this.TenMau = TenMau;
        this.IdKichCo = IdKichCo;
        this.TenKichCo = TenKichCo;
        this.IdChatLieu = IdChatLieu;
        this.TenChatLieu = TenChatLieu;
        this.IdKieuDang = IdKieuDang;
        this.TenieuDang = TenieuDang;
        this.Mota = Mota;
        this.NgaySanXuat = NgaySanXuat;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
        this.TrangThai = TrangThai;
    }

    public SanPhamModel() {
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

    public String getIdCuaHang() {
        return IdCuaHang;
    }

    public void setIdCuaHang(String IdCuaHang) {
        this.IdCuaHang = IdCuaHang;
    }

    public String getTenCuaHang() {
        return TenCuaHang;
    }

    public void setTenCuaHang(String TenCuaHang) {
        this.TenCuaHang = TenCuaHang;
    }

    public String getIdNhaCungCap() {
        return IdNhaCungCap;
    }

    public void setIdNhaCungCap(String IdNhaCungCap) {
        this.IdNhaCungCap = IdNhaCungCap;
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

    public String getIdLoai() {
        return IdLoai;
    }

    public void setIdLoai(String IdLoai) {
        this.IdLoai = IdLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getIdHang() {
        return IdHang;
    }

    public void setIdHang(String IdHang) {
        this.IdHang = IdHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getIdMau() {
        return IdMau;
    }

    public void setIdMau(String IdMau) {
        this.IdMau = IdMau;
    }

    public String getTenMau() {
        return TenMau;
    }

    public void setTenMau(String TenMau) {
        this.TenMau = TenMau;
    }

    public String getIdKichCo() {
        return IdKichCo;
    }

    public void setIdKichCo(String IdKichCo) {
        this.IdKichCo = IdKichCo;
    }

    public String getTenKichCo() {
        return TenKichCo;
    }

    public void setTenKichCo(String TenKichCo) {
        this.TenKichCo = TenKichCo;
    }

    public String getIdChatLieu() {
        return IdChatLieu;
    }

    public void setIdChatLieu(String IdChatLieu) {
        this.IdChatLieu = IdChatLieu;
    }

    public String getTenChatLieu() {
        return TenChatLieu;
    }

    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }

    public String getIdKieuDang() {
        return IdKieuDang;
    }

    public void setIdKieuDang(String IdKieuDang) {
        this.IdKieuDang = IdKieuDang;
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
        return "SanPhamModel{" + "Id=" + Id + ", MaSP=" + MaSP + ", IdCuaHang=" + IdCuaHang + ", TenCuaHang=" + TenCuaHang + ", IdNhaCungCap=" + IdNhaCungCap + ", TenNhaCungCap=" + TenNhaCungCap + ", Ten=" + Ten + ", IdLoai=" + IdLoai + ", TenLoai=" + TenLoai + ", IdHang=" + IdHang + ", TenHang=" + TenHang + ", IdMau=" + IdMau + ", TenMau=" + TenMau + ", IdKichCo=" + IdKichCo + ", TenKichCo=" + TenKichCo + ", IdChatLieu=" + IdChatLieu + ", TenChatLieu=" + TenChatLieu + ", IdKieuDang=" + IdKieuDang + ", TenieuDang=" + TenieuDang + ", Mota=" + Mota + ", NgaySanXuat=" + NgaySanXuat + ", GiaBan=" + GiaBan + ", SoLuong=" + SoLuong + ", TrangThai=" + TrangThai + '}';
    }

   

}
