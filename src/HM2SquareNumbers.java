import java.util.Scanner;

public class HM2SquareNumbers {
    public static void main(String[] args) {
        System.out.println("Программа выводит последовательность, состоящую из квадратов числе от а до b.");

        boolean flag = true;

        while (flag == true){
            Scanner inC = new Scanner(System.in);
            System.out.println("Введите число а:");
            int numb1 = inC.nextInt();

            Scanner inN = new Scanner(System.in);
            System.out.println("Введите число b:");
            int numb2 = inN.nextInt();

            int small = 0;
            int big = 0;
            if (numb1 > numb2){
                big = numb1;
                small = numb2;
            }else{
                big = numb2;
                small = numb1;
            }

            System.out.println("Полученная последовательность:");
            while (small <= big){
                System.out.println(small*small);
                small++;
            }
            Scanner dop = new Scanner(System.in);
            System.out.println("\nХотите еще попробовать? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
