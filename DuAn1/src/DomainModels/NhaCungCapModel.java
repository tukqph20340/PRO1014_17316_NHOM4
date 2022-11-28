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
public class NhaCungCapModel {
    private String MaNCC;
    private String tenNCC;
    private String diaChi;
    private String Sdt;

    public NhaCungCapModel() {
    }

    public NhaCungCapModel(String MaNCC, String tenNCC, String diaChi, String Sdt) {
        this.MaNCC = MaNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.Sdt = Sdt;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }
    public Object[] data(){
        return new Object[]{MaNCC,tenNCC,diaChi,Sdt};
    }
}
