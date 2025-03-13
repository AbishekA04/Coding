package Assignments;
import java.util.*;
public class HappyNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n = sc.nextInt();
        int sum = 0;
        int result = happy(n);
        if(result == 1){
            System.out.println("Happy Number");
        }
        else if (result >= 100){
            System.out.println("Not a Happy Number");
    }
    else{
        System.out.println("Not a Happy Number");
    }
}
public static int happy(int n){
    int sum=0;
        while(n>0){
            int r = n%10;
            sum += Math.pow(r,2);
            n = n/10;
        }
        if(sum>2&&sum<=100){
            return happy(sum);
        }
        else{
            return sum;
    }
}
}

