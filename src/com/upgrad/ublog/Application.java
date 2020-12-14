package com.upgrad.ublog;

import com.upgrad.ublog.dtos.Post;
import com.upgrad.ublog.dtos.User;
import com.upgrad.ublog.exceptions.PostNotFoundException;
import com.upgrad.ublog.services.PostService;
import com.upgrad.ublog.services.ServiceFactory;
import com.upgrad.ublog.services.UserService;
import com.upgrad.ublog.services.UserServiceImpl;
import com.upgrad.ublog.utils.DateTimeFormatter;
import com.upgrad.ublog.utils.LogWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class Application {
    private Scanner scanner;
    ServiceFactory serviceFactory=new ServiceFactory();

    //Need to implement singleton pattern in PostServiceImpl then update in ServiceFactory Class
    //Need fixes here
    private PostService postService;

    //userService using ServiceFactory
    private UserService userService=serviceFactory.getUserServiceImpl();

    private boolean isLoggedIn;
    private String loggedInEmailId;

    public Application(PostService postService, UserService userService) {
        scanner = new Scanner(System.in);
        this.postService = postService;
        this.userService = userService;
        isLoggedIn = false;
        loggedInEmailId = null;
    }

    private void start()  {
        boolean flag = true;

        System.out.println("*********************");
        System.out.println("********U-Blog*******");
        System.out.println("*********************");

        do {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Create Post");
            System.out.println("4. Search Post");
            System.out.println("5. Delete Post");
            System.out.println("6. Filter Post");
            System.out.println("7. Logout");
            System.out.println("8. Exit");

            System.out.print("\nPlease select an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": login(); break;
                case "2": register(); break;
                case "3": createPost(); break;
                case "4": searchPost(); break;
                case "5": deletePost(); break;
                case "6": filterPost(); break;
                case "7": logout(); break;
                case "8": flag=false; break;
                default:  System.out.println("Error"); break;
            }
        } while (flag);
    }

    /**
     * TODO 3.17. Implement the login() method. This method should prompt the user for the
     *  email id and the password. Use the login() method of the UserService interface
     *  to login into the application. If the user is successfully logged into the application,
     *  print "You are logged in." on the console, set isLoggedIn to true and set
     *  loggedInEmailId to the email id provided by the user.
     *  Catch all the exceptions thrown by the login() method of the UserService interface with
     *  a single catch block which handles all exceptions using the Exception class and print the
     *  exception message using the getMessage() method.
     */
    private void login()  {
        if (isLoggedIn) {
            System.out.println("You are already logged in.");
            return;
        }

        System.out.println("*********************");
        System.out.println("********Login********");
        System.out.println("*********************");

        User user=new User();
        try{
            userService.login(user);
            System.out.println("You are logged in");
            isLoggedIn=true;
            loggedInEmailId=user.getEmailId();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    /**
     * TODO 3.18. Implement the register() method. This method should prompt the user for the
     *  email id and the password. Use the register() method of the UserService interface
     *  to register into the application. If the user is successfully registered into the application,
     *  print "You are logged in." on the console, set isLoggedIn to true and set
     *  loggedInEmailId to the email id provided by the user.
     *  Catch all the exceptions thrown by the register() method of the UserService interface with
     *  a single catch block which handles all exceptions using the Exception class and print the
     *  exception message using the getMessage() method.
     */
    private void register() {
        if (isLoggedIn) {
            System.out.println("You are already logged in.");
            return;
        }

        System.out.println("*********************");
        System.out.println("******Register*******");
        System.out.println("*********************");

        User user=new User();
        boolean check=false;
        String email;
        String pw;
        System.out.println("Enter Email ID: ");
        email=scanner.nextLine();
        user.setEmailId(email);
        System.out.println("Enter password: ");
        pw=scanner.nextLine();
        user.setPassword(pw);
        try{
            check=userService.register(user);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        if (check){
            System.out.println("You are logged in");
            isLoggedIn=true;
            loggedInEmailId=user.getEmailId();
        }



    }

    /**
     * TODO 3.26. Implement the createPost() method. This method should prompt the user for the
     *  post tag, the post title and the post description. Create a Post object with the following
     *  values:
     *   1. postId: 1
     *   2. emailId: loggedInEmailId
     *   3. tag, title, description: provided by the user
     *   4. timestamp: For now get the timestamp using the LocalDateTime.now() method
     *  Use the create() method of the PostService interface to create a new post into the database.
     *  Catch all the exceptions thrown by the create() method of the PostService interface with
     *  a single catch block which handles all exceptions using the Exception class and print the
     *  exception message using the getMessage() method.
     */

    /**
     * TODO 5.2: After saving the post details into the database using the createPost() method,\
     *  you should write logs in the following format.
     *  <formatted timestamp for that post><\t>New post with title [ <title for that post> ] created by [ <emailId of the creator> ]
     *  (Hint: you should use the LogWriter object)
     *  (Hint: Use the following method to get the user's current directory. All the logs should be stored
     *  in the file that is located at the following directory.
     *  System.getProperty("user.dir")
     *  Print the "System.getProperty("user.dir")" to know where the log file is created.
     */

    /**
     * TODO 6.1: Modify the existing code such that the following two operations occur simultaneously on
     *  two independent threads.
     *  thread1: Saving data into the database
     *  thread2: Writing logs into the file
     */
    private void createPost() {
        if (!isLoggedIn) {
            System.out.println("You are not logged in.");
            return;
        }

        System.out.println("*********************");
        System.out.println("*****Create Post*****");
        System.out.println("*********************");

        Post post=new Post();
        int postId=1;
        String emailId=loggedInEmailId;
        LocalDateTime timestamp=LocalDateTime.now();
        String tag,title,description;
        try{
            tag=scanner.nextLine();
            title=scanner.nextLine();
            description=scanner.nextLine();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }

    /**
     * TODO 4.3. Implement the searchPost() method. This method should prompt the user for the
     *  email id. Use the getPostsByEmailId() method of the PostService interface to get all the
     *  posts corresponding to the provided email id. If there are no posts corresponding to the
     *  provided email id, then throw the PostNotFoundException with a message "Sorry no posts
     *  exists for this email id". Otherwise, print all the posts on the console.
     *  Catch all the exceptions thrown by the getPostsByEmailId() method of the PostService interface with
     *  a single catch block which handles all exceptions using the Exception class and print the
     *  exception message using the getMessage() method.
     */
    private void searchPost()  {
        if (!isLoggedIn) {
            System.out.println("You are not logged in.");
            return;
        }

        System.out.println("*********************");
        System.out.println("*****Search Post*****");
        System.out.println("*********************");

        System.out.print("Email ID: ");
        String email;
        List<Post> temp;
        try{
            email=scanner.nextLine();
            temp=postService.getPostsByEmailId(email);
        }catch (PostNotFoundException e){
            System.out.println("Sorry no posts exists for this email id");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    /**
     * TODO 4.7. Implement the deletePost() method. This method should prompt the user for the
     *  post id. Use the deletePost() method of the PostService interface to delete the post
     *  corresponding to the post id. If the post was deleted successfully (deletePost() method of
     *  the PostService returns true), print the message "Post deleted successfully!" on the console.
     *  If the post was not deleted successfully (deletePost() method of the PostService returns false),
     *  print the message "You are not authorised to delete this post" on the console.
     *  Catch all the exceptions thrown by the deletePost() method of the PostService interface with
     *  a single catch block which handles all exceptions using the Exception class and print the
     *  exception message using the getMessage() method.
     */
    private void deletePost() {
        if (!isLoggedIn) {
            System.out.println("You are not logged in.");
            return;
        }

        System.out.println("*********************");
        System.out.println("*****Delete Post*****");
        System.out.println("*********************");

        System.out.print("Enter Post ID: ");
        int pid=scanner.nextInt();
        boolean dpost=false;
        try{
            dpost=postService.deletePost(pid,this.loggedInEmailId);
            return;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        if (dpost==true){
            System.out.println("Post deleted successfully");
        }else{
            System.out.println("You are not authorised to delete this post");
        }


    }

    /**
     * TODO 4.12. Implement the filterPost() method. This method should show all the unique tags present
     *  in the POST table using the getAllTags() method of the PostService interface. Then it should
     *  prompt the user for the tag. Use the getPostsByTag() method of the PostService interface to get all the
     *  posts corresponding to the provided tag. If there are no posts corresponding to the
     *  provided tag, then throw the PostNotFoundException with a message "Sorry no posts
     *  exists for this tag". Otherwise, print all the posts on the console.
     *  Catch all the exceptions thrown by the getPostsByTag() method of the PostService interface with
     *  a single catch block which handles all exceptions using the Exception class and print the
     *  exception message using the getMessage() method.
     */
    private void filterPost() {
        if (!isLoggedIn) {
            System.out.println("You are not logged in.");
            return;
        }

        System.out.println("*********************");
        System.out.println("*****Filter Post*****");
        System.out.println("*********************");

        Set<String> set;//To store the getAllTags
        List<Post> list=null;//To store getPostsByTag
        System.out.print("Enter tag: ");
        String tag=scanner.nextLine();
        try{
            set=postService.getAllTags();
            list=postService.getPostsByTag(tag);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        if (list==null){
            try {
                throw new PostNotFoundException("Sorry no posts exists for this tag");
            } catch (PostNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }else {
            for (Post post : list) {
                System.out.println(post);
            }
        }


    }

    private void logout() {
        if (!isLoggedIn) {
            System.out.println("You are not logged in.");
            return;
        }
        System.out.println("Logged out successfully");
        isLoggedIn = false;
        loggedInEmailId = null;
    }

    /**
     * TODO 3.16. Instantiate the userService and the postService variables using the ServiceFactory.
     */
    public static void main(String[] args)  {
        ServiceFactory serviceFactory = new ServiceFactory();
        UserService userService = serviceFactory.getUserServiceImpl();
        PostService postService = serviceFactory.getPostServiceImple();
        Application application = new Application(postService, userService);
        application.start();
    }
}
