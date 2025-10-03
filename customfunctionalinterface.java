@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class customfunctionalinterface {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(10, 5));
        System.out.println("Subtraction: " + sub.operate(10, 5));
        System.out.println("Multiplication: " + mul.operate(10, 5));
    }
}

