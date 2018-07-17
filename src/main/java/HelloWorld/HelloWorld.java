package HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        MySystem.MyOut.myPrintln();
    }


    static class MySystem {
        static class MyOut {
            private static void myPrintln() {
                System.out.println("Hello World");
            }
        }


    }
}
