package cviceni.lukan;

import java.util.Scanner;
public class robot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Ahoj, jsem virtuální robot, rád opakuji!");
        System.out.println("Napiš něco: ");
        String vstup;
        vstup = sc.nextLine();
        String vystup;
        vystup = vstup + ", " + vstup + "!";
        System.out.println(vystup);

    }
}