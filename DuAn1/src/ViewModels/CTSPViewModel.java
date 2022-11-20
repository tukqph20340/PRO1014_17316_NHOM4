/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

/**
 *
 * @author pc
 */
public class CTSPViewModel {

    private String mactsp;
    private String madt;
    private String mota;
    private String soluong;
    private String gianhap;
    private String giaban;

    public CTSPViewModel() {
    }

    public CTSPViewModel(String mactsp, String madt, String mota, String soluong, String gianhap, String giaban) {
        this.mactsp = mactsp;
        this.madt = madt;
        this.mota = mota;
        this.soluong = soluong;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    public String getMactsp() {
        return mactsp;
    }

    public void setMactsp(String mactsp) {
        this.mactsp = mactsp;
    }

    public String getMadt() {
        return madt;
    }

    public void setMadt(String madt) {
        this.madt = madt;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getGianhap() {
        return gianhap;
    }

    public void setGianhap(String gianhap) {
        this.gianhap = gianhap;
    }

    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

}
