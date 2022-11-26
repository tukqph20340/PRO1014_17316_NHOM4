/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

/**
 *
 * @author vitam
 */
public class NhaCC {
      private String id;
    private String maCC;
    private String tenCC;
    private String diaChi;
    private String sdt;

    public NhaCC() {
    }

    public NhaCC(String id, String maCC, String tenCC, String diaChi, String sdt) {
        this.id = id;
        this.maCC = maCC;
        this.tenCC = tenCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public NhaCC(String maCC, String tenCC, String diaChi, String sdt) {
        this.maCC = maCC;
        this.tenCC = tenCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaCC() {
        return maCC;
    }

    public void setMaCC(String maCC) {
        this.maCC = maCC;
    }

    public String getTenCC() {
        return tenCC;
    }

    public void setTenCC(String tenCC) {
        this.tenCC = tenCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public Object[] data(){
        return new Object[]{id,maCC,tenCC,diaChi,sdt};
    }
}
