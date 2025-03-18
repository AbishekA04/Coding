package Assignments;
import java.util.*;
public class java24{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        sc.close();
        s1 = s1.toLowerCase();
        String[] words = s1.split("\\s+");
        StringBuilder s2 = new StringBuilder("");
        for(String word: words){
            s2.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            /*Here we are appending the first letter as caps , then the rest of the letters with 
            Begin Substring value and at last we are appending a space btwn each words*/
        }
        System.out.println("Title Case String: "+s2);
    }

}