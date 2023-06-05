/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MonHoc;
import Utils.DButils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MonhocDAO {
    
    public boolean themMoi(MonHoc mh) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("insert into tblmonhoc(MaMH, TenMH) values(?, ?)");
            stm.setInt(1, mh.getMaMH());
            stm.setString(2, mh.getTenMH());
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
    
    public boolean suaMon(MonHoc mh) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("update tblmonhoc set TenMH = ? where MaMH = ?");
            stm.setInt(2, mh.getMaMH());
            stm.setString(1, mh.getTenMH());
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
    
    public List<MonHoc> getAll() {
        List<MonHoc> list = new ArrayList<>();
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("select * from tblmonhoc");
            rs = stm.executeQuery();
            while (rs.next()) {
                int maMH = Integer.parseInt(rs.getString("MaMH"));
                String tenMH = rs.getString("TenMH");
                MonHoc lop = new MonHoc(maMH, tenMH);
                list.add(lop);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return list;
    }
    
    public boolean XoaMon(String ma) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("Delete from tblmonhoc where MaMH = "+ ma +"");
            
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
}
