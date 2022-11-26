/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceIplm;

import DomainModels.ChucVu;
import Repository.ChucVuRepository;
import ServiceITF.ChucVuImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class ChucVuService implements ChucVuImpl {

    private ChucVuRepository cvlist = new ChucVuRepository();

    @Override
    public List<ChucVu> select() {
        try {
            List<ChucVu> cv = cvlist.select();
            List<ChucVu> list = new ArrayList<>();
            for (ChucVu chucVu : cv) {
                ChucVu cv1 = new ChucVu(
                        chucVu.getMaCV(),
                        chucVu.getTenCV());
                list.add(cv1);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi Service");
            return null;
        }
    }

    @Override
    public List<ChucVu> getOne(String macv) {
        try {
            JOptionPane.showMessageDialog(null, "Get thành công");
            return cvlist.getOne(macv);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<ChucVu> fina() {
        try {
            return cvlist.select();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<ChucVu> them(String MaCV, String TenCV) {
        try {
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            return cvlist.them(MaCV, TenCV);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<ChucVu> sua(String MaCV, String TenCV) {
        try {
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            return cvlist.sua(MaCV, TenCV);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<ChucVu> xoa(String MaCV) {
        try {
            JOptionPane.showMessageDialog(null, "Xoá thành công");
            return cvlist.xoa(MaCV);
        } catch (Exception e) {
            return null;
        }
    }

}
