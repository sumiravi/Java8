import java.util.Arrays;
import java.util.List;

public class streamnonematch {
    public static void main(String[] args){
        List<String>fruits= Arrays.asList("apple","banana","cherry");
        boolean noneStartWithZ=fruits.stream().noneMatch(s->s.startsWith("Z"));
        System.out.println("no element start with z:"+noneStartWithZ);

    }
}
