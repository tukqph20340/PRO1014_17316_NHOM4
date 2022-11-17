/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.ArrayList;
import java.util.List;
import DomainModels.DienThoai;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Kien
 */
public class DienThoaiRepository {

    public List<DienThoai> getAll() {
        String query = "select * from DienThoai";
        List<DienThoai> list = new ArrayList<>();
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DienThoai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int insert(DienThoai dt) {
        String query = "INSERT INTO [dbo].[DienThoai]\n"
                + "           ([MaDt]\n"
                + "           ,[MaCH]\n"
                + "           ,[Ten]\n"
                + "           ,[Loai]\n"
                + "           ,[Hang]\n"
                + "           ,[Mau]\n"
                + "           ,[NgaySanXuat]\n"
                + "           ,[NgayXuatBan]\n"
                + "           ,[SoLuong]\n"
                + "           ,[TrangThai]\n"
                + "           ,[Gia]\n"
                + "           ,[Ram]\n"
                + "           ,[HeDieuHanh]\n"
                + "           ,[ChipSuLy]\n"
                + "           ,[CPU])\n";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, dt.getMaDt());
            ps.setObject(2, dt.getMaCh());
            ps.setObject(3, dt.getTen());
            ps.setObject(4, dt.getLoai());
            ps.setObject(5, dt.getHang());
            ps.setObject(6, dt.getMau());
            ps.setObject(7, dt.getNgaySanXuat());
            ps.setObject(8, dt.getNgayXuatBan());
            ps.setObject(9, dt.getSoLuong());
            ps.setObject(10, dt.getTrangThai());
            ps.setObject(11, dt.getGia());
            ps.setObject(12, dt.getRam());
            ps.setObject(13, dt.getHeDieuHanh());
            ps.setObject(14, dt.getChipSuLy());
            ps.setObject(15, dt.getCpu());
            if (ps.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
        }
        return -1;
    }

    public int update(DienThoai dt) {
        String query = "UPDATE [dbo].[DienThoai]\n"
                + "      ,[MaCH] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[Loai] = ?\n"
                + "      ,[Hang] =?\n"
                + "      ,[Mau] = ?\n"
                + "      ,[NgaySanXuat] = ?\n"
                + "      ,[NgayXuatBan] = ?\n"
                + "      ,[SoLuong] = ?\n"
                + "      ,[TrangThai] = ?\n"
                + "      ,[Gia] = ?\n"
                + "      ,[Ram] =?\n"
                + "      ,[HeDieuHanh] =?\n"
                + "      ,[ChipSuLy] =?\n"
                + "      ,[CPU] = ?\n"
                + " WHERE MaDt = ? ";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(15, dt.getMaDt());
            ps.setObject(1, dt.getMaCh());
            ps.setObject(2, dt.getTen());
            ps.setObject(3, dt.getLoai());
            ps.setObject(4, dt.getHang());
            ps.setObject(5, dt.getMau());
            ps.setObject(6, dt.getNgaySanXuat());
            ps.setObject(7, dt.getNgayXuatBan());
            ps.setObject(8, dt.getSoLuong());
            ps.setObject(9, dt.getTrangThai());
            ps.setObject(10, dt.getGia());
            ps.setObject(11, dt.getRam());
            ps.setObject(12, dt.getHeDieuHanh());
            ps.setObject(13, dt.getChipSuLy());
            ps.setObject(14, dt.getCpu());
            if (ps.executeUpdate() > 0) {
                return 1;
            }

        } catch (Exception e) {
        }
        return -1;
    }

    public int delete(String madt) {
        String query = "DELETE FROM [dbo].[DienThoai]\n"
                + "      WHERE MaDt = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, madt);
            if (ps.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
