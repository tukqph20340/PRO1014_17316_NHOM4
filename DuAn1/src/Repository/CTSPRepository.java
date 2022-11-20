/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DomainModels.DienThoaiChiTiet;
import Repository.DBContext;
import ViewModels.CTSPViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class CTSPRepository {
   private DBContext dBcontext;

    public Boolean themCTSP(DienThoaiChiTiet dienThoaiChiTiet) {
        int checkinsert = 0;
        String sql = "insert into ChiTietSanPham(MaCTSP,MaDt,MoTa,SoLuong,GiaNhap,GiaBan) values (?,?,?,?,?,?)";
        try (Connection con = dBcontext.openDBConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, dienThoaiChiTiet.getMactsp());
            ps.setObject(2, dienThoaiChiTiet.getMadt());
            ps.setObject(3, dienThoaiChiTiet.getMota());
            ps.setObject(4, dienThoaiChiTiet.getSoluong());
            ps.setObject(5, dienThoaiChiTiet.getGianhap());
            ps.setObject(6, dienThoaiChiTiet.getGiaban());
            checkinsert = ps.executeUpdate();
            return checkinsert > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<CTSPViewModel> getDanhSachCTSP() {
        ArrayList<CTSPViewModel> list = new ArrayList<>();
        String sql = "select MaCTSP,MaDt,MoTa,SoLuong,GiaNhap,GiaBan from ChiTietSanPham";
        try (Connection con = dBcontext.openDBConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CTSPViewModel cTSPViewModel = new CTSPViewModel();
                
                cTSPViewModel.setMactsp(rs.getString(1));
                cTSPViewModel.setMadt(rs.getString(2));
                cTSPViewModel.setMota(rs.getString(3));
                cTSPViewModel.setSoluong(rs.getString(4));
                cTSPViewModel.setGianhap(rs.getString(5));
                cTSPViewModel.setGiaban(rs.getString(6));
                list.add(cTSPViewModel);
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return list;
    }
    
}
