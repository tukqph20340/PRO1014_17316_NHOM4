/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceIplm;

import DomainModels.TaiKhoan;
import Repository.TaiKhoan_Respository;
import java.util.List;

/**
 *
 * @author vitam
 */
public class TaiKhoanServece {
    TaiKhoan_Respository tkak;

    public TaiKhoanServece() {
        tkak = new TaiKhoan_Respository();
    }
    
    
    public List<TaiKhoan> getall(){
        return tkak.getallTaiKhoan();
    }
    public String add(TaiKhoan tk){
        return tkak.addTK(tk);
    }
     public String delete(TaiKhoan tk){
        return tkak.XoaTK(tk);
    }
      public String update(TaiKhoan tk){
        return tkak.SuaTK(tk);
    }
}
