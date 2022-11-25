/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceIplm;

import DomainModels.CuaHang;
import ServiceITF.CuaHangService;
import ViewModels.CuaHangViewModel;
import DomainModels.CuaHang;
import Repository.CuaHangRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kien
 */
public class CuaHangServiceImpl implements CuaHangService {

    private CuaHangRepository rep = new CuaHangRepository();

    @Override
    public List<CuaHangViewModel> getAll() {
        List<CuaHangViewModel> list = new ArrayList<>();
        List<CuaHang> listss = rep.getAll();
        for (CuaHang s : listss) {
            CuaHangViewModel model = new CuaHangViewModel();
            model.setId(s.getId());
            model.setMaCh(s.getMaCh());
            model.setTenCh(s.getTenCh());
            model.setDiaChi(s.getDiaChi());
            model.setThanhPho(s.getThanhPho());
            list.add(model);
        }
        return list;
    }

    @Override
    public Boolean insert(CuaHang ch) {
        return rep.them(ch);
    }

    @Override
    public ArrayList<String> getListMaCH() {
        return rep.getlistMaCH();
    }

    @Override
    public Boolean xoa(String maCH) {
        return rep.xoa(maCH);
    }

    @Override
    public Boolean sua(CuaHang x, String maCH) {
        return rep.sua(x, maCH);
    }

}
