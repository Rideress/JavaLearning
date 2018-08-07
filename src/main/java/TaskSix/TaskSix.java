package TaskSix;

public class TaskSix {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.turnOn();
        myComputer.turnOff();



    }

    public static class Computer {
        String computer = "Компьютер ";
        SystemUnit mySystemUnit = new SystemUnit();
        InputDevices myInputDevices = new InputDevices();
        OutputDevices myOutputDevices = new OutputDevices();

        public void turnOn() {
            System.out.println(computer + "включается. \n ~~~~~~~~~~~");
            mySystemUnit.turnOn();
            myInputDevices.turnOn();
            myOutputDevices.turnOn();
        }

        public void turnOff() {
            System.out.println(computer + "выключается. \n ~~~~~~~~~~~");
            mySystemUnit.turnOff();
            myInputDevices.turnOff();
            myOutputDevices.turnOff();

        }
    }


    static class SystemUnit {
        String systemUnit = "Системный блок ";
        Memory myMemory = new Memory();
        Cpu myCpu = new Cpu();

        public void turnOn() {
            System.out.println(systemUnit + "включается.");
            myMemory.turnOn();
            myCpu.turnOn();
        }

        public void turnOff() {
            System.out.println(systemUnit + "выключается.");
            myMemory.turnOff();
            myCpu.turnOff();


        }

        public class Memory {
            String name = "Запоминающее устройство ";

            public void turnOn() {
                System.out.println(name + "включается.");
            }

            public void turnOff() {
                System.out.println(name + "выключается.");
            }

        }

        public class Cpu {
            String name = "Процессор ";

            public void turnOn() {
                System.out.println(name + "включается.");
            }

            public void turnOff() {
                System.out.println(name + "выключается.");
            }
        }

    }

    static class InputDevices {
        String inputDevices = "Устройства ввода ";
        Mouse myMouse = new Mouse();
        Keyboard myKeyboard = new Keyboard();

        public void turnOn() {
            System.out.println(inputDevices + "включается.");
            myKeyboard.turnOn();
            myMouse.turnOn();
        }

        public void turnOff() {
            System.out.println(inputDevices + "выключается.");
            myKeyboard.turnOn();
            myMouse.turnOn();

        }

        public class Keyboard {
            String name = "Клавиатура ";

            public void turnOn() {
                System.out.println(name + "включается.");
            }

            public void turnOff() {
                System.out.println(name + "выключается.");
            }
        }


        public class Mouse {
            String name = "Мышь ";

            public void turnOn() {
                System.out.println(name + "включается.");
            }

            public void turnOff() {
                System.out.println(name + "выключается.");
            }
        }
    }


    static class OutputDevices {
        String outputDevices = "Устройства вывода ";
        Display myDisplay = new Display();
        Speakers mySpeakers = new Speakers();

        public void turnOn() {
            System.out.println(outputDevices + "включается.");
            myDisplay.turnOn();
            mySpeakers.turnOn();
        }

        public void turnOff() {
            System.out.println(outputDevices + "выключается.");
            myDisplay.turnOff();
            mySpeakers.turnOff();
        }

        public class Display {
            String name = "Монитор ";

            public void turnOn() {
                System.out.println(name + "включается.");
            }

            public void turnOff() {
                System.out.println(name + "выключается.");
            }
        }

        public class Speakers {
            String name = "Колонки ";

            public void turnOn() {
                System.out.println(name + "включаются.");
            }

            public void turnOff() {
                System.out.println(name + "выключаются.");
            }
        }
    }
}

