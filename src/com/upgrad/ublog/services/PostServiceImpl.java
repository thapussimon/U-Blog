package com.upgrad.ublog.services;

/**
 * TODO: 3.22. Implement the PostService interface and implement this class using the Singleton pattern.
 * (Hint: Should have a private no-arg Constructor, a private static instance attribute of type
 * PostServiceImpl and a public static getInstance() method which returns the instance attribute.)
 * TODO: 3.23. Provide an attribute of type PostDAO and instantiate it using the DAOFactory class.
 * Note: You should not have any reference to PostDAOImpl in this class.
 * TODO: 3.24. Define the following methods and return null for each of them. You will provide a
 * proper implementation for each of these methods, later in this project.
 * a. getPostsByEmailId()
 * b. getPostsByTag()
 * c. getAllTags()
 * d. deletePost() (return false for this method for now)
 * TODO: 3.25. create() method should take post details as input and insert these details into
 * the database using the create() method of PostDAO interface. Return the Post object which
 * was returned by the create() method of the PostDAO interface.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.2. Implement getPostsByEmailId() method which takes email id as an input parameter and
 * returns all the posts corresponding to the email id using the findByEmailId() method of PostDAO interface.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.6. Implement deletePost() method which takes post id and email id as an input parameter.
 * 1. Get the post corresponding to the post id using the findByPostId() method of the PostDAO interface.
 * 2. If no post exists corresponding the post id, then throw a new PostNotFoundException with
 * "No Post exist with the given Post Id" message.
 * 3. If the post was created by the same user whose email id is passed as an input argument, then delete
 * the post using deleteByPostId() method of PostDAO and return the same boolean value returned by the
 * deleteByPostId() method.
 * 4. If the post was not created by the same user whose email id is passed as an input argument, don't delete
 * the post, and return false.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.10. Implement the getAllTags() method which retrieves the list of all the tags from the
 * database using the findAllTags() method of PostDAO interface and return a set of unique tags.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.2. Implement getPostsByEmailId() method which takes email id as an input parameter and
 * returns all the posts corresponding to the email id using the findByEmailId() method of PostDAO interface.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.6. Implement deletePost() method which takes post id and email id as an input parameter.
 * 1. Get the post corresponding to the post id using the findByPostId() method of the PostDAO interface.
 * 2. If no post exists corresponding the post id, then throw a new PostNotFoundException with
 * "No Post exist with the given Post Id" message.
 * 3. If the post was created by the same user whose email id is passed as an input argument, then delete
 * the post using deleteByPostId() method of PostDAO and return the same boolean value returned by the
 * deleteByPostId() method.
 * 4. If the post was not created by the same user whose email id is passed as an input argument, don't delete
 * the post, and return false.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.10. Implement the getAllTags() method which retrieves the list of all the tags from the
 * database using the findAllTags() method of PostDAO interface and return a set of unique tags.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.2. Implement getPostsByEmailId() method which takes email id as an input parameter and
 * returns all the posts corresponding to the email id using the findByEmailId() method of PostDAO interface.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.6. Implement deletePost() method which takes post id and email id as an input parameter.
 * 1. Get the post corresponding to the post id using the findByPostId() method of the PostDAO interface.
 * 2. If no post exists corresponding the post id, then throw a new PostNotFoundException with
 * "No Post exist with the given Post Id" message.
 * 3. If the post was created by the same user whose email id is passed as an input argument, then delete
 * the post using deleteByPostId() method of PostDAO and return the same boolean value returned by the
 * deleteByPostId() method.
 * 4. If the post was not created by the same user whose email id is passed as an input argument, don't delete
 * the post, and return false.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.10. Implement the getAllTags() method which retrieves the list of all the tags from the
 * database using the findAllTags() method of PostDAO interface and return a set of unique tags.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.2. Implement getPostsByEmailId() method which takes email id as an input parameter and
 * returns all the posts corresponding to the email id using the findByEmailId() method of PostDAO interface.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.6. Implement deletePost() method which takes post id and email id as an input parameter.
 * 1. Get the post corresponding to the post id using the findByPostId() method of the PostDAO interface.
 * 2. If no post exists corresponding the post id, then throw a new PostNotFoundException with
 * "No Post exist with the given Post Id" message.
 * 3. If the post was created by the same user whose email id is passed as an input argument, then delete
 * the post using deleteByPostId() method of PostDAO and return the same boolean value returned by the
 * deleteByPostId() method.
 * 4. If the post was not created by the same user whose email id is passed as an input argument, don't delete
 * the post, and return false.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 * <p>
 * TODO: 4.10. Implement the getAllTags() method which retrieves the list of all the tags from the
 * database using the findAllTags() method of PostDAO interface and return a set of unique tags.
 * Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 * trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 * with a message "Some unexpected error occurred!"
 */

/**
 * TODO: 4.2. Implement getPostsByEmailId() method which takes email id as an input parameter and
 *  returns all the posts corresponding to the email id using the findByEmailId() method of PostDAO interface.
 *  Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 *  trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 *  with a message "Some unexpected error occurred!"
 */

/**
 * TODO: 4.6. Implement deletePost() method which takes post id and email id as an input parameter.
 *  1. Get the post corresponding to the post id using the findByPostId() method of the PostDAO interface.
 *  2. If no post exists corresponding the post id, then throw a new PostNotFoundException with
 *   "No Post exist with the given Post Id" message.
 *  3. If the post was created by the same user whose email id is passed as an input argument, then delete
 *   the post using deleteByPostId() method of PostDAO and return the same boolean value returned by the
 *   deleteByPostId() method.
 *  4. If the post was not created by the same user whose email id is passed as an input argument, don't delete
 *   the post, and return false.
 *  Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 *  trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 *  with a message "Some unexpected error occurred!"
 */

/**
 * TODO: 4.10. Implement the getAllTags() method which retrieves the list of all the tags from the
 *  database using the findAllTags() method of PostDAO interface and return a set of unique tags.
 *  Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 *  trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 *  with a message "Some unexpected error occurred!"
 */

import com.upgrad.ublog.dao.DAOFactory;
import com.upgrad.ublog.dao.PostDAO;
import com.upgrad.ublog.dtos.Post;
import com.upgrad.ublog.exceptions.PostNotFoundException;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * TODO: 4.11. Implement getPostsByTag() method which takes tag as an input parameter and
 *  returns all the posts corresponding to the tag using the findByTag() method of PostDAO interface.
 *  Note: The exception passed by DAO layer should not be passed to the presentation layer. Print the stack
 *  trace corresponding to the exception passed by DAO layer and throw a new exception of type Exception
 *  with a message "Some unexpected error occurred!"
 */

public class PostServiceImpl implements PostService {
    //For singleton pattern implementation
    private static PostServiceImpl instance = null;

    private DAOFactory daoFactory = new DAOFactory();
    private PostDAO postDAO = daoFactory.getPostDAOImpl();


    //Objects of this class cannot be created outside
    private PostServiceImpl() {

    }

    //Implementing SIngleton pattern
    public static PostServiceImpl getInstance() {
        if (instance == null) {
            instance = new PostServiceImpl();
        }
        return instance;
    }


    @Override
    public Post create(Post post) throws Exception {
        Post temp = null;
        try {
            temp = postDAO.create(post);
        } catch (SQLException e) {
            throw new Exception("Some unexpected error occurred");
        }
        return temp;
    }

    @Override
    public List<Post> getPostsByEmailId(String emailId) throws Exception {
        List<Post> temp;
        try {
            temp = postDAO.findByEmailId(emailId);

        } catch (SQLException e) {
            throw new Exception("Some unexpected error occurred !");
        }
        return temp;

    }

    @Override
    public List<Post> getPostsByTag(String tag)throws Exception{
        List<Post> temp=null;
        try{
            temp=postDAO.findByTag(tag);
        }catch (Exception e){
            throw new Exception( "Some unexpected error occurred!");
        }
        return temp;
    }

    @Override
    public Set<String> getAllTags() throws Exception {
        Set<String> temp;
        try{
            temp= (Set<String>) postDAO.findAllTags();
        }catch (Exception e){
            throw new Exception( "Some unexpected error occurred!");
        }
        return temp;
    }

    @Override
    public boolean deletePost(int postId, String emailId) throws PostNotFoundException, SQLException, ClassNotFoundException {
        Post post = new Post(); //for getting post object for postId
        Post temp = null; //for getting post object for emailId
        try {
            post = postDAO.findByPostId(postId);
            temp = (Post) postDAO.findByEmailId(emailId);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //If no post exists corresponding the post id
        if (post == null) {
            throw new PostNotFoundException("No Post exist with the given Post Id");
        } else {
            //If the post was created by the same user whose email id is passed as an input argument
            //deleting the post
            if (post.equals(temp)) {
                return postDAO.deleteByPostId(postId);
            } else {
                return false;
            }
        }


    }
}
