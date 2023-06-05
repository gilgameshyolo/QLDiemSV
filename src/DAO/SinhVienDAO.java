/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.SinhVien;
import Utils.DButils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SinhVienDAO {
    public boolean themMoi(SinhVien sv) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("insert into tblsinhvien(MaSV, TenSV,NgaySinh,GioiTinh,DiaChi,MaLop) values(?, ?, ?, ?, ?, ?)");
            stm.setString(1, sv.getMaSV());
            stm.setString(2, sv.getTenSV());
            stm.setString(3, sv.getNgaysinh());
            stm.setBoolean(4, sv.getGioitinh());
            stm.setString(5, sv.getDiachi());
            stm.setInt(6, sv.getMaLop());
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
    
    public boolean suaSV(SinhVien sv) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("update tblsinhvien set TenSV = ?,NgaySinh = ?,GioiTinh = ?,DiaChi = ?,MaLop = ? where MaSV = ?");
            stm.setString(6, sv.getMaSV());
            stm.setString(1, sv.getTenSV());
            stm.setString(2, sv.getNgaysinh());
            stm.setBoolean(3, sv.getGioitinh());
            stm.setString(4, sv.getDiachi());
            stm.setInt(5, sv.getMaLop());
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
    
    public List<SinhVien> getAll() {
        List<SinhVien> list = new ArrayList<>();
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("select * from tblsinhvien");
            rs = stm.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                String tenSV = rs.getString("TenSV");
                String ngaysinh = rs.getString("NgaySinh");
                boolean gioitinh = rs.getBoolean("GioiTinh");
                String diachi = rs.getString("DiaChi");
                int maLop = rs.getInt("MaLop");
                SinhVien sv = new SinhVien(maSV, tenSV,ngaysinh,gioitinh,diachi,maLop);
                list.add(sv);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return list;
    }
    public boolean XoaSV(String ma) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("Delete from tblsinhvien where MaSV = '"+ ma +"'");
            
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
}
