/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceITF;

import DomainModels.DangNhap;
import Repository.TaiKhoanRepository;
import java.util.List;

/**
 *
 * @author fptshop
 */
public class DangNhapSevice implements DangNhanITF{
private TaiKhoanRepository dn = new TaiKhoanRepository();
    @Override
    public boolean XacThuc(String tk, String mk) {
       DangNhap xt = dn.xacthuctk(tk);
        if (xt!=null) {
            return xt.getMatKhau().equalsIgnoreCase(mk);
        }
        return false;
    }
    
}
