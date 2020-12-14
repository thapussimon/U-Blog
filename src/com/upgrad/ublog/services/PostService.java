package com.upgrad.ublog.services;

import com.upgrad.ublog.dtos.Post;
import com.upgrad.ublog.exceptions.PostNotFoundException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface PostService {
    public Post create(Post post) throws Exception;
    public List<Post> getPostsByEmailId(String emailId) throws Exception;
    public List<Post> getPostsByTag(String tag) throws Exception;
    public Set<String> getAllTags() throws Exception;
    public boolean deletePost(int postId, String emailId) throws PostNotFoundException, SQLException, ClassNotFoundException, IOException;
}
