package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DButils {

    public static void closeAll(Connection con,
            PreparedStatement stm,
            ResultSet rs){
        if(rs !=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if(stm !=null){
            try {
                stm.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if(con !=null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static Connection open() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/qldiemsv?useUnicode=true&characterEncoding=utf8", "root", "");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
