/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiceITF;

import java.util.List;
import ViewModels.CuaHangViewModel;
import DomainModels.CuaHang;
import java.util.ArrayList;

/**
 *
 * @author Kien
 */
public interface CuaHangService {

    List<CuaHangViewModel> getAll();

    Boolean insert(CuaHang ch);

    ArrayList<String> getListMaCH();

    Boolean xoa(String maCH);
   
    Boolean sua (CuaHang x, String maCH);
}
