import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findfirst {
    public static void main(String[] args){
        List<String> name= Arrays.asList("john","jane","jack","jill");
        Optional<String>first=name.stream().filter(n->n.startsWith("j")).findFirst();
        first.ifPresent(n->System.out.println("First name starting woth j:"+n));
    }
}
