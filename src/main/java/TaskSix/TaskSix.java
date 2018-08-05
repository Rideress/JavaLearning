package TaskSix;

public class TaskSix {
    public static void main(String[] args) {
        Computer.turnOn();
        Computer.turnOff();

    }

    public class Computer {
        SystemUnit cpu = new SystemUnit();
        SystemUnit memory = new SystemUnit();
        InputDevices mouse = new InputDevices();
        InputDevices keyboard = new InputDevices();
        OutputDevices display = new OutputDevices();
        OutputDevices speakers = new OutputDevices();
        public void turnOn(){
            cpu.systemUnitTurnOn();
            memory.systemUnitTurnOn();
            mouse.InputDevicesTurnOn();
            keyboard.InputDevicesTurnOn();
            display.OutputDevicesTurnOn();
            speakers.OutputDevicesTurnOn();
        }
        public void turnOff(){
            cpu.systemUnitTurnOff();
            memory.systemUnitTurnOff();
            mouse.InputDevicesTurnOff();
            keyboard.InputDevicesTurnOff();
            display.OutputDevicesTurnOff();
            speakers.OutputDevicesTurnOff();
        }
    }


    class SystemUnit {


        public void systemUnitTurnOn() {
           System.out.println(  " включается.");
        }

        public void systemUnitTurnOff() {
            System.out.println(  " выключается.");

        }
    }

    class InputDevices {


        public void InputDevicesTurnOn() {
            System.out.println(  " включается.");

        }

        public void InputDevicesTurnOff() {
            System.out.println(  " выключается.");

        }
    }

    class OutputDevices {


        public void OutputDevicesTurnOn() {
            System.out.println(  " включается.");

        }

        public void OutputDevicesTurnOff() {
            System.out.println(  " выключается.");

        }

    }
}
