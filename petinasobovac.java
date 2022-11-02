package cviceni.lukan;

import java.util.Scanner;

public class petinasobovac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Zadej číslo k pětinásobení");
        String s = sc.nextLine();
        int a = Integer.parseInt(s);
        a = a * 5;
        System.out.println(a);

    }
}
