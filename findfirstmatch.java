 import java.util.*;
        import java.util.stream.*;

public class findfirstmatch {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car", "bike", "bus", "cycle");

        Optional<String> result = vehicles.stream()
                .filter(s -> s.startsWith("b"))
                .findFirst();

        result.ifPresent(System.out::println);
    }
}

