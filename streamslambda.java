import java.util.Arrays;
import java.util.List;

public class streamslambda {
    public static void main(String[] args){
        List<Integer>numbers= Arrays.asList(2,4,6,8,10);
        numbers.stream().filter(n->n>5).forEach(System.out::println);
        int sum =numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum"+sum);
    }
}
