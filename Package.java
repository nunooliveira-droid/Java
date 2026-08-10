//Import package util.Scanner to use class Scanner
import java.util.Scanner;

public class Package {
    public static void main(String[] args) {
        //Create an object to use class Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        //Method nextLine() from Scanner class
        String userName = myObj.nextLine();
        System.out.println(userName);
    }
}
