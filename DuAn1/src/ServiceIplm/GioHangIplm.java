/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceIplm;

import DomainModels.GioHang;
import Repository.GioHangRepository;
import ServiceITF.GioHangITF;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class GioHangIplm implements GioHangITF{

    private GioHangRepository repo=new GioHangRepository();
    @Override
    public ArrayList<GioHang> getlistGioHang(String ma) {
        return repo.getlistGioHang(ma);
    }
    
}
