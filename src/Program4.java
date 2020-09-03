
//Q.Write a program to display the length and capacity of String, StringBuilder and StringBuffer.

import java.util.Scanner;
public class Program4 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
       String a=new String();
       StringBuffer b=new StringBuffer();
       StringBuilder c=new StringBuilder();

    //Using the length,capacity functions to take out the length and capacity of String, StringBuilder and StringBuffer.
        System.out.println("The length and capacity of String is ----->"+a.length());
        System.out.println("The length and capacity of StringBuffer is ----->"+b.length()+" "+b.capacity());
        System.out.println("The length and capacity of StringBuffer is ----->"+c.length()+" "+c.capacity());
    }
}