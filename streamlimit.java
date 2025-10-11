import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streamlimit {
    public static void main(String[] args){
        List<Integer> num= IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
        num.stream().limit(5).forEach(System.out::println);
    }
}
