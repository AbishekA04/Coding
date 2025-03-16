package Assignments;
import java.util.*;
public class java22{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        int flag =0;
        for(char ch:s1.toCharArray())
        {
            if(Character.isDigit(ch))             //s1.matches("\\d+")---> digits(0-9)++
            {
                flag = 1;
            }
            else{
                flag = 0;
            }
        }
        sc.close();
        if(flag==1){
            System.out.println("It is a digit.");
        }
        else{
            System.out.println("It is not a digit.");
        }
    }

}