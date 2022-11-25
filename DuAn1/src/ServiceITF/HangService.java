/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiceITF;

import DomainModels.CuaHang;
import ViewModels.HangViewModel;
import DomainModels.Hang;
import ViewModels.HangViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kien
 */
public interface HangService {

    List<HangViewModel> getAll();

    Boolean insert(Hang ch);

    ArrayList<String> getListMaCH();

    Boolean xoa(String maH);

    Boolean sua(Hang x, String maH);
}
