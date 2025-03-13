import java.util.*;
import java.io.*;
public class java8{
    public static void main(String[] args){
        int count[] = new int[256];
        String s1 = "grammar";
        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i)]++;
    }
    System.out.println("Duplicate count:");
    for(int i = 0;i<256;i++){
        if(count[i]>1){
            System.out.println((char)i+"-"+count[i]);
        }
    }
}
}