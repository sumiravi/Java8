import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class comparatorlambda {
    public static void main(String[] args){
       List<String> names= Arrays.asList("John","Alice","Bob");
        Collections.sort(names,(a,b)->a.compareTo(b));
        System.out.println("Sorted names:"+names);
    }
}
