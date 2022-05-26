package Package;

import java.util.Scanner;

public class classThree {
    static int lenovoLegion = 64000;
    static int lenovoIdeaPad = 16000;
    static int lenovoV15 = 12000;

    public void classThree (){
        Scanner ss1 = new Scanner(System.in);

        System.out.println("Введіть ваш бюджет");
        int d1 = ss1.nextInt();
        if (d1 >= lenovoV15 && d1 < lenovoIdeaPad) {
            System.out.println("Рекомендуєм модель ASUS Pro " + lenovoV15 + " грн");
        }
        else if (d1 >= lenovoIdeaPad && d1< lenovoLegion){
            System.out.println("Доступні моделі ASUS Pro або ASUS Tuf ");
            System.out.println("Рекомендуєм ASUS Tuf " +lenovoIdeaPad+ " грн");
        }
        else if (d1 >= lenovoLegion){
            System.out.println("Рекомедована модель ASUS Rog " +lenovoLegion+ " грн");
        }else {
            System.out.println("Можливо вас зацікавлять інші фірми");
        }
        //Тут повинно було повернутись на початок
    }
}