package HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        MySystem.MyOutput.myOut.myPrintln();
    }
    public static class MySystem{
        public static class MyOutput{
             static MyOutput myOut = myPrintln();
            public static void myPrintln(String arg){
                System.out.println("Hello world");
            }
        }

    }
}


