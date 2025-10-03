import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class creationStream {
    public static void main(String[] args){
        List<String>list= Arrays.asList("A","B","C");
        Stream<String>stream=list.stream();
        stream.forEach(System.out::println);
    }
}
