/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seviceplm;

import DomainModels.DangNhap;
import Repository.DangNhapRepository;

/**
 *
 * @author fptshop
 */
public class DangNhapSevice {

    private DangNhapRepository dn = new DangNhapRepository();

    public boolean dangNhap(String tk, String mk) {
        DangNhap acc = dn.xacthuc(tk);
        if (acc != null) {
            return acc.getMatKhau().equalsIgnoreCase(mk);
        }
        return false;
    }

    public boolean dangNhap(String tk, String mk, String chucVu) {
        DangNhap xttk = dn.xacthuc(tk);
        boolean acc = dangNhap(tk, mk);
        if (acc != false) {
            return xttk.getChucVu().equalsIgnoreCase(chucVu);
        }
        return false;
    }
}
