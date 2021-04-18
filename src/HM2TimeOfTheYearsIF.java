import java.util.Scanner;

public class HM2TimeOfTheYearsIF {

    public static void main(String[] args) {
        System.out.println("Программа выводит пору года по номеру месяца.");

        boolean flag = true;

        while (flag == true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер месяца:");
            int nummonth = in.nextInt();

            if (nummonth == 1 || nummonth == 2 || nummonth == 12){
                System.out.println("Месяц номер " + nummonth + " соответствует зиме.");
            }else if (nummonth >= 3 && nummonth <= 5){
                System.out.println("Месяц номер " + nummonth + " соответствует весне.");
            }else if (nummonth >= 6 && nummonth <= 8){
                System.out.println("Месяц номер " + nummonth + " соответствует лету.");
            }else if (nummonth >= 9 && nummonth <= 11){
                System.out.println("Месяц номер " + nummonth + " соответствует осени.");
            }else {
                System.out.println("Введенное число не является номером месяца.");
            }

            Scanner dop = new Scanner(System.in);
            System.out.println("\nХотите еще попробовать? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
