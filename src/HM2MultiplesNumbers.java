import java.util.Scanner;

public class HM2MultiplesNumbers {
    public static void main(String[] args) {
        System.out.println("Программа выводит последовательность из n чисел, кратных числу а.");

        boolean flag = true;

        while (flag == true){
            Scanner inC = new Scanner(System.in);
            System.out.println("Введите количество членов последовательности n:");
            int countNumber = inC.nextInt();
            if(countNumber <=0){
                System.out.println("Некорректный ввод количества членов последовательности.");
                break;
            }

            Scanner inN = new Scanner(System.in);
            System.out.println("Введите число а, которому должны быть кратны числа последовательности:");
            int numb = inN.nextInt();
            if(numb <=0){
                System.out.println("Некорректный ввод кратного числа.");
                break;
            }

            int counter = 0;
            int i = 0;
            System.out.println("Полученная последовательность:");
            while (counter < countNumber){
                i+=numb;
                System.out.println(i);
                counter++;
            }
            Scanner dop = new Scanner(System.in);
            System.out.println("Хотите еще попробовать? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
