package TaskSeven;

public class TaskSeven {
    public static void main(String[] args) {
        SystemUnit mySystemUnit = new SystemUnit();
        mySystemUnit.turnOn();


    }

     abstract  class Device {
        protected String name;

        public Device(String name){
            this.name = name;
        }
        public  String getName() {
            return name;
        }

        public  void turnOn() {
            System.out.println(name + " включается");
        }

        public  void turnOff() {
            System.out.println(name + " выключается");
        }


    }

    public  class Computer {
    }

    public static class SystemUnit {
        CPU myCpu = new CPU("Процессор ");
        public void turnOn(){
            myCpu.turnOn();
            myCpu.getName();


        }
         class CPU extends Device {

             public CPU(String name) {
                 super(name);
             }
         }


         }
          class Memory extends Device {
             public Memory(String name) {
                 super(name);
             }
         }



     public static class OutputDevices {
    }


     public static class InputDevices{
    }

}