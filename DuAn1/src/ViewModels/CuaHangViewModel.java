/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author Kien
 */
public class CuaHangViewModel {

    private String id;
    private String maCh;
    private String tenCh;
    private String diaChi;
    private String thanhPho;

    public CuaHangViewModel() {
    }

    public CuaHangViewModel(String id, String maCh, String tenCh, String diaChi, String thanhPho) {
        this.id = id;
        this.maCh = maCh;
        this.tenCh = tenCh;
        this.diaChi = diaChi;
        this.thanhPho = thanhPho;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaCh() {
        return maCh;
    }

    public void setMaCh(String maCh) {
        this.maCh = maCh;
    }

    public String getTenCh() {
        return tenCh;
    }

    public void setTenCh(String tenCh) {
        this.tenCh = tenCh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public Object[] toRowDaTa() {
        return new Object[]{id, maCh, tenCh, diaChi, thanhPho};
    }
}
