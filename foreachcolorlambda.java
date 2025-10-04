import java.util.Arrays;
import java.util.List;

public class foreachcolorlambda {
    public static void main(String[] args){
        List<String> colors= Arrays.asList("red","green","blue");
        colors.forEach(f->System.out.println(f));

    }
}
