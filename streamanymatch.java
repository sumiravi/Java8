import java.util.Arrays;
import java.util.List;

public class streamanymatch {
    public static void main(String[] args){
        List<Integer>num= Arrays.asList(3,7,12,19,21);
        boolean anyDivBy5=num.stream().anyMatch(n->n%5==0);
        System.out.println("Any number divisible by 5"+anyDivBy5);
    }
}
