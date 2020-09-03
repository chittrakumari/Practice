/*
Q.Write a program to lexicographically arrange the given strings "Raman" , "Aman" ,
"Vikram" , "Shyam" and "Bhuvan".
 */

import java.util.Scanner;
public class Program5 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String t=new String();
        String[] arr=new String[5];
        for(int i=0;i<arr.length;i++){
                arr[i]=obj.nextLine();
            }
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++)
                {
                    //compareTo returns a positive integer if the string is lexicographically greater.
                    if(arr[i].compareTo(arr[j])>0){
                        t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                    }
                }
            }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
    }
