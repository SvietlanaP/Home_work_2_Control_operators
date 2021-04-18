import java.util.Scanner;

public class HM2Even100 {
    public static void main(String[] args) {
        System.out.println("Программа выводит все четные/нечетные числа от 1 до 100.");
        boolean flag = true;

        while (flag == true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите 1, если выводить нечетные числа, и 2, если выводить четные числа.");
            int even = in.nextInt();

            if (even == 1){
                for (int i = 1; i <= 100; i = i + 2){
                    System.out.println(i);
                }
            }else if(even == 2){
                for (int i = 2; i <= 100; i = i + 2){
                    System.out.println(i);
                }
            } else {
                System.out.println("Введен некорректный номер операции.");
            }


            Scanner dop = new Scanner(System.in);
            System.out.println("\nХотите еще попробовать? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
