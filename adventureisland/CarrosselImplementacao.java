package adventureisland;

public class CarrosselImplementacao implements Carrossel{
    public boolean brincar(int idade, double altura) {
        if (idade>6 && altura>1.30){
            System.out.println("Carrossel liberado!");
            return true;
        }
        else {
            System.out.println("Carrossel NÃO liberado.");
            return false;
        }
    }
}
