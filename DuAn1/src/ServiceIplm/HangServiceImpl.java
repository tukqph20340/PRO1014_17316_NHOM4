/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceIplm;

import DomainModels.CuaHang;
import ServiceITF.HangService;
import ViewModels.HangViewModel;
import java.util.List;
import Repository.HangRepository;
import java.util.ArrayList;
import DomainModels.Hang;

/**
 *
 * @author Kien
 */
public class HangServiceImpl implements HangService {

    private HangRepository repos = new HangRepository();

    @Override
    public List<HangViewModel> getAll() {
        List<HangViewModel> list = new ArrayList<>();
        List<Hang> listss = repos.getAll();
        for (Hang s : listss) {
            HangViewModel model = new HangViewModel();
            model.setId(s.getId());
            model.setMaH(s.getMaH());
            model.setTenH(s.getTenH());
            list.add(model);
        }
        return list;
    }

    @Override
    public Boolean insert(Hang ch) {
        return repos.them(ch);
    }

    @Override
    public ArrayList<String> getListMaCH() {
       return repos.getlistMaCH();
    }

    @Override
    public Boolean xoa(String maH) {
        return repos.xoa(maH);
    }

    @Override
    public Boolean sua(Hang x, String maCH) {
        return repos.sua(x, maCH);
    }
}
