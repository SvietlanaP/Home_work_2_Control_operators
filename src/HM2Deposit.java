import java.util.Scanner;

public class HM2Deposit {
    public static void main(String[] args) {
        System.out.println("Программа рассчитывает сумму вклада S, которую получит клиент через n месяцев, " +
                "если проценты начисляются каждый месяц на сумму, находящуюся на счете в момент начисления процентов." +
                "Процентная ставка равна 7%");

        boolean flag = true;

        while (flag == true){
            Scanner inC = new Scanner(System.in);
            System.out.println("Введите сумму вклада S:");
            float summOfDeposit = inC.nextFloat();
            if(summOfDeposit <=0){
                System.out.println("Некорректный ввод суммы вклада.");
                Scanner inN = new Scanner(System.in);
                System.out.println("Хотите попробовать еще раз? 1 - да, 0 - нет.");
                int a = inN.nextInt();
                if (a == 1){
                    Scanner inNew = new Scanner(System.in);
                    System.out.println("Введите сумму вклада S:");
                    summOfDeposit = inNew.nextFloat();
                } else {
                    break;
                }
            }

            Scanner inM = new Scanner(System.in);
            System.out.println("Введите количество месяцев n, на которое размещаете вклад:");
            int numberOfMonth = inM.nextInt();
            if(numberOfMonth <=0){
                System.out.println("Некорректный ввод количества месяцев.");
                Scanner inN = new Scanner(System.in);
                System.out.println("Хотите попробовать еще раз? 1 - да, 0 - нет.");
                int a = inN.nextInt();
                if (a == 1){
                    Scanner inNew = new Scanner(System.in);
                    System.out.println("Введите количество месяцев n, на которое размещаете вклад:");
                    numberOfMonth = inNew.nextInt();
                } else {
                    break;
                }
            }

            for (int i = 1; i <= numberOfMonth; i++){
                summOfDeposit += summOfDeposit * 0.07;
            }
            System.out.println("Сумма вклада на конец " + numberOfMonth + " месяца равна " + summOfDeposit);

            Scanner dop = new Scanner(System.in);
            System.out.println("Хотите рассчитать еще раз? Введите 0 - если выйти из программы, 1 - если продолжить.");
            int flag1 = dop.nextInt();

            flag = (flag1 == 1);
        }
    }
}
