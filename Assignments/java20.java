package Assignments;
import java.util.*;
public class java20{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array length:");
        int m = sc.nextInt();
        System.out.println("Enter the first array:");
        int arr1[] = new int[m];
        for(int i = 0;i<m;i++){
               arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the second array length:");
        int n = sc.nextInt();
        System.out.println("Enter the second array:");
        int arr2[] = new int[n];
        for(int i = 0;i<n;i++){
               arr2[i] = sc.nextInt();
        }
        if(m!=n){
              System.out.println("Correct the range! Range should be same.");
        }
        System.out.println("Unique Elements:");
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
        }
        }
}
}

    

