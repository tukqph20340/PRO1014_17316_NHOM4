/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceIplm;

import DomainModels.Nhacungcap_model;
import Repository.Reponsitory_Nhacc;
import ServiceITF.Interface;
import ViewModel.NhaCC;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vitam
 */
public class NhaCungCap_Ser implements Interface {

    Reponsitory_Nhacc res = new Reponsitory_Nhacc();

    public List<Nhacungcap_model> fina() {
        try {
            return res.getAllFormNhaCC();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String AddFormNhaCC(Nhacungcap_model nc) {
        try {
            return res.AddFormNhaCC(nc);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String UpdateFormNhaCC(Nhacungcap_model nc) {
        try {
            return res.UpdateFormNhaCC(nc);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public String DeleteFormNhaCC(Nhacungcap_model nc) {
        try {
            return res.DeleteFormNhaCC(nc);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Nhacungcap_model> getAllFormNhaCC() {
        try {
            List<Nhacungcap_model> kh = res.getAllFormNhaCC();
            List<NhaCC> list = new ArrayList<>();
            for (Nhacungcap_model nhacungcap_model : kh) {
                NhaCC k1 = new NhaCC(
                        nhacungcap_model.getId(),
                        nhacungcap_model.getMaCC(),
                        nhacungcap_model.getTenCC(),
                        nhacungcap_model.getDiaChi(),
                        nhacungcap_model.getSdt()
                );
                list.add(k1);
            }
            return kh;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi");
            return null;
        }
    }

}
