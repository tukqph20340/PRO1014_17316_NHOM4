/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiceITF;

import DomainModels.KichCo;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface KichCoImpl {

    public List<KichCo> select();

    public List<KichCo> getOne(String maKC);
    
    public List<KichCo> fina();

    public List<KichCo> them(String MaKC, String TenKC);

    public List<KichCo> sua(String MaKC, String TenKC);

    public List<KichCo> xoa(String MaKC);
}
