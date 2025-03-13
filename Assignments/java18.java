package Assignments;
import java.util.*;
public class java18 {
    public static void main(String[] args){
        int i,j;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array:");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The Sorted Array is:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
