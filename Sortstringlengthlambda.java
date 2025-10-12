import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortstringlengthlambda {
    public static void main(String[] args){
        List<String>words= Arrays.asList("apple","banana","kiwi","grapes");
        Collections.sort(words,(s1,s2)->s1.length()-s2.length());
        System.out.println("sort by length:"+words);
    }
}
