import java.util.*;
public class java5{
    public static void main(String[] args){
        int a[]={0,1,0,2,1,2};
        int l =0;
        int h = a.length-1;
        int m = 0;
        while(m<=h){
            if(a[m]==0){
                swap(a,l,m);
                l++;
                m++;
            }
            else if(a[m]==1){
                m++;
            }
            else{
                swap(a,m,h);
                h--;
            } 
} 
System.out.println("The sorted array is: "+Arrays.toString(a));    
}
   private static void swap(int a[],int i,int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp; 
   }
   
}
