/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceIplm;

import DomainModels.SanPhamModel;
import Repository.SanPhamRepository;
import ServiceITF.SanPhamITF;
import ViewModels.SanPhamView;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class SanPhamSevice implements SanPhamITF {

    private SanPhamRepository sanphamList;

    public SanPhamSevice() {
        sanphamList = new SanPhamRepository();
    }

    @Override
    public List<SanPhamView> select() {
        List<SanPhamView> listSp = new ArrayList<>();
        try {
            List<SanPhamModel> sp = sanphamList.select();
            for (SanPhamModel sanPhamModel : sp) {
                SanPhamView spview = new SanPhamView(
                        sanPhamModel.getMaSP(),
                        sanPhamModel.getTenCuaHang(),
                        sanPhamModel.getTenNhaCungCap(),
                        sanPhamModel.getTen(),
                        sanPhamModel.getTenLoai(),
                        sanPhamModel.getTenHang(),
                        sanPhamModel.getTenMau(),
                        sanPhamModel.getTenKichCo(),
                        sanPhamModel.getTenChatLieu(),
                        sanPhamModel.getTenKieuDang(),
                        sanPhamModel.getMota(),
                        sanPhamModel.getNgaySanXuat(),
                         sanPhamModel.getGiaNhap(),
                        sanPhamModel.getGiaBan(),
                        sanPhamModel.getSoLuong(),
                        sanPhamModel.getTrangThai(sanPhamModel.getSoLuong())
                );
                listSp.add(spview);
            }

        } catch (Exception e) {
        }
        return listSp;
    }

    public List<SanPhamModel> select1() {
        try {
            return sanphamList.select();
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public List<SanPhamModel> selectTimKiem(String Ma) {
        try {
            return sanphamList.select1(Ma);
        } catch (Exception e) {
            return null;
        }
    }

// 

    public List<SanPhamModel> insert(String MaSP, String MaCH, String MaNCC, String Ten, String Loai, String Hang, String Mau, String KichCo, String ChatLieu, String KieuDang, String Mota, String NgaySanXuat, int GiaNhap, int GiaBan, int SoLuong) {
       try {
            return sanphamList.insert(MaSP, MaCH, MaNCC, Ten, Loai, Hang, Mau, KichCo, ChatLieu, KieuDang, Mota, NgaySanXuat, GiaNhap, GiaBan, SoLuong);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<SanPhamModel> update(String MaSP, String MaCH, String MaNCC, String Ten, String Loai, String Hang, String Mau, String KichCo, String ChatLieu, String KieuDang, String Mota, String NgaySanXuat, int GiaNhap, int GiaBan, int SoLuong) {
      try {
            return sanphamList.update(MaSP, MaCH, MaNCC, Ten, Loai, Hang, Mau, KichCo, ChatLieu, KieuDang, Mota, NgaySanXuat, GiaNhap, GiaBan, SoLuong);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<SanPhamModel> selectLoc(Integer GiaBan1, Integer GiaBan2) {
       try {
            return sanphamList.selectLoc(GiaBan1, GiaBan2);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<SanPhamModel> delete(String Ma) {
     try {
            return sanphamList.delete(Ma);
        } catch (Exception e) {
            return null;
        }
    }


}
