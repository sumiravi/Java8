import java.util.Arrays;
import java.util.List;

public class parallelStreams {
    public static void main(String[] args){
        List<Integer>num= Arrays.asList(1,2,3,4,5,6);
        num.parallelStream().forEach(System.out::println);
    }
}
