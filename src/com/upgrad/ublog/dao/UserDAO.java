package com.upgrad.ublog.dao;

import com.upgrad.ublog.dtos.User;

import java.io.IOException;
import java.sql.SQLException;

public interface UserDAO {
    public User create(User user) throws SQLException, ClassNotFoundException, IOException;
    public User findByEmailId(String emailId) throws SQLException, ClassNotFoundException, IOException;
}
