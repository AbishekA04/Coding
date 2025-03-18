package Assignments;
import java.util.*;
public class java15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range:");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the Elements:");
        for(int i = 0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int f = arr[0];
        int s = Integer.MIN_VALUE;    //least negative integer -2,147,483,648
        for(int i = 1;i<num;i++){
            if(arr[i]>f){
                s = f;
                f = arr[i];
            }
            else if(arr[i]>s && arr[i]!=f){
                s = arr[i];
            }
        }
        System.out.println("The Second Largest Element is:"+s);
        sc.close();
    }
    
}
