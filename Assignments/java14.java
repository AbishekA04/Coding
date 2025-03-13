package Assignments;
import java.util.*;

public class java14 {
    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range:");
        int num = sc.nextInt();
        sc.close();
        System.out.println("The fibonacci series of the number:");
        for(int i = 0;i<num;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
