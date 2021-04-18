import java.util.Scanner;

public class HM2Rainbow {
    public static void main(String[] args) {
        System.out.println("Программа выводит информацию цвете радуги по ее номеру.");
        boolean flag = true;

        while(flag == true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер цвета радуги:");
            int nummonth = in.nextInt();

            switch (nummonth) {
                case 1:
                    System.out.println("Это красный цвет радуги.");
                    break;
                case 2:
                    System.out.println("Это оранжевый цвет радуги.");
                    break;
                case 3:
                    System.out.println("Это желтый цвет радуги.");
                    break;
                case 4:
                    System.out.println("Это зеленый цвет радуги.");
                    break;
                case 5:
                    System.out.println("Это голубой цвет радуги.");
                    break;
                case 6:
                    System.out.println("Это синий цвет радуги.");
                    break;
                case 7:
                    System.out.println("Это фиолетовый цвет радуги.");
                    break;
                default:
                    System.out.println("У радуги только 7 цветов. Введенное число не является номером цвета радуги.");
            }

            Scanner dop = new Scanner(System.in);
            System.out.println("Хотите еще попробовать? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
