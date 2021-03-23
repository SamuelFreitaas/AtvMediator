
package atvmediator;

/**
 *
 * @author Grupo Samuel Alencar, Eberton Moura, Daniel Araujo e Lays Maria
 */
public class ConcretePiloto2 extends PilotoColaborador {

    public ConcretePiloto2(TorreMediator torre) {
        super(torre);
    }

    @Override
    public void send(String message) {
        torre.send(message, this);

    }

    @Override
    public void messageReceived(String message) {
        System.out.println("Boeing 787: " + message);

    }

}
