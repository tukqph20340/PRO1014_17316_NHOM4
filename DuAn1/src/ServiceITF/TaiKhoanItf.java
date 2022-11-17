/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceITF;

import DomainModels.TaiKhoan;
import ViewModels.TaiKhoanView;
import java.util.List;

/**
 *
 * @author vitam
 */
public interface TaiKhoanItf {
    public List<TaiKhoanView> getallTaiKhoan();
     public String addTK(TaiKhoan tk);
      public String XoaTK(TaiKhoan tk);
       public String SuaTK(TaiKhoan tk);
}
