import java.util.Scanner;

public class HM2PopulationSize {
    public static void main(String[] args) {
        System.out.println("Программа рассчитывает численность населения через n лет. В настоящий момент население " +
                "равно 10 млн, смертность 8 человек на 1000 в год, рождаемость - 14 человек. Каждый год" +
                "смертность и рождаемость снижаются на 1, но в итоге смертность не опускается ниже 6 человек на " +
                "1000 в год, а рождаемость - 7.");

        boolean flag = true;

        while (flag == true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество лет n, через которое показать численность населения:");
            int numberOfMonth = in.nextInt();
            if(numberOfMonth <=0){
                System.out.println("Некорректный ввод количества лет.");
                Scanner inN = new Scanner(System.in);
                System.out.println("Хотите попробовать еще раз? 1 - да, 0 - нет.");
                int a = inN.nextInt();
                if (a == 1){
                    Scanner inNew = new Scanner(System.in);
                    System.out.println("Введите количество лет n, через которое показать численность населения:");
                    numberOfMonth = inNew.nextInt();
                } else {
                    break;
                }
            }

            int childbitrth = 14;
            int deathNumber = 8;
            int population = 10000000;
            for (int i = 1; i <= numberOfMonth; i++){
                int a = (childbitrth - deathNumber) * population/1000;
                population+= a;

                if (childbitrth > 7){
                    childbitrth--;
                }else {
                    childbitrth = 7;
                }
                if (deathNumber > 6){
                    deathNumber--;
                }else {
                    deathNumber = 6;
                }
            }

            System.out.println("Численность населения на конец " + numberOfMonth + " года равна " + population);

            Scanner dop = new Scanner(System.in);
            System.out.println("Хотите рассчитать еще раз? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
