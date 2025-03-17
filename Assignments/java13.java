package Assignments;
import java.util.*;

public class java13 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check:");
        int num = sc.nextInt();
        sc.close();

        if (isPrime(num)) 
        {
            System.out.println("The number is Prime");
        } else 
        {
            System.out.println("The number is not Prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
        {
            return false;
        }
        if (num == 2)   //2 is the only even prime number
         {
            return true;
        }
        if (num % 2 == 0) //neglating all even numbers
        {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);  //sqrt is used bcz for the efficiency of the computation.
        for (int i = 3; i <= sqrt; i += 2) //it is used here for the purpose to division checking with odd numbers
        {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
