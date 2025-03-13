package Assignments;
import java.util.*;
public class java12 {
    public static void main(String[]args){
        String s1 = "grammar";
        int count[] = new int[256];
        int i;
        s1 = s1.toLowerCase();
        for(i = 0;i< s1.length();i++){
            count[s1.charAt(i)]++;
        }
        System.out.println("Duplicated Characters:");
        for(i=0;i<256;i++){
            if(count[i]>1){
             System.out.print((char)i+" ");
            }
        }
    }
    
}
