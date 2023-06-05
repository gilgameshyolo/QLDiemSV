package DAO;


import Model.User;
import Utils.DButils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO {

    /*public boolean themMoi(User user) {
    boolean kq = false;
    Connection con = DButils.open();
    PreparedStatement stm = null;
    try {
    stm = con.prepareStatement("insert into T_USER(user_name, full_name, pass) values(?, ?, ?)");
    stm.setString(1, user.getUserName());
    stm.setString(2, user.getFullName());
    stm.setString(3, user.getPass());
    kq = stm.executeUpdate() >0;
    } catch (SQLException ex) {
    System.out.println(ex.getMessage());
    } finally {
    DButils.closeAll(con, stm, null);
    }
        
        return kq;
    }*/

    /*    public boolean capNhat(User user) {
    boolean kq = false;
    Connection con = DButils.open();
    PreparedStatement stm = null;
    try {
    stm = con.prepareStatement("update T_USER set full_name =?, pass =? where user_name =?");
    stm.setString(1, user.getFullName());
    stm.setString(2, user.getPass());
    stm.setString(3, user.getUserName());
    kq = stm.executeUpdate() >0;
    } catch (SQLException ex) {
    System.out.println(ex.getMessage());
    } finally {
    DButils.closeAll(con, stm, null);
    }
    
    return kq;
    }*/
    /*    public boolean xoa(String userName) {
    boolean kq = false;
    Connection con = DButils.open();
    PreparedStatement stm = null;
    try {
    stm = con.prepareStatement("delete from T_USER where user_name =?");
    stm.setString(1, userName);
    kq = stm.executeUpdate() >0;
    } catch (SQLException ex) {
    System.out.println(ex.getMessage());
    } finally {
    DButils.closeAll(con, stm, null);
    }
    
    return kq;
    }*/
    public User dangNhap(String userName, String password) {
        User user = null;
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("select * from users where username =? and password =?");
            stm.setString(1, userName);
            stm.setString(2, password);
            rs = stm.executeQuery();
            if (rs.next()) {
                int userID = rs.getInt("user_id");
                user = new User(userID,userName,password);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return user;
    }
    /*public User getChiTiet(String userName) {
    User user = null;
    Connection con = DButils.open();
    PreparedStatement stm = null;
    ResultSet rs = null;
    try {
    stm = con.prepareStatement("select * from T_USER where user_name =?");
    stm.setString(1, userName);
    rs = stm.executeQuery();
    if (rs.next()) {
    String fullName = rs.getString("full_name");
    user = new User(userName, fullName);
    }
    } catch (SQLException ex) {
    System.out.println(ex.getMessage());
    } finally {
    DButils.closeAll(con, stm, rs);
    }
    return user;
    }*/

    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        Connection con = DButils.open();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = con.prepareStatement("select * from users");
            rs = stm.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("user_id");
                String userName = rs.getString("username");
                String password = rs.getString("password");
                User user = new User(userID,userName,password);
                list.add(user);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DButils.closeAll(con, stm, rs);
        }
        return list;
    }
}
