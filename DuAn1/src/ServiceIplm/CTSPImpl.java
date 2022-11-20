/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceIplm;

import DomainModels.DienThoaiChiTiet;
import Repository.CTSPRepository;
import ServiceITF.CTSPService;
import ViewModels.CTSPViewModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class CTSPImpl implements CTSPService{
  

 private CTSPRepository cTSPRepository = new CTSPRepository();

    @Override
    public String themCTSP(DienThoaiChiTiet dienThoaiChiTiet) {
        if (dienThoaiChiTiet.getMactsp()==null) {
            return "Ten khong duoc trong";
        }
        if (dienThoaiChiTiet.getMadt()==null) {
            return "Ma khong duoc trong";
        }
        if (cTSPRepository.themCTSP(dienThoaiChiTiet)==true) {
            return "them thanh cong";
        }else{
            return "them that bai";
        }
        
    }



    @Override
    public ArrayList<CTSPViewModel> getDsCTSP() {
        return cTSPRepository.getDanhSachCTSP();
    }

}
