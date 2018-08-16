package TaskSeven;

public class TaskSeven {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.turnOn();
        System.out.println("~~~~~~~~~~");
        myComputer.turnOff();

    }

    abstract static class Device {
        protected String name;

        public Device(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void turnOn() {
            System.out.println(name + "включается");
        }

        public void turnOff() {
            System.out.println(name + "выключается");
        }


    }

    public static class Computer {
        String computer = "Компьютер ";
        SystemUnit mySystemUnit = new SystemUnit();
        OutputDevices myOutputDevices = new OutputDevices();
        InputDevices myInputDevices = new InputDevices();

        public void turnOn() {
            System.out.println(computer + "включается.");
            mySystemUnit.turnOn();
            myOutputDevices.turnOn();
            myInputDevices.turnOn();
        }

        public void turnOff() {
            System.out.println(computer + "выключается.");
            mySystemUnit.turnOff();
            myOutputDevices.turnOff();
            myInputDevices.turnOff();
        }

    }

    public static class SystemUnit {
        CPU myCpu = new CPU("Процессор ");
        Memory myMemory = new Memory("Запоминающее устройство ");

        public void turnOn() {
            myCpu.turnOn();
            myMemory.turnOn();

        }

        public void turnOff() {
            myCpu.turnOff();
            myMemory.turnOff();
        }

        static class CPU extends Device {

            public CPU(String name) {
                super(name);
            }
        }

        static class Memory extends Device {
            public Memory(String name) {
                super(name);
            }
        }
    }


    public static class OutputDevices {
        Display myDisplay = new Display("Монитор ");
        Speaker mySpeaker = new Speaker("Колонки ");

        public void turnOn() {
            myDisplay.turnOn();
            mySpeaker.turnOn();
        }

        public void turnOff() {
            myDisplay.turnOff();
            mySpeaker.turnOff();
        }

        static class Display extends Device {
            public Display(String name) {
                super(name);
            }
        }

        static class Speaker extends Device {
            public Speaker(String name) {
                super(name);
            }
        }
    }


    public static class InputDevices {
        Keyboard myKeyboard = new Keyboard("Клавиатура ");
        Mouse myMouse = new Mouse("Мышь ");

        public void turnOn() {
            myKeyboard.turnOn();
            myMouse.turnOn();
        }

        public void turnOff() {
            myKeyboard.turnOff();
            myMouse.turnOff();
        }

        public static class Keyboard extends Device {
            public Keyboard(String name) {
                super(name);
            }
        }

        public static class Mouse extends Device {
            public Mouse(String name) {
                super(name);
            }
        }
    }

}