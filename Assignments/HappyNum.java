package Assignments;
import java.util.*;
public class HappyNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n = sc.nextInt();
        if(isHappy(n)){
            System.out.println("Happy Number");
        }
    else{
        System.out.println("Not a Happy Number");
    }
    sc.close();
}
public static boolean isHappy(int n){
    while(n!=1 && n!=4)              //The cycle always includes 4, so if a number reaches 4, it will remain in the cycle forever.

    {
        n = happy(n);
    }
    return n ==1;
}
public static int happy(int n){
    int sum=0;
        while(n>0){
            int r = n%10;
            sum += Math.pow(r,2);
            n = n/10;
        }
         return sum;
    }
}


