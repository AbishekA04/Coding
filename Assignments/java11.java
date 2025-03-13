package Assignments;
import java.util.*;
public class java11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        String s2 = "";
        System.out.println("The Reversed String:");
        for(int i = s1.length()-1;i>=0;i--){
            s2 += s1.charAt(i);
        }
        System.out.println(s2);

    }
}