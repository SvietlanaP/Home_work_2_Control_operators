import java.util.Scanner;

public class HM2ReverseCounting {

    public static void main(String[] args) {
        System.out.println("Программа выводит числа в обратном порядке от введенного числа до 1.");
        boolean flag = true;

        while(flag == true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите любое целое положительное число:");
            int numb = in.nextInt();
            if (numb > 0){
                System.out.println("Получим последовательность:");
                for (int i = numb; i > 0; i--){
                   System.out.println(i);
                }
            }else{
                System.out.println("Введенное число не соответствует условиям задачи.");
            }

            Scanner dop = new Scanner(System.in);
            System.out.println("Хотите еще попробовать? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
