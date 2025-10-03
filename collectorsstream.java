import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectorsstream {
    public static void main(String[] args){
        List<String>names= Arrays.asList("john","alice","bob","charlie");
        List<String>result=names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);
    }
}
