package TaskSix;

public class TaskSix {
    public static void main(String[] args) {

    }

    public class Computer {


    }

     class SystemUnit {
        SystemUnit cpu = new SystemUnit();
        SystemUnit memory = new SystemUnit();

        public  void systemUnitTurnOn() {
            System.out.println(cpu + " включается.");
            System.out.println(memory + " включается.");
        }

        public void systemUnitTurnOff() {
            System.out.println(cpu + " выключается.");
            System.out.println(memory + " выключается.");
        }
    }

    class InputDevices {
        InputDevices mouse = new InputDevices();
        InputDevices keyboard = new InputDevices();

        public void InputDevicesTurnOn() {
            System.out.println(mouse + " включается.");
            System.out.println(keyboard + " включается.");
        }

        public void InputDevicesTurnOff() {
            System.out.println(mouse + " выключается.");
            System.out.println(keyboard + " выключается.");
        }
    }

    class OutputDevices {
        OutputDevices display = new OutputDevices();
        OutputDevices speakers = new OutputDevices();

        public void OutputDevicesTurnOn() {
            System.out.println(display + " включается.");
            System.out.println(speakers + " включается.");
        }

        public void OutputDevicesTurnOff() {
            System.out.println(display + " выключается.");
            System.out.println(speakers + " выключается.");
        }

    }
}