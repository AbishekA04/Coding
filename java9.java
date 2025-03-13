import java.io.*;
import java.util.*;
public class java9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m,n,i,j;
        System.out.println("Enter the number of rows:");
        m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        n=sc.nextInt();
         int[][] arr = new int[m][n];
        System.out.println("Enter the Array:");
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max = arr[0][0];
        int min = arr[0][0];
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
                if(arr[i][j] < min)
                {
                    min = arr[i][j];
                }
    }
}
        
        System.out.println("Maximum element is: "+max);
        System.out.println("Minimum element is: "+min);
        sc.close();
    }
}
