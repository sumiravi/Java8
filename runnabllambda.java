public class runnabllambda {
    public static void main(String[] args){
        Runnable r=()-> System.out.println("hello,lambda!");
        new Thread(r).start();
    }
}
