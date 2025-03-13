package Assignments;
import java.util.*;
public class intersect {
    public static void main(String[]args){
    int[] a = {2,4,3,7,5,8};
    int[] b = {1,44,2,67,89,5};
    for(int i = 0;i<a.length;i++){
        for(int j =0;j<b.length;j++){
            if(a[i]==b[j]){
                System.out.println(a[i]);
            }
        }
    }
}
}
