/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.Hang;

/**
 *
 * @author Kien
 */
public class HangViewModel {

    private String id;
    private String maH;
    private String tenH;

    public HangViewModel() {
    }

    public HangViewModel(String id, String maH, String tenH) {
        this.id = id;
        this.maH = maH;
        this.tenH = tenH;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaH() {
        return maH;
    }

    public void setMaH(String maH) {
        this.maH = maH;
    }

    public String getTenH() {
        return tenH;
    }

    public void setTenH(String tenH) {
        this.tenH = tenH;
    }

    public Object[] toRowData() {
        return new Object[]{id, maH, tenH};
    }
}
