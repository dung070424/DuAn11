/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * @author Admin
 */
public class HoaDonCho {

    private String ma;
    private String tenNV;
    private String ngaytao;
    private String tenKH;
    private String trangthai;

    public Object[] toDataRow() {
        return new Object[]{
                ma, tenNV, ngaytao, tenKH, trangthai
        };
    }

    public HoaDonCho() {
    }

    public HoaDonCho(String ma, String tenNV) {
        this.ma = ma;
        this.tenNV = tenNV;
    }

    public HoaDonCho(String ma, String tenNV, String ngaytao, String trangthai) {
        this.ma = ma;
        this.tenNV = tenNV;
        this.ngaytao = ngaytao;
        this.trangthai = trangthai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "HoaDonCho{" + "ma=" + ma + ", tenNV=" + tenNV + ", ngaytao=" + ngaytao + ", tenKH=" + tenKH + ", trangthai=" + trangthai + '}';
    }


}
