interface StringLength{
    int getLength(String s);

    }

    public class functioninterfacelambda {
        public static void main(String[] args) {
            StringLength lenght = s -> s.length();
            System.out.println("Length:"+lenght.getLength("hello world !!"));

        }
    }
