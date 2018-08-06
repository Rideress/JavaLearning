package TaskSix;

public class TaskSix {
    public static void main(String[] args) {
    }

    public class Computer {

        SystemUnit mySystemUnit = new SystemUnit();
        InputDevices myInputDevices = new InputDevices();
        OutputDevices myOutputDevices = new OutputDevices();

        public void turnOn() {
            mySystemUnit.systemUnitTurnOn();
            myInputDevices.InputDevicesTurnOn();
            myOutputDevices.OutputDevicesTurnOn();
        }

        public void turnOff() {
            mySystemUnit.systemUnitTurnOff();
            myInputDevices.InputDevicesTurnOff();
            myOutputDevices.OutputDevicesTurnOff();

        }
    }


    class SystemUnit {
        Memory myMemory = new Memory();
        Cpu myCpu = new Cpu();

        public void systemUnitTurnOn() {
            myMemory.turnOn();
            myCpu.turnOn();
        }

        public void systemUnitTurnOff() {
            myMemory.turnOff();
            myCpu.turnOff();


        }

        public class Memory {
            String memory = "Запоминающее устройство ";

            public void turnOn() {
                System.out.println(memory + "включается.");
            }

            public void turnOff() {
                System.out.println(memory + "выключается.");
            }

        }

        public class Cpu {
            String cpu = "Процессор ";

            public void turnOn() {
                System.out.println(cpu + "включается.");
            }

            public void turnOff() {
                System.out.println(cpu + "выключается.");
            }
        }

    }

    class InputDevices {
        Mouse myMouse = new Mouse();
        Keyboard myKeyboard = new Keyboard();

        public void InputDevicesTurnOn() {
            myKeyboard.turnOn();
            myMouse.turnOn();
        }

        public void InputDevicesTurnOff() {
            myKeyboard.turnOn();
            myMouse.turnOn();

        }

        public class Keyboard {
            String keyboard = "Клавиатура";

            public void turnOn() {
                System.out.println(keyboard + "включается.");
            }

            public void turnOff() {
                System.out.println(keyboard + "выключается.");
            }
        }


        public class Mouse {
            String mouse = "Мышь ";

            public void turnOn() {
                System.out.println(mouse + "включается.");
            }

            public void turnOff() {
                System.out.println(mouse + "выключается.");
            }
        }
    }


    class OutputDevices {
        Display myDisplay = new Display();
        Speakers mySpeakers = new Speakers();

        public void OutputDevicesTurnOn() {
            myDisplay.turnOn();
            mySpeakers.turnOn();
        }

        public void OutputDevicesTurnOff() {
            myDisplay.turnOff();
            mySpeakers.turnOff();
        }

        public class Display {
            String display = "Монитор ";

            public void turnOn() {
                System.out.println(display + "включается.");
            }

            public void turnOff() {
                System.out.println(display + "выключается.");
            }
        }

        public class Speakers {
            String speakers = "Колонки ";

            public void turnOn() {
                System.out.println(speakers + "включаются.");
            }

            public void turnOff() {
                System.out.println(speakers + "выключаются.");
            }
        }
    }
}

