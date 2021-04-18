import java.util.Scanner;

public class HM2NumbersOfFibonacci {
    public static void main(String[] args) {
        System.out.println("Программа выводит последовательность Фибоначчи, состоящую из n чисел.");

        boolean flag = true;

        while (flag == true){
            Scanner inC = new Scanner(System.in);
            System.out.println("Введите число n:");
            int numb1 = inC.nextInt();
            if(numb1 <=0){
                System.out.println("Некорректный ввод числа последовательности.");
                break;
            }

            int n1 = 0;
            int n2 = 1;
            int numb = 0;
            System.out.println("Полученная последовательность:");
            for (int i = 1; i <= numb1; i++){
                System.out.println(numb);
                n1 = n2;
                n2 = numb;
                numb = n1 + n2;
            }

            Scanner dop = new Scanner(System.in);
            System.out.println("Хотите еще попробовать? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
