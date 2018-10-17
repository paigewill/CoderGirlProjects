package MicroBlog;

import java.util.ArrayList;

public class User {
    //has a:
    //String avatar url
    //String user name
    //String first name
    //String last name
    //String email
    //ArrayList<Post> posts

    //can do:
    //constructor
    //void addPost(Post p) (register student)
    //ArrayList<> getPosts()
    //toString
    //keep track of my posts

    private String avatarUrl;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Post> userPosts;

    public User(String avatarUrl, String userName, String firstName, String lastName, String email) {
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userPosts = new ArrayList();
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public Post getLastPost() {
        if (this.userPosts.size() > 0) {
            int i = this.userPosts.size();
            return this.userPosts.get(i - 1);
        }
        return null;
    }

    public String toString() {
        return this.userName;
    }

    public void addPost(Post post) {
        this.userPosts.add(post);
    }

    public ArrayList getPosts() {
        return this.userPosts;
    }


}
