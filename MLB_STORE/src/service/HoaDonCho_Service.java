/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.HoaDonCho;
import model.NhanVien;

/**
 * @author Admin
 */
public class HoaDonCho_Service {
    private List<HoaDonCho> listHDC;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public List<HoaDonCho> getAll() {
        listHDC = new ArrayList<>();
        sql = "select MaHD, ID_NhanVien, NgayTao, TrangThai from HoaDon";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonCho hdc = new HoaDonCho(
                        rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                );
                listHDC.add(hdc);
            }
            return listHDC;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int insertHDC(HoaDonCho hdc) {
        int kq = 0;
        sql = "insert into HoaDon (MaHD, ID_NhanVien, NgayTao, TrangThai) values (?,?,getDate(),?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, hdc.getMa());
            ps.setString(2, hdc.getTenNV());

            ps.setString(4, "Chưa thanh toán");
            kq = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            kq = 0;
        }
        return kq;
    }

    public boolean isMaHD(String ma) {
        con = DBConnect.getConnection();
        sql = " select count(*) from HoaDon where MaHD like ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
