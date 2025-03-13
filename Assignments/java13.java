package Assignments;
import java.util.*;
public class java13 {
    public static void main(String[]args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check:");
        num = sc.nextInt();
        sc.close();
        if(isPrime(num)){
            System.out.println("The number is Prime");
        }
        else{
            System.out.println("The number is not Prime");
        }
    }
        public static boolean isPrime(int num){
        for(int i=2;i<Math.sqrt(num);i++){
            if(num<=1){
                return false;
            }
               if(num%i==0){
                return false;
               }
        }
        return true;
    }
}
