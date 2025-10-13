import java.util.Arrays;
import java.util.List;

public class mapwithlambda {
    public static void main(String [] args){
        List<String>words= Arrays.asList("java","lambda","streams");
        words.stream().map(s->s.toUpperCase()).forEach(System.out::println);
    }
}
