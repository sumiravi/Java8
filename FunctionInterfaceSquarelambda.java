interface square{
    int calculate(int x);
}
public class FunctionInterfaceSquarelambda {
    public static void main(String[] args){
        square x1=  x  -> x*x;
        System.out.println("calculate square:"+x1.calculate(6));
    }
}