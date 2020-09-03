
//Q.Write a program to concatenate StringBuilder & StringBuffer objects.


import java.util.Scanner;
public class Program1 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=obj.nextLine();
        StringBuffer obj1=new StringBuffer(s);
        StringBuilder obj2=new StringBuilder(obj1);
        System.out.println(obj1);
        System.out.println(obj2);

        //Output after concatenation of StringBuilder & StringBuffer objects.

        System.out.println(obj1+" "+obj2);
    }
}
