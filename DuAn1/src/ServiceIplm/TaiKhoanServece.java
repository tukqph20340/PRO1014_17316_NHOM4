/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceIplm;

import DomainModels.KhachHang;
import DomainModels.TaiKhoan;
import Repository.TaiKhoan_Respository;
import ServiceITF.TaiKhoanItf;
import ViewModels.TaiKhoanView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vitam
 */
public class TaiKhoanServece implements TaiKhoanItf {

    TaiKhoan_Respository tkak;

    public TaiKhoanServece() {
        tkak = new TaiKhoan_Respository();
    }

    @Override
    public List<TaiKhoanView> getallTaiKhoan() {
        try {
            List<TaiKhoan> list = tkak.getallTaiKhoan();
            List<TaiKhoanView> listTK = new ArrayList<>();
            for (TaiKhoan taiKhoan : list) {
                TaiKhoanView k1 = new TaiKhoanView(
                        taiKhoan.getMaTK(),
                        taiKhoan.getMaCV(),
                        taiKhoan.getSdt(),
                        taiKhoan.getTaiKhoan(),
                        taiKhoan.getMatKhau(),
                        taiKhoan.getEmail()
                );
                listTK.add(k1);
            }
            return listTK;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi service");
            return null;
        }

    }

    public List<TaiKhoan> fina() {
        try {
            return tkak.getallTaiKhoan();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String addTK(TaiKhoan tk) {
        try {
            return tkak.addTK(tk);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String XoaTK(TaiKhoan tk) {
        try {
            return tkak.XoaTK(tk);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String SuaTK(TaiKhoan tk) {
        try {
            return tkak.SuaTK(tk);
        } catch (Exception e) {
            return null;
        }
    }

}
