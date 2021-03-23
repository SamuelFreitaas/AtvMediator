
package atvmediator;

/**
 *
 * @author Grupo Samuel Alencar, Eberton Moura, Daniel Araujo e Lays Maria
 */
public abstract class PilotoColaborador {

    protected TorreMediator torre;

    public PilotoColaborador(TorreMediator torre) {
        this.torre = torre;
    }

    public abstract void send(String message);

    public abstract void messageReceived(String message);

}
