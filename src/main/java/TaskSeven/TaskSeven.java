package TaskSeven;

public class TaskSeven {
    public static void main(String[] args) {


    }

     abstract  class Devices {
        protected String name;

        public Devices(String name){
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

    public  class SystemUnit {
        public  void turnOn(){
        }
         class CPU extends Devices {
             public CPU(String name) {
                 super(name);
             }
             Devices myCpu = new Devices("Процессор "){
                 @Override
                 public String getName() {
                     return super.getName();
                 }

                 @Override
                 public void turnOn() {
                     super.turnOn();
                 }

                 @Override
                 public void turnOff() {
                     super.turnOff();
                 }
             };
         }
         class memory extends Devices{
            Devices meMemory = new Devices("Запоминающее устройство ") {
                @Override
                public void turnOn() {
                    super.turnOn();
                }

                @Override
                public void turnOff() {
                    super.turnOff();
                }
            };

             public memory(String name) {
                 super(name);
             }
         }
    }


     public static class OutputDevices {
    }


     public static class InputDevices{
    }

}
