import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class comparatorintlambda {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(5,2,9,1,7);
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted names:" + names);

    }
}