/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class KichCo {
    String maKC;
    String tenKC;

    public KichCo() {
    }

    public KichCo(String maKC, String tenKC) {
        this.maKC = maKC;
        this.tenKC = tenKC;
    }

    public String getMaKC() {
        return maKC;
    }

    public void setMaKC(String maKC) {
        this.maKC = maKC;
    }

    public String getTenKC() {
        return tenKC;
    }

    public void setTenKC(String tenKC) {
        this.tenKC = tenKC;
    }

    @Override
    public String toString() {
        return "KichCo{" + "maKC=" + maKC + ", tenKC=" + tenKC + '}';
    }
    
    
}
