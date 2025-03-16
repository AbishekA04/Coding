package Assignments;
import java.util.*;
public class java21{
    public static void main(String[]args){
        int ch[] = new int[256];
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        System.out.println("Enter the String:");
        s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        sc.close();
        System.out.println("First Non Repeating Character:");
        for(int i =0;i<s1.length();i++){
            ch[s1.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(ch[s1.charAt(i)]==1){
                System.out.println((s1.charAt(i)));
                return;
}
}
System.out.println("No Non Repeating Character");
    }
}