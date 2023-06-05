/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DSDiem;
import Model.Diem;
import Model.Lop;
import Utils.DButils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DiemDAO {
    public boolean themMoi(Diem diem) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("insert into tbldiem(MaSV, MaMH,MaLoai,Diem) values(?, ?,?,?)");
            stm.setString(1, diem.getMaSV());
            stm.setInt(2, diem.getMaMH());
            stm.setInt(3, diem.getMaLoai());
            stm.setFloat(4, diem.getDiem());
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
    
    public boolean suaDiem(Diem d) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("update tblDiem set Diem=? where MaMH = ? and MaLoai = ? and MaSV = ?");
            stm.setString(4, d.getMaSV());
            stm.setInt(2, d.getMaMH());
            stm.setInt(3, d.getMaLoai());
            stm.setFloat(1, d.getDiem());
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
    
    public List<Diem> getAll() {
        List<Diem> list = new ArrayList<>();
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("select * from tblDiem");
            rs = stm.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                int maMH = rs.getInt("MaMH");
                int maLoai = rs.getInt("MaLoai");
                float diem = rs.getFloat("Diem");
                Diem d = new Diem(maSV,maLoai,maMH,diem);
                list.add(d);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return list;
    }
    public boolean XoaDiem(String ma,int mamh,int mald) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("Delete from tbldiem where MaSV = '"+ ma +"' and MaMH = "+mamh+" and MaLoai ="+mald+" ");
            
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
    
      public List<DSDiem> getAll1() {
        List<DSDiem> list = new ArrayList<>();
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("SELECT sv.MaSV,sv.TenSV,l.TenLop,mh.MaMH,mh.TenMH,ld.MaLoai,ld.TenLoai,d.Diem from tbldiem d INNER JOIN tblsinhvien sv ON d.MaSV=sv.MaSV INNER JOIN tblmonhoc mh on d.MaMH=mh.MaMH INNER JOIN tblloaidiem ld on d.MaLoai=ld.MaLoai INNER JOIN tbllop l on sv.MaLop=l.MaLop GROUP BY sv.MaSV,sv.TenSV,l.TenLop,mh.MaMH,mh.TenMH,ld.MaLoai,ld.TenLoai,d.Diem");
            rs = stm.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                String tenSV = rs.getString("TenSV");
                String tenLop = rs.getString("TenLop");
                int maMH = rs.getInt("MaMH");
                String tenMH = rs.getString("TenMH");
                int maLoai = rs.getInt("MaLoai");
                String tenLoai = rs.getString("TenLoai");
                float diem = rs.getFloat("Diem");
                DSDiem dsd = new DSDiem(maSV, tenSV, tenLop,maMH, tenMH,maLoai, tenLoai, diem);
                list.add(dsd);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return list;
    }
      
      public List<DSDiem> getDiemSV(String ma) {
        List<DSDiem> list = new ArrayList<>();
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("SELECT sv.MaSV,sv.TenSV,l.TenLop,mh.MaMH,mh.TenMH,ld.MaLoai,ld.TenLoai,d.Diem from tbldiem d INNER JOIN tblsinhvien sv ON d.MaSV=sv.MaSV INNER JOIN tblmonhoc mh on d.MaMH=mh.MaMH INNER JOIN tblloaidiem ld on d.MaLoai=ld.MaLoai INNER JOIN tbllop l on sv.MaLop=l.MaLop where d.MaSV= '"+ma+"' GROUP BY sv.MaSV,sv.TenSV,l.TenLop,mh.MaMH,mh.TenMH,ld.MaLoai,ld.TenLoai,d.Diem ");
            rs = stm.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                String tenSV = rs.getString("TenSV");
                String tenLop = rs.getString("TenLop");
                int maMH = rs.getInt("MaMH");
                String tenMH = rs.getString("TenMH");
                int maLoai = rs.getInt("MaLoai");
                String tenLoai = rs.getString("TenLoai");
                float diem = rs.getFloat("Diem");
                DSDiem dsd = new DSDiem(maSV, tenSV, tenLop,maMH, tenMH,maLoai, tenLoai, diem);
                list.add(dsd);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return list;
    }
      
      public List<DSDiem> getDiemMon(int ma) {
        List<DSDiem> list = new ArrayList<>();
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("SELECT sv.MaSV,sv.TenSV,l.TenLop,mh.MaMH,mh.TenMH,ld.MaLoai,ld.TenLoai,d.Diem from tbldiem d INNER JOIN tblsinhvien sv ON d.MaSV=sv.MaSV INNER JOIN tblmonhoc mh on d.MaMH=mh.MaMH INNER JOIN tblloaidiem ld on d.MaLoai=ld.MaLoai INNER JOIN tbllop l on sv.MaLop=l.MaLop where d.MaMH= "+ma+" GROUP BY sv.MaSV,sv.TenSV,l.TenLop,mh.MaMH,mh.TenMH,ld.MaLoai,ld.TenLoai,d.Diem ");
            rs = stm.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                String tenSV = rs.getString("TenSV");
                String tenLop = rs.getString("TenLop");
                int maMH = rs.getInt("MaMH");
                String tenMH = rs.getString("TenMH");
                int maLoai = rs.getInt("MaLoai");
                String tenLoai = rs.getString("TenLoai");
                float diem = rs.getFloat("Diem");
                DSDiem dsd = new DSDiem(maSV, tenSV, tenLop,maMH, tenMH,maLoai, tenLoai, diem);
                list.add(dsd);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return list;
    }
}
