import java.util.*;
public class Anagram{
        public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           String a = sc.next();
           String b = sc.next();
           sc.close();
           boolean ret = isAnagram(a,b);
           System.out.println((ret)?"Anagram":"Not Anagram");
        }
        static boolean isAnagram(String a, String b){
            int ch[] = new int[256];
            for(int i=0; i<a.length();i++){ 
                       ch[a.charAt(i)]++;
                       ch[b.charAt(i)]--;
            }
            for(int i=0;i<256;i++){
                if(ch[i]!=0){
                    return false;
                }
        }
        return true;
    }
}
