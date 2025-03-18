package Assignments;
import java.util.*;
public class java27 {
    public static boolean isRotated(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String s3 = s1+s1;   //if the string is rotated then adding two will give the correct string.
        return s3.contains(s2);  /*apple-->pleap then pleap+pleap=ple apple ap here it contains the apple 
        string which is s1.Returns true*/
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String:");
        String s2 = sc.nextLine();
        sc.close();
        if(s1.equals(s2)){
            System.out.println("The String is Same.");
        }
        else if(isRotated(s1,s2)){
            System.out.println("The String is Rotated.");
        }
        else{
            System.out.println("The String is not Rotated");
        }

    }
    
}
