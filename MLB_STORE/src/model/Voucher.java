/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * @author Admin
 */
public class Voucher {
    private String ma;
    private String ten;
    private String ngaybd;
    private String ngaykt;
    private float tlgiam;
    private int soluong;
    private float dhtoithieu;
    private float giamtoida;
    private String trangthai;

    public Voucher() {
    }

    public Voucher(String ma, String ten, String ngaybd, String ngaykt, float tlgiam, int soluong, float dhtoithieu, float giamtoida, String trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
        this.tlgiam = tlgiam;
        this.soluong = soluong;
        this.dhtoithieu = dhtoithieu;
        this.giamtoida = giamtoida;
        this.trangthai = trangthai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(String ngaybd) {
        this.ngaybd = ngaybd;
    }

    public String getNgaykt() {
        return ngaykt;
    }

    public void setNgaykt(String ngaykt) {
        this.ngaykt = ngaykt;
    }

    public float getTlgiam() {
        return tlgiam;
    }

    public void setTlgiam(float tlgiam) {
        this.tlgiam = tlgiam;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDhtoithieu() {
        return dhtoithieu;
    }

    public void setDhtoithieu(float dhtoithieu) {
        this.dhtoithieu = dhtoithieu;
    }

    public float getGiamtoida() {
        return giamtoida;
    }

    public void setGiamtoida(float giamtoida) {
        this.giamtoida = giamtoida;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }


    public Object[] todataRow() {
        return new Object[]{
                this.getMa(), this.getTen(), this.getNgaybd(), this.getNgaykt(), this.getTlgiam(),
                this.getDhtoithieu(), this.getGiamtoida(), this.getSoluong(), this.getTrangthai()
        };
    }
}
