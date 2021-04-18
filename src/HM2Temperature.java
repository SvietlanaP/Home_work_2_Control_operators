import java.util.Scanner;

public class HM2Temperature {
    public static void main(String[] args) {
        System.out.println("Программа выводит информацию о комфортности погоды на улице.");
        boolean flag = true;

        while (flag == true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите температуру на улице целым числом.");
            int temp = in.nextInt();

            if(temp > -5 && temp <= 40){
                System.out.println("На улице тепло.");
            }else if(temp >= -20 && temp <= -5){
                System.out.println("На улице нормально.");
            }else if (temp < -20 && temp >= -40){
                System.out.println("На улице холодно.");
            }else {
                System.out.println("Такой температуры в нашей стране быть не может.");
            }

            Scanner dop = new Scanner(System.in);
            System.out.println("Хотите продолжить? Введите 1 - если продолжаем, 0 - если не продолжаем.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
