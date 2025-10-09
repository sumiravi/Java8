import java.util.Arrays;
import java.util.List;

public class mapfillterreduce {
    public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(2, 5, 8, 10, 15, 20);

            int sum = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .reduce(0, Integer::sum);

            System.out.println("Sum of squares of even numbers: " + sum);
        }
    }

