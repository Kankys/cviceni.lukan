package cviceni.lukan;

//Vypočítá obvod a obsah kruhu. Díky Float lze použít desetiná čísla.


import java.util.Scanner;

public class kruh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej poloměr kruhu (cm):");
        String s = sc.nextLine();
        float a = Float.parseFloat(s);
        float b = Float.parseFloat(s);

        a = (float) (2 * 3.1415 * a); // výpočet obvodu kruhu
        System.out.println("Obvod zadaného kruhu je:" + " " + a +" "+"cm");

        b = (float) ( 3.1415 * (b*b)); // výpočet obsahu kruhu

        System.out.println("Jeho obsah je "+ b +" "+"cm^2");



    }
}

/*
 *  Můžete ho upravovat a používat jak chcete, musíte však zmínit
 *  odkaz na http://www.itnetwork.cz
package cz.itnetwork.kruh;
        import java.util.Scanner;
public class Kruh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej poloměr kruhu (cm): ");
        float r = Float.parseFloat(sc.nextLine());
        float o = 2 * 3.1415F * r;
        float s = 3.1415F * r * r;
        System.out.println("Obvod zadaného kruhu je: " + o + " cm");
        System.out.println("Jeho obsah je " + s + " cm^2");
 */
