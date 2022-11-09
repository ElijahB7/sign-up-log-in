import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creating the storage part of the program (The sign-up page)

        Scanner in = new Scanner(System.in);

        System.out.println("==Sign up==");

        System.out.print("Enter username ");
        String username = in.nextLine();

        System.out.print("Enter password ");
        String password = in.nextLine();

        ArrayList<String> usernames = new ArrayList<String>();
        usernames.add(username);

        ArrayList<String> passwords = new ArrayList<String>();
        passwords.add(password);

            //Creating a login page

        System.out.println(usernames.get(0));

            System.out.println("==Login==");

            System.out.print("Enter Username ");
            String loginusr = in.nextLine();

            System.out.print("Enter Password ");
            String loginpswd = in.nextLine();

            if(password.equals(passwords.get(0))) {
                System.out.println("Welcome, you are in your house");
            }else{
                System.out.println("Access denied");
            }
            if(username.equals(usernames.get(0))) {
                System.out.println("There is many benifits when having an account!");
            }else{
                System.out.println("You might have entered your username or password incorrectly");
            }
        }
    }
