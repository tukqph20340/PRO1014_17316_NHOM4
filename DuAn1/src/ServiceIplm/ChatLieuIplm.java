/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceIplm;

import DomainModels.ChatLieu;
import Repository.ChatLieuRepository;
import ServiceITF.IChatLieuService;
import ViewModels.ChatLieuViewModel;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ChatLieuIplm implements IChatLieuService {

    private ChatLieuRepository repo=new ChatLieuRepository();

    @Override
    public ArrayList<ChatLieuViewModel> getList() {
        ArrayList<ChatLieuViewModel> listVM = new ArrayList<>();
        ArrayList<ChatLieu> listDM = repo.getlistChatLieu();
        try {
            for (ChatLieu x : listDM) {
                ChatLieuViewModel y = new ChatLieuViewModel();
                y.setId(x.getId());
                y.setMaChatLieu(x.getMaChatLieu());
                y.setTenChatLieu(x.getTenChatLieu());
                listVM.add(y);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listVM;
    }

    @Override
    public Boolean them(ChatLieu cl) {
        return repo.them(cl);

    }

    @Override
    public Boolean sua(ChatLieu cl, String maCL) {
        return repo.sua(cl, maCL);
    }

    @Override
    public Boolean xoa(String maCL) {
        return repo.xoa(maCL);
    }

    @Override
    public ArrayList<String> getListMaCL() {
        return repo.getlistMaCL();
    }

    @Override
    public ArrayList<ChatLieu> tim(String maCL) {
        return repo.tim(maCL);
    }

}
