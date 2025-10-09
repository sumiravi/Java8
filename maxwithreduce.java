import java.util.Arrays;
import java.util.List;

public class maxwithreduce {

        public static void main(String[] args) {
           List<Integer> numbers = Arrays.asList(45, 12, 78, 3, 56);

            int max = numbers.stream()
                    .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

            System.out.println("Maximum value: " + max);
        }
    }


