/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author fptshop
 */
public class DangNhap {
    private String taiKhoan;
    private String matKhau;
    private String ChucVu;

    public DangNhap() {
    }

    

    public DangNhap(String taiKhoan, String matKhau, String ChucVu) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.ChucVu = ChucVu;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }
    
    @Override
    public String toString() {
        return "DangNhap{" + "taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", ChucVu=" + ChucVu + '}';
    }
}
