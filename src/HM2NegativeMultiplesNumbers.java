import java.util.Scanner;

public class HM2NegativeMultiplesNumbers {
    public static void main(String[] args) {
        System.out.println("Программа выводит последовательность из n неположительных чисел, кратных числу а.");

        boolean flag = true;

        while (flag == true){
            Scanner inC = new Scanner(System.in);
            System.out.println("Введите количество членов последовательности n:");
            int countNumber = inC.nextInt();
            if(countNumber <=0){
                System.out.println("Некорректный ввод.");
                break;
            }

            Scanner inN = new Scanner(System.in);
            System.out.println("Введите положительное число а, которому должны быть кратны числа последовательности:");
            int numb = inN.nextInt();
            if(numb <=0){
                System.out.println("Некорректный ввод кратного числа.");
                break;
            }

            int counter = 0;
            int i = 0;
            System.out.println("Полученная последовательность:");
            while (counter < countNumber){
                System.out.println(i);
                i-=numb;
                counter++;
            }
            Scanner dop = new Scanner(System.in);
            System.out.println("Хотите еще попробовать? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
