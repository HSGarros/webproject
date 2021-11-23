package com.service.impl;

import com.service.NewService;
import com.entity.New;
import com.util.DataSourceUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class NewServiceImpl implements NewService {
    private static Logger logger = Logger.getLogger(NewServiceImpl.class.getName());
    @Override
    public List<New> listNews() {
        List<New> news = new ArrayList<>();
        String sql = "SELECT * FROM news";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                New New = new New(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4));
                news.add(New);
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return news;
    }

    @Override
    public List<New> listFiveNews() {
        List<New> news = new ArrayList<>();
        String sql = "select * from news  order by id desc limit 5;";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                New New = new New(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4));
                news.add(New);
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return news;
    }

    @Override
    public void addNews(String title, String content) {

    }

    @Override
    public New getNew(int id) {
        New get_new = null;
        String sql = "SELECT * FROM news WHERE id=?";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, id);
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    get_new= new New(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4));
                }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return get_new;
    }


    /*@Override
    public void addUser(String newName) {
        String sql = "INSERT INTO user(name) VALUES(?)";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, newName);
            st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

    @Override
    public List<User> listUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM user";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("name"), rs.getTimestamp("inserttime"));
                users.add(user);
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return users;
    }

    @Override
    public User getUser(int id) {
        User user = null;
        String sql = "SELECT * FROM user WHERE id=?";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, id);
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    user = new User(rs.getInt("id"), rs.getString("name"), rs.getTimestamp("inserttime"));
                }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return user;
    }*/
}
