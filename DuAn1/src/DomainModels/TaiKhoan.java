/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;

/**
 *
 * @author vitam
 */
public class TaiKhoan {
    String maTK;
    String maCV;
    String taiKhoan;
    String email;
    String sdt;
    String matKhau;

    public TaiKhoan() {
    }

    public TaiKhoan(String maTK, String maCV, String taiKhoan, String email, String sdt, String matKhau) {
        this.maTK = maTK;
        this.maCV = maCV;
        this.taiKhoan = taiKhoan;
        this.email = email;
        this.sdt = sdt;
        this.matKhau = matKhau;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "maTK=" + maTK + ", maCV=" + maCV + ", taiKhoan=" + taiKhoan + ", email=" + email + ", sdt=" + sdt + ", matKhau=" + matKhau + '}';
    }
     public Object[] data(){
         return new Object[]{maTK,maCV,sdt,taiKhoan,matKhau,email};
     }
    
}
