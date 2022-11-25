/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceIplm;

import DomainModels.KichCo;
import Repository.KichCoRepository;
import ServiceITF.KichCoImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class KichCoService implements KichCoImpl {

    private KichCoRepository kclist = new KichCoRepository();

    @Override
    public List<KichCo> select() {
        try {
            List<KichCo> kc = kclist.select();
            List<KichCo> list = new ArrayList<>();
            for (KichCo kichCo : kc) {
                KichCo KC1 = new KichCo(
                        kichCo.getMaKC(),
                        kichCo.getTenKC());
                list.add(KC1);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi Service");
            return null;
        }
    }

    @Override
    public List<KichCo> getOne(String maKC) {
        try {
            JOptionPane.showMessageDialog(null, "Get thành công");
            return kclist.getOne(maKC);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<KichCo> fina() {
        try {
            return kclist.select();
        } catch (Exception e) {
            return null;
        }
    }
    
    

    @Override
    public List<KichCo> them(String MaKC, String TenKC) {
        try {
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return kclist.them(MaKC, TenKC);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<KichCo> sua(String MaKC, String TenKC) {
        try {
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            return kclist.sua(MaKC, TenKC);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<KichCo> xoa(String MaKC) {
        try {
            JOptionPane.showMessageDialog(null, "Xoá thành công");
            return kclist.xoa(MaKC);
        } catch (Exception e) {
            return null;
        }
    }

}
