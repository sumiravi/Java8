import java.util.Arrays;
import java.util.List;

public class streamsorted {
    public static void main(String[] args){
        List<String>emp= Arrays.asList("John","Alice","David","Bob");
        emp.stream().sorted().forEach(System.out::println);
    }
}
