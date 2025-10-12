public class runnablehellolambda {
    public static void main(String[] args){
        Runnable r=() -> System.out.println("hello from lambda thread");
        new Thread(r).start();
    }
}
