/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceITF;

import DomainModels.DienThoaiChiTiet;
import ViewModels.CTSPViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public interface CTSPService {

 public String themCTSP(DienThoaiChiTiet dienThoaiChiTiet);
public ArrayList<CTSPViewModel> getDsCTSP();

    
}
