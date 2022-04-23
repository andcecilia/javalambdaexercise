package adventureisland;

public class Brinquedos {
    public static void main(String[] args) {

        //1 - Convencional - usando classes:

        CarrosselImplementacao carrossel = new CarrosselImplementacao();
        carrossel.brincar(10,1.20);
        carrossel.brincar(10,1.50);

        MontanhaRussaImplementacao montanhaRussa = new MontanhaRussaImplementacao();
        montanhaRussa.brincar(10,1.60);
        montanhaRussa.brincar(18,1.60);

        RodaGiganteImplementacao rodaGigante = new RodaGiganteImplementacao();
        rodaGigante.brincar();

        //2 - Classe anônima:
        brincarNoCarrossel(new Carrossel(){
            @Override
            public boolean brincar( int idade, double altura){
                if (idade>6 && altura>1.30){
                    System.out.println("(Classe anônima) Carrossel liberado!");
                    return true;
                }
                else {
                    System.out.println("(Classe anonima) Carrossel NÃO liberado.");
                    return false;
                }
            }
        });

        brincarNaMontanhaRussa(new MontanhaRussa(){
            @Override
            public boolean brincar(int idade, double altura) {
                if (idade>16 && altura>1.55){
                    System.out.println("(Classe Anônima) Montanha Russa liberada!");
                    return true;
            }
                else {
                    System.out.println("(Classe Anônima) Montanha Russa NÃO liberada.");
                    return false;
                }
            }
        });

        brincarNaRodaGigante(new RodaGigante() {
            @Override
            public void brincar() {
                System.out.println("(Classe Anônima) Roda Gigante liberada!");
            }
        });

        // 3- Usando Lambdas:
        brincarNoCarrossel(((idade, altura) -> {
            if (idade>6 && altura>1.30){
                System.out.println("(Lambda) Carrossel liberado!");
                return true;
            }
            else {
                System.out.println("(Lambda) Carrossel NÃO liberado.");
                return false;
            }
        }));

        brincarNaMontanhaRussa(((idade, altura) -> {
            if (idade>16 && altura>1.55){
                System.out.println("(Lambda) Montanha Russa liberada!");
                return true;
            }
            else {
                System.out.println("(Lambda) Montanha Russa NÃO liberada.");
                return false;
            }
        }));

        brincarNaRodaGigante((() -> {
            System.out.println("(Lambda) Roda Gigante liberada!");
        }));

    }
    static void brincarNoCarrossel(Carrossel carrossel) {
        carrossel.brincar(10,1.60);
    }
    static void brincarNaMontanhaRussa(MontanhaRussa montanhaRussa) {
        montanhaRussa.brincar(17,1.60);
    }
    static void brincarNaRodaGigante(RodaGigante rodaGigante) {
        rodaGigante.brincar();
    }

}
