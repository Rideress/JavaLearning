package ComputerModel;

public class ComputerModel {
    public static void main(String[] args) {
        System.out.println("Модель компьютера:");
        SystemUnit.CPU.actions();
        SystemUnit.Memory.actions();
        InputDevices.Keyboard.actions();
        InputDevices.mouse.actions();
        OutputDevices.Speakers.actions();
        OutputDevices.display.actions();

    }

    static class SystemUnit {
        static class CPU {
            private static void actions() {
                System.out.println("Процессор:");
                System.out.println("-Обработка данных.");
            }
        }

        static class Memory {
            private static void actions() {
                System.out.println("Память:");
                System.out.println("-Хранение данных.");
            }
        }

    }


    static class OutputDevices {
        static class display {
            private static void actions() {
                System.out.println("Монитор:");
                System.out.println("-Вывод изображения.");
            }
        }

        static class Speakers {
            private static void actions() {
                System.out.println("Колонки:");
                System.out.println("-Вывод звука");
            }
        }
    }


    static class InputDevices {
        static class mouse {
            private static void actions() {
                System.out.println("Мышь:");
                System.out.println("-Нажатие мыши.");
                System.out.println("-Передвижение мыши.");
            }
        }

        static class Keyboard {
            private static void actions() {
                System.out.println("Клавиатура:");
                System.out.println("-Нажатие клавиш.");
            }
        }
    }


}

