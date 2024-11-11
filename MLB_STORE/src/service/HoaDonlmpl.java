/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.raven.event.HoaDonService;

import java.util.ArrayList;
import java.util.List;

import model.HoaDon;

import java.sql.*;

/**
 * @author Admin
 */
public class HoaDonlmpl implements HoaDonService {

    List<HoaDon> listHoaDon = new ArrayList<>();

    @Override
    public List<HoaDon> getHoaDonAll() {
        listHoaDon.clear();
        try {
            String sql = "SELECT hd.ID_Hoadon, \n"
                    + "       hd.MaHD, \n"
                    + "       nv.TenNhanVien, \n"
                    + "       kh.TenKhachHang, \n"
                    + "       vc.GiamToiDa, \n"
                    + "       hd.NgayTao, \n"
                    + "       hd.TrangThai, \n"
                    + "       hd.GhiChu \n"
                    + "FROM HoaDon hd\n"
                    + "JOIN NhanVien nv ON hd.ID_NhanVien = nv.ID_Nhanvien\n"
                    + "JOIN KhachHang kh ON hd.ID_KhachHang = kh.ID_KhachHang\n"
                    + "JOIN Voucher vc ON hd.ID_Voucher = vc.ID_Voucher;";
            Connection conn = DBConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setIdHD(rs.getInt("ID_HoaDon"));
                hd.setMaHD(rs.getString("MaHD"));
                hd.setNgayTao(rs.getString("NgayTao"));
                hd.setTenNV(rs.getString("TenNhanVien"));
                hd.setTenKH(rs.getString("TenKhachHang"));
                hd.setGiamTD(rs.getString("GiamToiDa"));
                hd.setTrangThai(rs.getString("TrangThai"));
                listHoaDon.add(hd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    @Override
    public HoaDon getRowHD(int row) {
        return listHoaDon.get(row);

    }

    @Override
    public void addHoaDon(HoaDon hd) {
        try {
            String sql = "Insert into HoaDon (MaHD, ID_NhanVien, ID_KhachHang, NgayTao, TrangThai) values (?,?,?,?,?) ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getMaHD());
            ps.setInt(2, hd.getIdNV());
            ps.setInt(3, hd.getIdKH());
            ps.setString(4, hd.getNgayTao());
            ps.setString(5, hd.getTrangThai());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void upDateHoaDon(HoaDon hd) {
        try {
            String sql = "update HoaDon set ID_NhanVien = ?, ID_KhachHang = ? ,ID_Voucher = ?, NgayTao = ? , TrangThai = ? where MaHD like ?";

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
