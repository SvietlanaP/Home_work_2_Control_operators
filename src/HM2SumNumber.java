import java.util.Scanner;

public class HM2SumNumber {
    public static void main(String[] args) {
        System.out.println("Программа выводит сумму чисел от 1 до введенного числа.");

        int sum = 0;
        boolean flag = true;

        while (flag == true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите положительное целое число:");
            int numb = in.nextInt();

            if(numb <= 0){
                System.out.println("Введенное число не соответствует условию.");
            } else {
                for (int i = 1; i <= numb; i++){
                    sum += i;
                }
                System.out.println("Сумма от 1 до " + numb + " равна " + sum);
            }

            Scanner dop = new Scanner(System.in);
            System.out.println("\nХотите еще попробовать? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
