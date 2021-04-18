public class HM2MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Программа выводит таблицу умножения.");

        for (int i = 1; i <= 10; i++){
            System.out.println("Таблица умножения на " + i + ":");
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
