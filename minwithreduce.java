import java.util.Arrays;
import java.util.List;

public class minwithreduce {
    public static void main(String[] args) {
           List<Integer> numbers = Arrays.asList(45, 12, 78, 3, 56);

            int min = numbers.stream()
                    .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

            System.out.println("Minimum value: " + min);
        }
    }


