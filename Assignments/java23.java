package Assignments;
import java.util.*;

public class java23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        sc.close();
        int[] count = new int[256];  
        Arrays.fill(count, -1);  
        int maxLength = 0, start = 0, ct = 0;
        String Substring = "";
        for (int i = 0; i < s1.length(); i++) {
            if (count[s1.charAt(i)] >= start) {
                start = count[s1.charAt(i)] + 1;
            }
            count[s1.charAt(i)] = i;
            ct = i - start + 1;
            if (ct > maxLength) {
                maxLength = ct;
                Substring = s1.substring(start, i + 1);
            }
        }
        System.out.println("The Longest Substring: " + Substring);
        System.out.println("The Length of substring is " + maxLength);
    }
}
