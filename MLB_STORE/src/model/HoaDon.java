/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * @author Admin
 */
public class HoaDon {
    int idHD, idNV, idKH, thanhTien;
    String maHD, ngayTao, tenNV, tenKH, giamTD, maNV, maKH, trangThai, ghiChu;

    public HoaDon() {
    }

    public HoaDon(int idHD, int thanhTien, String maHD, String ngayTao, String tenNV, String tenKH, String giamTD, String trangThai) {
        this.idHD = idHD;
        this.thanhTien = thanhTien;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.giamTD = giamTD;
        this.trangThai = trangThai;
    }

    public HoaDon(int idHD, int idNV, int idKH, int thanhTien, String maHD, String ngayTao, String tenNV, String tenKH, String giamTD, String maNV, String maKH, String trangThai, String ghiChu) {
        this.idHD = idHD;
        this.idNV = idNV;
        this.idKH = idKH;
        this.thanhTien = thanhTien;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.giamTD = giamTD;
        this.maNV = maNV;
        this.maKH = maKH;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getGiamTD() {
        return giamTD;
    }

    public void setGiamTD(String giamTD) {
        this.giamTD = giamTD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }


}
