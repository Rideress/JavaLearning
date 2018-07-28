package HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {

        MySystem.myOut.myPrintln("Hello World");
    }

    public static class MySystem {
        static MyOutput myOut = new MyOutput();
    }

    public static class MyOutput {
        public  void myPrintln(String phrase) {
            System.out.println(phrase);
        }
    }
}




