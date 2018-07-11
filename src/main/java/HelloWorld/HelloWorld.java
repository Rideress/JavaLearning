package HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        MySystem.MyOut.MyPrintln();
    }


    static class MySystem {
        static class MyOut {
            private static void MyPrintln() {
                System.out.println("Hello World");
            }
        }
    }


}
