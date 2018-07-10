package ComputerModel;

public class ComputerModel {
    public static void main(String []args){
        System.out.println("Млдель компьютера.");
        processor();
        memory();
        inputDevices();
        outputDevices();
    }
    private static void processor(){
        System.out.println("Процессор компьютера.");
    }
    private static void memory(){
        System.out.println("Память компьютера.");
    }
    private static void inputDevices(){
        System.out.println("Мышь.");
        System.out.println("Клавиатура.");
        System.out.println("Графический планшет.");
    }
    private static void outputDevices(){
        System.out.println("Монитор.");
        System.out.println("Колонки.");
        System.out.println("Принтер.");
    }
}
