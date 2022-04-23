package adventureisland;

public class MontanhaRussaImplementacao implements MontanhaRussa {
    public boolean brincar(int idade, double altura) {
        if (idade>16 && altura>1.55){
            System.out.println("Montanha Russa liberada!");
            return true;
        }
        else {
            System.out.println("Montanha Russa NÃO liberada.");
            return false;
        }
    }
}
