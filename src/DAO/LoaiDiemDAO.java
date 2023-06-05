/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Diem;
import Model.LoaiDiem;
import Utils.DButils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LoaiDiemDAO {
    public List<LoaiDiem> getAll() {
        List<LoaiDiem> list = new ArrayList<>();
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("select * from tblloaidiem");
            rs = stm.executeQuery();
            while (rs.next()) {
                
                int maLoai = rs.getInt("MaLoai");
                String tenLoai = rs.getString("TenLoai");
                LoaiDiem ld = new LoaiDiem(maLoai,tenLoai);
                list.add(ld);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return list;
    }
}
