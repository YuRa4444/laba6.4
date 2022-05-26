package Package;

import java.util.Scanner;

public class classOne {
    static int asusRog = 50000;
    static int asusTuf = 40000;
    static int asusPro = 28000;


    public void classOne () {
        Scanner ss1 = new Scanner(System.in);

        System.out.println("Введіть ваш бюджет");
        int d1 = ss1.nextInt();
        if (d1 >= asusPro && d1 < asusTuf) {
            System.out.println("Рекомендуєм модель ASUS Pro " + asusPro + " грн");
        } else if (d1 >= asusTuf && d1 < asusRog) {
            System.out.println("Доступні моделі ASUS Pro або ASUS Tuf ");
            System.out.println("Рекомендуєм ASUS Tuf " + asusTuf + " грн");
        } else if (d1 >= asusRog) {
            System.out.println("Рекомедована модель ASUS Rog " + asusRog + " грн");

        } else {
            System.out.println("Можливо вас зацікавлять інші фірми");
        }
        //Тут повинно було повернутись на початок

    }
}