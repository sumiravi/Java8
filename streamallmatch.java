import java.util.Arrays;
import java.util.List;

public class streamallmatch {
    public static void main(String[] args){
        List<Integer>num= Arrays.asList(2,4,6,8,10);
        boolean alleven=num.stream().allMatch(n->n % 2==0);
        System.out.println("All number even"+alleven);
    }
}
