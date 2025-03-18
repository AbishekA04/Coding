package Assignments;
import java.util.*;
public class java26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        sc.close();
        int count[] = new int[256];
        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i)]++;
    }
    System.out.println("Count of the Characters:");
    for(int i = 0;i<256;i++){
        if(count[i]>=1){
            System.out.println((char)i+"-"+count[i]);
        }
    }
}
}