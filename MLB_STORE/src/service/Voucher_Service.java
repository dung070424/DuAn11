/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;

import model.Voucher;

import java.sql.*;
import java.util.ArrayList;

import model.NhanVien;

/**
 * @author Admin
 */
public class Voucher_Service {
    private List<Voucher> listVC;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public List<Voucher> getAll() {
        listVC = new ArrayList<>();
        sql = "  select MaVoucher, TenVoucher, NgayBatDau, NgayKetThuc, TiLeGiam, SoLuong, DonHangToiThieu, GiamToiDa, TrangThai from Voucher ";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Voucher vc = new Voucher(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getInt(6),
                        rs.getFloat(7), rs.getFloat(8), rs.getString(9)
                );
                listVC.add(vc);
            }
            return listVC;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int insertVC(Voucher vc) {
        int kq = 0;
        sql = "INSERT INTO Voucher (MaVoucher, TenVoucher, NgayBatDau, NgayKetThuc, TiLeGiam, SoLuong, DonHangToiThieu, GiamToiDa, TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, vc.getMa());
            ps.setString(2, vc.getTen());
            ps.setString(3, vc.getNgaybd());
            ps.setString(4, vc.getNgaykt());
            ps.setFloat(5, vc.getTlgiam());
            ps.setInt(6, vc.getSoluong());
            ps.setFloat(7, vc.getDhtoithieu());
            ps.setFloat(8, vc.getGiamtoida());
            ps.setString(9, vc.getTrangthai());
            kq = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            kq = 0;
        }
        return kq;
    }

    public boolean isMaVoucher(String ma) {
        con = DBConnect.getConnection();
        sql = " select count(*) from Voucher where MaVoucher like ?";
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

    public int updateVC(Voucher vc) {
        int kq = 0;
        sql = "update Voucher set TenVoucher = ?, NgayBatDau = ?, NgayKetThuc = ?, TiLeGiam = ?, SoLuong = ?, DonHangToiThieu = ?, GiamToiDa = ?, TrangThai = ? where MaVoucher like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(9, vc.getMa());
            ps.setString(1, vc.getTen());
            ps.setString(2, vc.getNgaybd());
            ps.setString(3, vc.getNgaykt());
            ps.setFloat(4, vc.getTlgiam());
            ps.setInt(5, vc.getSoluong());
            ps.setFloat(6, vc.getDhtoithieu());
            ps.setFloat(7, vc.getGiamtoida());
            ps.setString(8, vc.getTrangthai());
            kq = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            kq = 0;
        }
        return kq;
    }

    public List<Voucher> locTT(String trangthai) {
        listVC = new ArrayList<>();
        con = DBConnect.getConnection();
        sql = "select MaVoucher, TenVoucher, NgayBatDau, NgayKetThuc, TiLeGiam, SoLuong, DonHangToiThieu, GiamToiDa, TrangThai from Voucher where TrangThai like ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, trangthai);
            rs = ps.executeQuery();
            while (rs.next()) {
                Voucher vc = new Voucher(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getInt(6),
                        rs.getFloat(7), rs.getFloat(8), rs.getString(9)
                );
                listVC.add(vc);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listVC;
    }

}
