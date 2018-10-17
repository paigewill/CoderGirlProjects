package MicroBlog;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    //has a:
    //User logged in User
    //ArrayList<User> users
    //Scanner

    //can do:
    //constructor
    //displayMenu - print all options
    //reactToUser - get user input
    //method for each menu option

    private static User currentUser;
    private static ArrayList<Post> allPosts = new ArrayList<Post>();
    private static ArrayList<User> existingUsers = new ArrayList<User>();

    public Menu() {
    }

    public void displayMenu() {
        String[] mainMenu = new String[5];
        mainMenu[0] = "Create new user";
        mainMenu[1] = "Become an existing user";
        mainMenu[2] = "Write a post as current user";
        mainMenu[3] = "Print all posts";
        mainMenu[4] = "Print all users";
        out.println("MicroBlog - Main Menu");
        for (int i = 0; i < mainMenu.length; i++) {
            out.println((i + 1) + ". " + mainMenu[i]);
        }
        out.println("You are currently user \"" + currentUser + "\".");
        menuSelections();
    }

    public void menuSelections() {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please enter the number of the Menu item that you would like to do.");
        String menuSelection = keyboard.nextLine();
        if (menuSelection.equals("1")) {
            createNewUser();
        } else if (menuSelection.equals("2")) {
            becomeExistingUser();
        } else if (menuSelection.equals("3")) {
            out.println("You will be posting as '" + currentUser + "'. Is this correct?");
            out.println("Please type '1' for yes or '0' for no.");
            String isUsername = keyboard.nextLine();
            if (isUsername.equals("1")) {
                writePost();
            } else {
                out.println("Would you like to: 1. Change the current user, 2. Create a new user, or 3. Return to Main Menu? " +
                        "(Please type '1', '2', or '3')");
                String option = keyboard.nextLine();
                if (option.equals("1")) {
                    becomeExistingUser();
                    out.println();
                    out.println("Enter any key to display the Main Menu");
                    String enter = keyboard.nextLine();
                    if (enter != null) {
                        displayMenu();
                    }
                } else if (option.equals("2")) {
                    createNewUser();
                } else {
                    displayMenu();
                }
            }
        } else if (menuSelection.equals("4")) {
            printAllPosts();
        } else if (menuSelection.equals("5")) {
            printAllUsers();
        } else {
            out.println("Input not valid. Please try again");
            displayMenu();
        }
    }

    public void createNewUser() {
        Scanner keyboard = new Scanner(System.in);
        out.println("Welcome to MicroBlog! You have selected 'Create new user'. Please enter your first name:");
        String firstName = keyboard.nextLine();
        out.println("Hi " + firstName + "! What is your last name?");
        String lastName = keyboard.nextLine();
        out.println("Great, thanks " + firstName + " " + lastName + ". What is your email address?");
        String email = keyboard.nextLine();
        out.println("Thanks! What would you like your username to be?");
        String userName = keyboard.nextLine();
        out.println("Welcome, " + userName + "! What is the web address to your avatar picture?");
        String avatarUrl = keyboard.nextLine();
        User newUser = new User(avatarUrl, userName, firstName, lastName, email);
        existingUsers.add(newUser);
        out.println("Congratulations, you are now a MicroBlogger!");
        out.println();
        out.println("Enter any key to display the Main Menu");
        String enter = keyboard.nextLine();
        if (enter != null) {
            displayMenu();
        }
    }


    public void becomeExistingUser() {
        Scanner keyboard = new Scanner(System.in);
        out.println();
        out.println("The registered users are:");
        for (int i = 0; i < existingUsers.size(); i++) {
            out.println((i + 1) + ". " + existingUsers.get(i));
        }
        out.println();
        out.println("Is your Username listed? Please type '1' for yes or '0' for no.");
        int isUsername = keyboard.nextInt();
        if (isUsername == 1) {
            out.println("Please enter the number that corresponds with your username.");
            int whichUser = keyboard.nextInt();
            currentUser = existingUsers.get(whichUser - 1);
            out.println("Welcome back, " + currentUser + "!");
            out.println();
            out.println("Enter any key to display the Main Menu");
            String enter = keyboard.nextLine();
            if (enter != null) {
                displayMenu();
            }
        } else {
            out.println("Unable to find user.");
            out.println();
            out.println("Enter any key to display the Main Menu");
            String enter = keyboard.nextLine();
            keyboard.skip("\n");
            if (enter != null) {
                displayMenu();
            }
        }
    }

    public void writePost() {
        Scanner keyboard = new Scanner(System.in);
        if (currentUser.getLastPost() != null) {
            out.println("Your last post was:");
            out.println(currentUser.getLastPost());
        }
        out.println("What would you like to post?");
        String postContent = keyboard.nextLine();
        out.println("Would you like to attach a web link to this post? Please answer \"true\" or \"false.\"");
        boolean hasWebLink = keyboard.nextBoolean();
        Post newPost = new Post(currentUser, postContent, hasWebLink);
        allPosts.add(newPost);
        currentUser.addPost(newPost);
        out.println("Your post is live!");
        out.println();
        out.println("Enter any key to display the Main Menu");
        String enter = keyboard.nextLine();
        if (enter != null) {
            displayMenu();
        }
    }

    public void printAllPosts() {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < allPosts.size(); i++) {
            out.println(allPosts.get(i));
        }
        out.println();
        out.println("Enter any key to display the Main Menu");
        String enter = keyboard.nextLine();
        if (enter != null) {
            displayMenu();
        }
    }

    public void printAllUsers() {
        Scanner keyboard = new Scanner(System.in);
        out.println();
        out.println("The registered users are:");
        for (int i = 0; i < existingUsers.size(); i++) {
            out.println(existingUsers.get(i));
        }
        out.println();
        out.println("Enter any key to display the Main Menu");
        String enter = keyboard.nextLine();
        if (enter != null) {
            displayMenu();
        }
    }

    public static void main(String[] args) {
        Menu mainMenu = new Menu();
        mainMenu.displayMenu();
    }
}
