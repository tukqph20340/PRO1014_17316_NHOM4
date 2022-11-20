/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiceITF;

import java.util.List;
import DomainModels.hoadon;
/**
 *
 * @author Admin
 */
public interface hoadonservice {
      List<hoadon> getall();

    hoadon getone(String maHD);

    String add(hoadon hd);

    String update(hoadon hd, String MaHD);

    String delete(String MaHD);
}
