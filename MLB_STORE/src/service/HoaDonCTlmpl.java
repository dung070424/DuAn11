/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.raven.event.HoaDonCTService;

import java.util.List;

import model.HoaDonCT;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author Admin
 */
public class HoaDonCTlmpl implements HoaDonCTService {

    List<HoaDonCT> listHDCT = new ArrayList<>();

    @Override
    public List<HoaDonCT> getHoaDonCTAll(int idHD) {
        listHDCT.clear();
        try {
            String sql = "SELECT hd.ID_HoaDon, \n"
                    + "       sp.TenSP, \n"
                    + "       ct.GiaBan, \n"
                    + "       ct.SoLuong, \n"
                    + "       ct.Tongtien \n"
                    + "FROM HoaDonCT ct\n"
                    + "JOIN HoaDon hd ON ct.ID_HoaDon = hd.ID_Hoadon\n"
                    + "JOIN SanPham sp ON ct.ID_SanPham = sp.ID_SanPham;";
            Connection conn = DBConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                HoaDonCT hdct = new HoaDonCT();
                hdct.setId_HD(rs.getInt("ID_HoaDon"));
                hdct.setTenSP(rs.getString("TenSP"));
                hdct.setGiaban(rs.getInt("GiaBan"));
                hdct.setSoLuong(rs.getInt("SoLuong"));
                hdct.setTongTien(rs.getInt("TongTien"));
                listHDCT.add(hdct);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHDCT;
    }

    @Override
    public void addHoaDonCT(HoaDonCT hdct) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDonCT> getSanPhamTonTai(int idHD, int idSP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void gopSanPhamTonTai(int idHDCT, int soLuongMua, int TongTien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDonCT getRowHDCT(int row) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteHDCT(int idHDCT) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
