//Q.Write a program to get a substring of a StringBuffer.


import java.util.Scanner;
public class Program2 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = obj.nextLine();
        StringBuffer obj1 = new StringBuffer(s);

        //Using the substring function.
        String a = obj1.substring(3);
        System.out.println(a);
    }
}