package cviceni.lukan;

import java.util.Scanner;

// Vytvoříme dotaz ať uživatel něco napíše a pak mu to vypíše chybu.
public class errorvtipek {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in, "UTF-8");
        System.out.println("Ahoj, zadej text prosím:");
        String vstup;
        vstup = sc.nextLine();
        for (;;) {
            System.err.println("Něco děláš špatně, zkus aplikaci znovu spustit a něco napsat:");

        }

    }
}