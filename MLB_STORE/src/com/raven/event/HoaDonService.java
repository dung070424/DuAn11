/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raven.event;

import java.util.List;

import model.HoaDon;

/**
 * @author Admin
 */
public interface HoaDonService {
    List<HoaDon> getHoaDonAll();

    HoaDon getRowHD(int row);

    void addHoaDon(HoaDon hd);

    void upDateHoaDon(HoaDon hd);
}
