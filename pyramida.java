package cviceni.lukan;

public class pyramida {
    public static void main(String[] args) {

        int radky = 5;


        //řádky = 1,2,3,4,5
        //mezery = 4,3,2,1
        //hvězžičky = 1,3,5,9
        // pyramidu si nejdříve nakreslím na papír 9 okýnek vodorovně 5 svisle


        int pocetHvezdicek = 1; //pocatecni hodnota
        for (int i = 1; i <= radky; i++){// posouvá radky

            for (int j = radky -i; j >=1; j--){ // kresli mezery
                System.out.print(" ");
            }

            for (int k =1; k <= pocetHvezdicek; k++){// kresli Xka
                System.out.print("X");
            }
            pocetHvezdicek = pocetHvezdicek + 2; // pocitadlo poctu X
            System.out.println(); // prehodi dalsi radek

        }






    }
}