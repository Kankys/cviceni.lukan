package cviceni.lukan;

import java.util.Scanner;

public class easycalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Ahoj, vítám tě v EasyCalc");
        System.out.println("Zadej první číslo a stiskni Enter:");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadej druhé číslo a stiskni Enter");
        float b = Float.parseFloat(sc.nextLine());
        float soucet = a + b;
        float rozdil = a - b;
        float soucin = a * b;
        float podil = a / b;
        System.out.println("Součet: " + soucet);
        System.out.println("Rozdíl: " + rozdil);
        System.out.println("Součin: " + soucin);
        System.out.println("Podíl. " + podil);
        System.out.println("Díky za použití EasyCalc!");
    }
}
