package cviceni.lukan;

import java.util.Scanner;

public class mocniny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Zadej číslo k umocnění:");
        String s = sc.nextLine();
        int a = Integer.parseInt(s);

        a = a * a;
        System.out.println("Výsledek:" + " " + a);



    }
}