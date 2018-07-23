package ComputerProcess;

public class ComputerProcess {
    public static void main(String[] args) {
        Computer.computerTurnOn();
        Computer.computerTurnOff();
    }

      public static class Computer {
        public static void computerTurnOn(){
            System.out.println("Включение компьютера. \n ~~~~~~~~~~~~~~~~ ");
            SystemUnit.systemUnitTurnOn();
            OutputDevices.outputDevicesTurnOn();
            InputDevices.inputDevicesTurnOn();
        }
        public static void computerTurnOff(){
            System.out.println("Выключение компьютера. \n ~~~~~~~~~~~~~~~ ");
            OutputDevices.outputDevicesTurnOff();
            InputDevices.inputDevicesTurnOff();
            SystemUnit.systemUnitTurnOff();

        }
    }

        public static class SystemUnit {
            static void systemUnitTurnOn() {
                CPU.turnOn();
                Memory.turnOn();
            }
            static void systemUnitTurnOff(){
                CPU.turnOff();
                Memory.turnOff();
            }
            private static class CPU {
                static void turnOn() {
                    System.out.println("Включение процессора.");
                    actions();
                }

                private static void turnOff() {
                    System.out.println("Выключение процессора.");
                }

                private static void actions() {
                    System.out.println("~Процессор:");
                    System.out.println(" -Обработка данных.");
                }
            }

            private static class Memory {
                static void turnOn() {
                    System.out.println("Запуск запоминающего устройства.");
                    actions();
                }

                static void turnOff() {
                    System.out.println("Выключение запоминающего устройства.");
                }

                static void actions() {
                    System.out.println("~Память:");
                    System.out.println(" -Хранение данных.");
                }
            }

        }


        static class OutputDevices {
             static void outputDevicesTurnOn() {
                Display.turnOn();
                Speakers.turnOn();
            }
            static void outputDevicesTurnOff(){
                 Display.turnOff();
                 Speakers.turnOff();
            }

            private static class Display {
                static void turnOn() {
                    System.out.println("Включение дисплея.");
                    actions();
                }

                static void turnOff() {
                    System.out.println("Выключение дисплея.");
                }

                static void actions() {
                    System.out.println("~Монитор:");
                    System.out.println(" -Вывод изображения.");
                }
            }

            static class Speakers {
                private static void turnOn() {
                    System.out.println("Включение колонок.");
                    actions();
                }

                private static void turnOff() {
                    System.out.println("Выключение колонок.");
                }

                private static void actions() {
                    System.out.println("~Колонки:");
                    System.out.println(" -Вывод звука.");
                }
            }
        }


        static class InputDevices {
            static void inputDevicesTurnOn(){
                Mouse.turnOn();
                Keyboard.turnOn();
            }
            static void inputDevicesTurnOff(){
                Mouse.turnOff();
                Keyboard.turnOff();
            }
            static class Mouse {
                private static void turnOn() {
                    System.out.println("Включение мыши.");
                    actions();
                }

                private static void turnOff() {
                    System.out.println("Выключение мыши.");
                }

                private static void actions() {
                    System.out.println("~Мышь:");
                    System.out.println(" -Нажатие мыши.");
                    System.out.println(" -Передвижение мыши.");
                }
            }

            static class Keyboard {
                private static void turnOn() {
                    System.out.println("Включение клавиатуры.");
                    actions();
                }

                private static void turnOff() {
                    System.out.println("Выключение клавиатуры.");
                }

                private static void actions() {
                    System.out.println("~Клавиатура:");
                    System.out.println(" -Нажатие клавиш.");
                }
            }
        }
    }







