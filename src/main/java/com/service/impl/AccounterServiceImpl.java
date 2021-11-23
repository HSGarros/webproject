package com.service.impl;

import com.util.DataSourceUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class AccounterServiceImpl {
private static Logger logger = Logger.getLogger(AccounterServiceImpl.class.getName());
    public static Boolean comparePassward(String account,String passward){
        String sql="select password from accounter where account=?";
        String passward_ture=null;
        try (Connection conn= DataSourceUtils.getConnection();
             PreparedStatement st=conn.prepareStatement(sql)) {
            st.setString(1,account);
            try (ResultSet rt=st.executeQuery()){
                while (rt.next()){
                    passward_ture=rt.getString(1);
                }
            }catch (SQLException e) {
                logger.warning(e.getMessage());
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        if (passward.equals(passward_ture)) {
            return true;
        } else {
            return false;
        }
    }
}
