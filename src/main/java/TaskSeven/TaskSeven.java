package TaskSeven;

public class TaskSeven {
    public static void main(String[] args) {
    SystemUnit.CPU.name.turnOn();
    }

    static abstract class Devices {
        protected String name;

        public void devices(String name) {
            this.name = name;
        }

        public void turnOn() {
            System.out.println(name + "включается");
        }

        public void turnOff() {
            System.out.println(name + "выключается");
        }
    }

    public static class Computer {
    }

    public static class SystemUnit {
        public static void turnOn(){
        }

        static class CPU extends Devices {
            static String name = "Процессор ";

            public void turnOn() {
                System.out.println(name + "включается");
            }

            @Override
            public void turnOff() {
                super.turnOff();
            }
        }


    }


     public static class OutputDevices {
    }


     public static class InputDevices{
    }

}
