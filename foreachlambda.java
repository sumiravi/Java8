import java.util.Arrays;
import java.util.List;

public class foreachlambda {
    public static void main(String[] args){
        List<String> fruits= Arrays.asList("apple","banana","mango");
        fruits.forEach(f->System.out.println(f));
        fruits.forEach(System.out::println);
    }
}
