package MicroBlog;

import java.util.Scanner;
import static java.lang.System.out;


public class Post {
    //has-a
    //User class user who posted it
    //int order number
    //String contents
    //String webLink

    //can dos
    //constructor (initializes the variables)
    //int getPostNumber() - to get last post
    //toString

    private int postOrderNumber;
    private static int nextOrderNumber = 1;
    private String postContent;
    private boolean hasWebLink;
    private String webLink;
    User author = null;

    public Post(User author, String postContent, boolean hasWebLink)
    {
        Scanner keyboard = new Scanner(System.in);
        this.author = author;
        this.postOrderNumber = nextOrderNumber;
        nextOrderNumber++;
        this.postContent = postContent;
        this.hasWebLink = hasWebLink;
        if (this.hasWebLink == true) {
            out.println("What is the web address you would like to link to this post?");
            this.webLink = keyboard.nextLine();
        }
    }

    public String toString() {
        if (this.hasWebLink == true) {
            return ("Blog Post #" + postOrderNumber + ". (Posted by: " + this.author + ") --- " + this.postContent + " --- Web link: " + this.webLink);
        } else {
            return ("Blog Post #" + postOrderNumber + ". (Posted by: " + this.author + ") --- " + this.postContent);
        }
    }

}
