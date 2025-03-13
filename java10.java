import java.util.*;
public class java10{
 public static void main(String[] args){
    int vowelCount =0, constantCount =0;
    String s1 = "WelcomeHome";
    s1=s1.toLowerCase();
    for(char c : s1.toCharArray()){
        if(c>='a' && c <= 'z'){
            if(c=='a' || c == 'e' || c == 'i' || c == 'o' || c=='u'){

                vowelCount++;
            }
            else{
                constantCount++;
            }
        }


 }
 System.out.println("vowelCount: " + vowelCount);
 System.out.println("constantCount: " + constantCount);
}
}
