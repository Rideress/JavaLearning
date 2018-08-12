package TaskSeven;

public class TaskSeven {
    public static void main(String[] args) {
        SystemUnit.CPU.turnOn();
        SystemUnit.CPU.turnOff();
    }

    static abstract class Devices {
        protected static String name;

        public void Devices(String name){
            this.name = name;

        }

        public static String getName() {
            return name;
        }

        public static void turnOn() {
            System.out.println(getName() + " включается");
        }

        public static void turnOff() {
            System.out.println(getName() + "выключается");
        }
    }

    public static class Computer {
    }

    public static class SystemUnit {

        static class CPU extends Devices {
            static String name = "Процессор ";
            public static void turnOff() {
                System.out.println(name + "выключается");
            }
        }


    }


     public static class OutputDevices {
    }


     public static class InputDevices{
    }

}
