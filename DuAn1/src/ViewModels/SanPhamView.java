/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author fptshop
 */
public class SanPhamView {

    private String Id;
    private String MaSP;
    private String IdCuaHang;
    private String IdNhaCungCap;
    private String Ten;
    private String IdLoai;
    private String IdHang;
    private String IdMau;
    private String IdKichCo;
    private String IdChatLieu;
    private String IdKieuDang;
    private String Mota;
    private String NgaySanXuat;
    private Integer GiaBan;
    private Integer SoLuong;
    private String TrangThai;

    public SanPhamView(String Id, String MaSP, String IdCuaHang, String IdNhaCungCap, String Ten, String IdLoai, String IdHang, String IdMau, String IdKichCo, String IdChatLieu, String IdKieuDang, String Mota, String NgaySanXuat, Integer GiaBan, Integer SoLuong, String TrangThai) {
        this.Id = Id;
        this.MaSP = MaSP;
        this.IdCuaHang = IdCuaHang;
        this.IdNhaCungCap = IdNhaCungCap;
        this.Ten = Ten;
        this.IdLoai = IdLoai;
        this.IdHang = IdHang;
        this.IdMau = IdMau;
        this.IdKichCo = IdKichCo;
        this.IdChatLieu = IdChatLieu;
        this.IdKieuDang = IdKieuDang;
        this.Mota = Mota;
        this.NgaySanXuat = NgaySanXuat;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
        this.TrangThai = TrangThai;
    }

    
    public SanPhamView() {
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

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
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

    public String getIdLoai() {
        return IdLoai;
    }

    public void setIdLoai(String IdLoai) {
        this.IdLoai = IdLoai;
    }

    public String getIdHang() {
        return IdHang;
    }

    public void setIdHang(String IdHang) {
        this.IdHang = IdHang;
    }

    public String getIdMau() {
        return IdMau;
    }

    public void setIdMau(String IdMau) {
        this.IdMau = IdMau;
    }

    public String getIdKichCo() {
        return IdKichCo;
    }

    public void setIdKichCo(String IdKichCo) {
        this.IdKichCo = IdKichCo;
    }

    public String getIdChatLieu() {
        return IdChatLieu;
    }

    public void setIdChatLieu(String IdChatLieu) {
        this.IdChatLieu = IdChatLieu;
    }

    public String getIdKieuDang() {
        return IdKieuDang;
    }

    public void setIdKieuDang(String IdKieuDang) {
        this.IdKieuDang = IdKieuDang;
    }

    public String getIdCuaHang() {
        return IdCuaHang;
    }

    public void setIdCuaHang(String IdCuaHang) {
        this.IdCuaHang = IdCuaHang;
    }

    public String getIdNhaCungCap() {
        return IdNhaCungCap;
    }

    public void setIdNhaCungCap(String IdNhaCungCap) {
        this.IdNhaCungCap = IdNhaCungCap;
    }

    @Override
    public String toString() {
        return "SanPhamView{" + "Id=" + Id + ", MaSP=" + MaSP + ", Ten=" + Ten + ", Mota=" + Mota + ", NgaySanXuat=" + NgaySanXuat + ", GiaBan=" + GiaBan + ", SoLuong=" + SoLuong + ", TrangThai=" + TrangThai + ", IdLoai=" + IdLoai + ", IdHang=" + IdHang + ", IdMau=" + IdMau + ", IdKichCo=" + IdKichCo + ", IdChatLieu=" + IdChatLieu + ", IdKieuDang=" + IdKieuDang + ", IdCuaHang=" + IdCuaHang + ", IdNhaCungCap=" + IdNhaCungCap + '}';
    }

}
