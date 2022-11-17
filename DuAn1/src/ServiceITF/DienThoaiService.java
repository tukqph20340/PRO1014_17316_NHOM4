/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiceITF;

import DomainModels.DienThoai;
import java.util.List;

/**
 *
 * @author Kien
 */
public interface DienThoaiService {

    List<DienThoai> getAll();

    List<DienThoai> insertDienThoai(List<DienThoai> list, DienThoai dt);

    List<DienThoai> updateDienThoai(List<DienThoai> list, DienThoai dt);

    List<DienThoai> deleteDienThoai(List<DienThoai> list, String madt);
}
