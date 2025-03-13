import java.util.*;

public class java3 {
    public static void main(String[] args) {
        String str = "Java is programming language";
        StringTokenizer st = new StringTokenizer(str);
        int wordcount = st.countTokens();
        System.out.println("The word count is " + wordcount);
        String[] sword = str.split("\\s+");
        StringBuilder revString = new StringBuilder();
        for (int i = 0; i < wordcount; i++) {
            StringBuilder wordReversed = new StringBuilder(sword[i]);
            revString.append(wordReversed.reverse().toString()).append(" ");
        }
        System.out.println("The Reverse String is: " + revString.toString().trim());
    }
}
