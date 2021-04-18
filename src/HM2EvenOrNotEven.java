import java.util.Scanner;

public class HM2EvenOrNotEven {
    public static void main(String[] args) {
        System.out.println("Программа выводит сообщение о том, является число четным или нет.");

        boolean flag = true;

        while (flag == true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите любое целое число.");
            int numb = in.nextInt();

            if(numb%2 == 0){
                System.out.println("Число " + numb +" четное.");
            }else {
                System.out.println("Число " + numb +" нечетное.");
            }

            Scanner dop = new Scanner(System.in);
            System.out.println("Хотите продолжить? Введите 1 - если продолжаем, 0 - если не продолжаем.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
