import java.util.Scanner;

public class HM2TimeOfTheYear {

    public static void main(String[] args) {
        System.out.println("Программа выводит пору года по номеру месяца.");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int nummonth = in.nextInt();

        switch (nummonth){
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц номер " + nummonth + " соответствует зиме.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц номер " + nummonth + " соответствует весне.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц номер " + nummonth + " соответствует лету.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц номер " + nummonth + " соответствует осени.");
                break;
            default:
                System.out.println("Введенное число не является номером месяца.");
        }

    }
}
