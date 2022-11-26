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
                        sanPhamModel.getId(),
                        sanPhamModel.getMaSP(),
                        sanPhamModel.getTenCuaHang(),
                        sanPhamModel.getTenNhaCungCap(),
                        sanPhamModel.getTen(),
                        sanPhamModel.getTenLoai(),
                        sanPhamModel.getTenHang(),
                        sanPhamModel.getTenMau(),
                        sanPhamModel.getTenKichCo(),
                        sanPhamModel.getTenChatLieu(),
                        sanPhamModel.getTenieuDang(),
                        sanPhamModel.getMota(),
                        sanPhamModel.getNgaySanXuat(),
                        sanPhamModel.getGiaBan(),
                        sanPhamModel.getSoLuong(),
                        sanPhamModel.getTrangThai()
                );
                listSp.add(spview);
            }

        } catch (Exception e) {
        }
        return listSp;
    }
//
//    @Override
//    public List<SanPhamModel> select1() {
//        try {
//            return sanphamList.select();
//        } catch (Exception e) {
//            return null;
//        }
//
//    }
//
    @Override
    public List<SanPhamModel> selectTimKiem(String Ma) {
        try {
            return sanphamList.select1(Ma);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<SanPhamModel> insert(String MaSP, String IdCH, String IdNCC, String Ten, String IdLoai, String IdHang, String IdMau, String IdKichCo, String IdChatLieu, String IdKieuDang, String Mota, String NgaySanXuat, Integer GiaBan, Integer SoLuong) {
        try {
            return sanphamList.insert(MaSP, IdCH, IdNCC, Ten, IdLoai, IdHang, IdMau, IdKichCo, IdChatLieu, IdKieuDang, Mota, NgaySanXuat, GiaBan, SoLuong);
        } catch (Exception e) {
            return null;
        }
    }
//
    @Override
    public List<SanPhamModel> delete(String id) {
        try {
            return sanphamList.delete(id);
        } catch (Exception e) {
            return null;
        }
    }
//
    @Override
    public List<SanPhamModel> update(String Id, String MaSP, String IdCH, String IdNCC, String Ten, String IdLoai, String IdHang, String IdMau, String IdKichCo, String IdChatLieu, String IdKieuDang, String Mota, String NgaySanXuat, int GiaBan, int SoLuong) {
        try {
            return sanphamList.update(Id, MaSP, IdCH, IdNCC, Ten, IdLoai, IdHang, IdMau, IdKichCo, IdChatLieu, IdKieuDang, Mota, NgaySanXuat, GiaBan, SoLuong);
        } catch (Exception e) {
            return null;
        }
    }
//
//    @Override
//    public List<SanPhamModel> selectLoc(String GiaThap, String Giacao) {
//        try {
//            return sanphamList.selectLoc(GiaThap, Giacao);
//        } catch (Exception e) {
//            return null;
//        }
//    }

}
