package cviceni.lukan;

/* Pro výpis textu můžeme použít i volání System.out.print().
   Od System.out.println() se liší tím, že po výpisu na obrazovku nepřesune kurzor na nový řádek
 */
import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Zadej číslo:");
        int vstup ; // vstup nám  říka lze zadat pouze číslo, pro text použijeme STring vstup
        vstup = sc.nextInt(); // pro zobrazení textu použijeme metodu nextLine
        System.out.print("Zadané číslo je: " + vstup );


    }

}