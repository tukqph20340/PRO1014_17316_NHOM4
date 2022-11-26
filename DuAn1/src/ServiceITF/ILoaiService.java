/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceITF;

import DomainModels.ChatLieu;
import DomainModels.Loai;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface ILoaiService {

    ArrayList<Loai> getListLoai();

    Boolean them(Loai x);

    Boolean sua(Loai x, String maL);

    Boolean xoa(String maL);

    ArrayList<String> getListMaL();

    ArrayList<Loai> tim(String maL);
}
