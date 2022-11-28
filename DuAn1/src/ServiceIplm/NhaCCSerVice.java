/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceIplm;

import DomainModels.NhaCungCapModel;
import Repository.NhaCungCap_Responsitory;
import ServiceITF.NhaCungCapITF;
import ViewModels.NhaCCModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vitam
 */
public class NhaCCSerVice implements NhaCungCapITF {

    NhaCungCap_Responsitory res = new NhaCungCap_Responsitory();

    @Override
    public List<NhaCungCapModel> getAllFormNhaCC() {
        try {
            List<NhaCungCapModel> list = res.getAllFormNhaCC();
            List<NhaCCModel> listNCC = new ArrayList<>();
            for (NhaCungCapModel nhaCungCapModel : list) {
                NhaCCModel model = new NhaCCModel(
                        nhaCungCapModel.getMaNCC(),
                        nhaCungCapModel.getTenNCC(),
                        nhaCungCapModel.getDiaChi(),
                        nhaCungCapModel.getSdt()
                );
                listNCC.add(model);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi service");
            return null;
        }
    }

    @Override
    public String AddFormNhaCC(NhaCungCapModel nc) {
        try {
            return res.AddFormNhaCC(nc);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<NhaCungCapModel> getAll() {
        try {
            return res.getAllFormNhaCC();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String XoaFormNhaCC(NhaCungCapModel nc) {
        try {
            return res.XoaFormNhaCC(nc);
        } catch (Exception e) {
            return null;
        }
    }


    @Override
    public String UpdateFormNhaCC(NhaCungCapModel nc) {
          try {
            return res.UpdateFormNhaCC(nc);
        } catch (Exception e) {
            return null;
        }
    }

}
