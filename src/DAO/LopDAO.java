/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Lop;
import Utils.DButils;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LopDAO {
    
    public boolean themMoi(Lop lop) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("insert into tbllop(MaLop, TenLop) values(?, ?)");
            stm.setInt(1, lop.getMaLop());
            stm.setString(2, lop.getTenLop());
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
    
    public boolean suaLop(Lop lop) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("update tbllop set TenLop = ? where MaLop = ?");
            stm.setInt(2, lop.getMaLop());
            stm.setString(1, lop.getTenLop());
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
    
    public List<Lop> getAll() {
        List<Lop> list = new ArrayList<>();
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("select * from tblLop");
            rs = stm.executeQuery();
            while (rs.next()) {
                int maLop = rs.getInt("MaLop");
                String tenLop = rs.getString("TenLop");
                Lop lop = new Lop(maLop, tenLop);
                list.add(lop);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return list;
    }
    public boolean XoaLop(String ma) {
        boolean kq = false;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("Delete from tblLop where MaLop = "+ ma +"");
            
            kq = stm.executeUpdate() >0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, null);
        }
        
        return kq;
    }
}
