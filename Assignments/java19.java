package Assignments;
import java.util.*;
public class java19 {
    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        } else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The factorial is:"+factorial(n));
    }
}
