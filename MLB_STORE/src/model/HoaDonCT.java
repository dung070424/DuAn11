/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * @author Admin
 */
public class HoaDonCT {
    int id_HD, id_SP, giaban, soLuong, tongTien;
    String tenSP;

    public HoaDonCT() {
    }

    public HoaDonCT(int id_HD, int giaban, int soLuong, int tongTien, String tenSP) {
        this.id_HD = id_HD;
        this.giaban = giaban;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.tenSP = tenSP;
    }


    public HoaDonCT(int id_HD, int id_SP, int giaban, int soLuong, int tongTien, String tenSP) {
        this.id_HD = id_HD;
        this.id_SP = id_SP;
        this.giaban = giaban;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.tenSP = tenSP;
    }


    public int getId_HD() {
        return id_HD;
    }

    public void setId_HD(int id_HD) {
        this.id_HD = id_HD;
    }

    public int getId_SP() {
        return id_SP;
    }

    public void setId_SP(int id_SP) {
        this.id_SP = id_SP;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }


}
