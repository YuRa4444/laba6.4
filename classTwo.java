package Package;

import java.util.Scanner;

public class classTwo {
    static int acerNitro = 34000;
    static int acerPredator = 144000;
    static int acerSwift = 19000;

    public void classTwo (){
        Scanner ss1 = new Scanner(System.in);

        System.out.println("Введіть ваш бюджет");
        int d1 = ss1.nextInt();
        if (d1 >= acerSwift && d1 < acerNitro) {
            System.out.println("Рекомендуєм модель Acer Nitro " + acerNitro + " грн");
        }
        else if (d1 >= acerSwift && d1< acerNitro){
            System.out.println("Доступні моделі ASUS Pro або ASUS Tuf ");
            System.out.println ("Рекомендуєм ASUS Tuf " + acerNitro+ " грн");
        }
        else if (d1 >= acerPredator){
            System.out.println("Рекомедована модель ASUS Rog " + acerPredator+ " грн");
        }else {
            System.out.println("Можливо вас зацікавлять інші фірми");
        }
        //Тут повинно було повернутись на початок
    }
}