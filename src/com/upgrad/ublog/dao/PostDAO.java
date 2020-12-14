package com.upgrad.ublog.dao;

import com.upgrad.ublog.dtos.Post;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface PostDAO {
    public Post create(Post post) throws SQLException, ClassNotFoundException, IOException;
    public List<Post> findByEmailId(String emailId) throws SQLException, ClassNotFoundException, IOException;
    public List<Post> findByTag(String tag) throws SQLException, ClassNotFoundException, IOException;
    public Post findByPostId(int postId) throws SQLException, ClassNotFoundException, IOException;
    public List<String> findAllTags() throws SQLException, ClassNotFoundException, IOException;
    public boolean deleteByPostId(int postId) throws SQLException, ClassNotFoundException, IOException;
}
