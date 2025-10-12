import java.util.Arrays;
import java.util.List;

public class reducewithstreams {
    public static void main(String[] args){
        List<Integer>numbers= Arrays.asList(3,6,9,12);
        int sum=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum="+sum);
    }
}
