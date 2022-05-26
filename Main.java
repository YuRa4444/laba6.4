package Package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       classOne asus = new classOne();
       classTwo acer = new classTwo();
       classThree lenovo = new classThree();
       Scanner ss1 = new Scanner(System.in);

        System.out.println("Оберіть фірму серед доступних: Asus, Acer, Lenovo");
        String d1 = ss1.nextLine();

        if (d1.equals("Asus") || d1.equals("asus")){
            asus.classOne();
        }
        if (d1.equals("Acer") || d1.equals("acer")){
            acer.classTwo();
        }
        if (d1.equals("Lenovo") || d1.equals("lenovo")){
            lenovo.classThree();
        }

    }
}