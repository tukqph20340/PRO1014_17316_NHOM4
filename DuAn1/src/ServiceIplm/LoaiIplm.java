/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceIplm;

import DomainModels.Loai;
import Repository.LoaiRepository;
import ServiceITF.ILoaiService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class LoaiIplm implements ILoaiService{

    private LoaiRepository repo=new LoaiRepository();

    public LoaiIplm() {
    }
            
    @Override
    public ArrayList<Loai> getListLoai() {
        return repo.getListLoai();
    }

    @Override
    public Boolean them(Loai x) {
        return repo.them(x);
    }

    @Override
    public Boolean sua(Loai x, String maL) {
        return repo.sua(x, maL);
    }

    @Override
    public Boolean xoa(String maL) {
        return repo.xoa(maL);
    }

    @Override
    public ArrayList<String> getListMaL() {
        return repo.getlistMaCL();
    }

    @Override
    public ArrayList<Loai> tim(String maL) {
        return repo.tim(maL);
    }
    
}
