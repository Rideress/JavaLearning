package TaskFour;

public class TaskFour {
    public static void main(String[] args) {
        Computer.computerTurnOn();
        Computer.computerTurnOff();
    }

    public static class Computer {
        public static void computerTurnOn() {
            System.out.println("Включение компьютера. \n ~~~~~~~~~~~~~~~~ ");
            SystemUnit.systemUnitTurnOn();
            OutputDevices.outputDevicesTurnOn();
            InputDevices.inputDevicesTurnOn();
        }

        public static void computerTurnOff() {
            System.out.println("Выключение компьютера. \n ~~~~~~~~~~~~~~~ ");
            OutputDevices.outputDevicesTurnOff();
            InputDevices.inputDevicesTurnOff();
            SystemUnit.systemUnitTurnOff();

        }
    }

    public static class SystemUnit {
        static void systemUnitTurnOn() {
            System.out.println(CPU + " включается.");
            CPU_Actions();
            System.out.println(memory + " включается.");
            memoryActions();
        }

        static void systemUnitTurnOff() {
            System.out.println(CPU + " выключается.");
            System.out.println(memory + " выключается.");

        }

        static String CPU = "Процессор";

        static void CPU_Actions() {
            System.out.println("~Процессор: \n -Обработка данных.");
        }

        static String memory = "Запоминающее устройство";

        static void memoryActions() {
            System.out.println("~Память: \n -Хранение данных.");
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


