import java.util.Random;
import java.util.stream.Stream;

public class Streamgenerate {
    public static void main(String[] args){
        Stream.generate(()->new Random().nextInt(100)).limit(5).forEach(System.out::println);
    }
}
