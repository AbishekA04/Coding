import java.util.*;
class java7{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String st1 = sc.nextLine();
    String l1 =st1.toLowerCase();
    StringBuilder s1 = new StringBuilder(l1);
    sc.close();
    if(s1.toString().equals(s1.reverse().toString())){
        System.out.println("The given string is a palindrome.");
        
    } else{
        System.out.println("The given string is not a palindrome");
    }
    }
}

