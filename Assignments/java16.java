package Assignments;
import java.util.*;
import java.io.*;
public class java16{
    public static void main(String[] args){
        int count[] = new int[256];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s1 = sc.nextLine();
        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i)]++;
    }
    System.out.println("Unique String:");
    for(int i = 0;i<256;i++){
        if(count[i]==1){
            System.out.print((char)i+"");
        }
    }
}
}