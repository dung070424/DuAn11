/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raven.event;

import java.util.List;

import model.HoaDonCT;

/**
 * @author Admin
 */
public interface HoaDonCTService {
    List<HoaDonCT> getHoaDonCTAll(int idHD);

    void addHoaDonCT(HoaDonCT hdct);

    List<HoaDonCT> getSanPhamTonTai(int idHD, int idSP);

    void gopSanPhamTonTai(int idHDCT, int soLuongMua, int TongTien);

    HoaDonCT getRowHDCT(int row);

    void deleteHDCT(int idHDCT);
}
