package com.javaweb.demo.allmethods;

import com.javaweb.demo.dbcommon.DBConnect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AllConnect {
    public boolean login(String name, String pwd) {
        boolean flag = false;
        try {
            DBConnect.init();
            ResultSet rs = DBConnect.selectSql("select * from user where name='"+name+"' and pwd='"+pwd+"'");
            while(rs.next()){
                if(rs.getString("name").equals(name) && rs.getString("pwd").equals(pwd)){
                    flag = true;
                }
            }
            DBConnect.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
}
