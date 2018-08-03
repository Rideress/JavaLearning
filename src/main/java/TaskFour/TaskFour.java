package TaskFour;

public class TaskFour {
    public static void main(String[] args) {
        Computer.turnOn();
        Computer.turnOff();
    }

    public static class Computer {
        static String computer = "Компьютер";
        public static void turnOn() {
            System.out.println(computer + " включается. \n ~~~~~~~~~~~~~~~~ ");
            SystemUnit.systemUnitTurnOn();
            OutputDevices.outputDevicesTurnOn();
            InputDevices.inputDevicesTurnOn();
        }

        public static void turnOff() {
            System.out.println(computer + " выключается. \n ~~~~~~~~~~~~~~~~ ");
            OutputDevices.outputDevicesTurnOff();
            InputDevices.inputDevicesTurnOff();
            SystemUnit.systemUnitTurnOff();

        }
    }

    public static class SystemUnit {
        static void systemUnitTurnOn() {
            System.out.println(CPU + " включается.");
            cpuActions();
            System.out.println(memory + " включается.");
            memoryActions();
        }

        static void systemUnitTurnOff() {
            System.out.println(CPU + " выключается.");
            System.out.println(memory + " выключается.");

        }

        static String CPU = "Процессор";

        static void cpuActions() {
            System.out.println("~Процессор: \n -Обработка данных.");
        }

        static String memory = "Запоминающее устройство";

        static void memoryActions() {
            System.out.println(memory + "\n -Хранение данных.");
        }

    }


    static class OutputDevices {
        static void outputDevicesTurnOn() {
            System.out.println(display + " включается.");
            displayActions();
            System.out.println(speakers + " включаются.");
            speakersActions();
        }

        static void outputDevicesTurnOff() {
            System.out.println(display + " выключается.");
            System.out.println(speakers + " выключаются.");
        }

        static String display = "Монитор";

        static void displayActions() {
            System.out.println("~Монитор: \n -Вывод изображения.");
        }

        static String speakers = "Колонки";

        static void speakersActions() {
            System.out.println("~Колонки: \n -Вывод звука.");
        }

    }


    static class InputDevices {
        static void inputDevicesTurnOn() {
            System.out.println(mouse + " включается.");
            mouseActions();
            System.out.println(keyboard + " включается.");
            keyboardActions();
        }

        static void inputDevicesTurnOff() {
            System.out.println(mouse + " выключается.");
            System.out.println(keyboard + " выключается.");
        }

        static String mouse = "Мышь";

        static void mouseActions() {
            System.out.println("~Мышь: \n -Нажатие мыши. \n -Передвижение мыши.");

        }

        static String keyboard = "Клавиатура";

        static void keyboardActions() {
            System.out.println("~Клавиатура: \n -Нажатие клавиш.");
        }

    }
}


