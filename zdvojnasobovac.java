package cviceni.lukan;

import java.util.Scanner;

public class zdvojnasobovac
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte číslo k zdvojnásobení:");
        String s = sc.nextLine();
        int a = Integer.parseInt(s);
        a = a * 2;
        System.out.println(a);
    }
}  
