
abstract class Help {
    abstract void check(String name);
}


public class Abs extends Help{

        @Override
        void check(String name) {
            System.out.println(name);
        }


    public static void main(String[] args) {
        
        Abs obj = new Abs();
        obj.check("Hello");
    }
}