/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceITF;

import DomainModels.ChatLieu;
import ViewModels.ChatLieuViewModel;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IChatLieuService {
    ArrayList<ChatLieuViewModel> getList();

    Boolean them(ChatLieu ch);

    Boolean sua(ChatLieu cl, String maCL);

    Boolean xoa(String maCL);
    
    ArrayList<String> getListMaCL();
    
    ArrayList<ChatLieu> tim(String maCL);
}
