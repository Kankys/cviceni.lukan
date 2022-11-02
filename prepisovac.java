package cviceni.lukan;

/* funkce replace přepíše text dle potřeby
 */


import java.util.Scanner;

public class prepisovac {
    public static void main(String[] args) {
        String s = "Kočky jsou nejlepší!";
        s = s.replace("Kočky", "Psi");
        System.out.println(s);
    }

}
