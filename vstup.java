package cviceni.lukan;

import java.util.Scanner;

public class vstup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Zadej číslo: ");
        int vstup ; // vstup nám  říka lze zadat pouze číslo, pro text použijeme STring vstup
        vstup = sc.nextInt(); // pro zobrazení textu použijeme metodu nextLine
        sc.nextLine();
        System.out.print("Zadej text: ");
        String text;
        text = sc.nextLine();
        System.out.println("Zadané číslo je: " + vstup );
        System.out.println("Zadaný text je: " + text);


    }
}
