/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiceITF;

import DomainModels.ChucVu;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ChucVuImpl {

    public List<ChucVu> select();

    public List<ChucVu> getOne(String macv);

    public List<ChucVu> fina();

    public List<ChucVu> them(String MaCV, String TenCV);

    public List<ChucVu> sua(String MaCV, String TenCV);

    public List<ChucVu> xoa(String MaCV);
}
