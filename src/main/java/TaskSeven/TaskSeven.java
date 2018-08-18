package TaskSeven;

public class TaskSeven {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Компьютер");
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
            System.out.println(name + "  включается");
        }

        public void turnOff() {
            System.out.println(name + " выключается");
        }


    }

    public static class Computer extends Device {
        String computer = "Компьютер ";
        SystemUnit mySystemUnit = new SystemUnit("Системный блок");
        OutputDevices myOutputDevices = new OutputDevices("Устройства вывода");
        InputDevices myInputDevices = new InputDevices("Устрйоства ввода");

        public Computer(String name) {
            super(name);
        }



        @Override
        public void turnOn() {
            super.turnOn();
                mySystemUnit.turnOn();
                myOutputDevices.turnOn();
                myInputDevices.turnOn();
        }

        public void turnOff() {
            super.turnOff();
            mySystemUnit.turnOff();
            myOutputDevices.turnOff();
            myInputDevices.turnOff();
        }

    }

    public static class SystemUnit extends Device {
        CPU myCpu = new CPU("Процессор");
        Memory myMemory = new Memory("Запоминающее устройство");

        public SystemUnit(String name) {
            super(name);
        }

        public void turnOn() {
            super.turnOn();
            myCpu.turnOn();
            myMemory.turnOn();

        }

        public void turnOff() {
            super.turnOff();
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


    public static class OutputDevices extends Device {
        Display myDisplay = new Display("Монитор");
        Speaker mySpeaker = new Speaker("Колонки");

        public OutputDevices(String name) {
            super(name);
        }

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


    public static class InputDevices extends Device {
        Keyboard myKeyboard = new Keyboard("Клавиатура");
        Mouse myMouse = new Mouse("Мышь");

        public InputDevices(String name) {
            super(name);
        }
        @Override
        public void turnOn() {
            super.turnOn();
            myKeyboard.turnOn();
            myMouse.turnOn();
        }

        public void turnOff() {
            super.turnOff();
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