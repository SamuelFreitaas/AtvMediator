package atvmediator;

/**
 *
 * @author Grupo Samuel Alencar, Eberton Moura, Daniel Araujo e Lays Maria
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConcreteTorreMediator mediator = new ConcreteTorreMediator();

        ConcretePiloto1 pilotoN1 = new ConcretePiloto1(mediator);
        ConcretePiloto2 pilotoN2 = new ConcretePiloto2(mediator);

        mediator.setPiloto1(pilotoN1);
        mediator.setPiloto2(pilotoN2);

        pilotoN1.send("!!ATENÇÃO!! Piloto 1 aterrissando em 3... 2... 1...");
        pilotoN2.send("!!ATENÇÃO!! Piloto 2 decolando em 3... 2... 1...");
    }

}
