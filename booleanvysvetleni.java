package cviceni.lukan;


/* Boolean nabývá dvou hodnot: true (pravda) a false (nepravda).
Budeme ho používat zejména tehdy, až se dostaneme k podmínkám.
Do proměnné typu boolean lze uložit jak přímo hodnotu true/false, tak i logický výraz.
Výrazy píšeme do závorek. Vidíme, že výraz nabývá hodnoty true (pravda),
 protože 15 je opravdu větší než 5. Od výrazů je to jen krok k podmínkám, na ně se podíváme příště.
 */




public class booleanvysvetleni
{
    public static void main(String[] args) {

        boolean b = false;
        boolean vyraz = (15 > 5);
        System.out.println(b);
        System.out.println(vyraz);
    }
}