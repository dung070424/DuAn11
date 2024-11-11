/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import model.KichCo;
import model.MauSac;


/**
 * @author Admin
 */
public class KichCo_Service {
    private List<KichCo> listSZ;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public List<KichCo> getAll() {
        listSZ = new ArrayList<>();
        sql = "SELECT * from Size";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                KichCo kc = new KichCo();
                kc.setId(rs.getInt(1));
                kc.setTen(rs.getString(2));
                kc.setTrangThai(rs.getString(3));
                listSZ.add(kc);
            }
        } catch (Exception e) {
        }
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSZ;
    }

    public int insertKC(KichCo kc) {
        int kq = 0;
        sql = "insert into Size (TenSize) values (?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, kc.getTen());
            kq = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            kq = 0;
        }
        return kq;
    }

    public int updateKC(int id, KichCo kc) {
        int kq = 0;
        sql = "update Size set TenSize = ? where ID_Size like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(2, id);
            ps.setString(1, kc.getTen());
            kq = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            kq = 0;
        }
        return kq;
    }
}
