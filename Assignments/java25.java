package Assignments;
import java.util.*;
public class java25 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        sc.close();
        String[] words = s1.split("\\s+");
        Arrays.sort(words,String.CASE_INSENSITIVE_ORDER);  //Used to sort the words without considering the case
        System.out.println("The Sorted String:");
        for(String word: words){
            System.out.print(word+" ");
    
        }
    }
    
}
