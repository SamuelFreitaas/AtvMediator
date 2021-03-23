
package atvmediator;

/**
 *
 * @author Grupo Samuel Alencar, Eberton Moura, Daniel Araujo e Lays Maria
 */
public class ConcreteTorreMediator implements TorreMediator {

    private ConcretePiloto1 m_piloto1;
    private ConcretePiloto2 m_piloto2;

    public void setPiloto1(ConcretePiloto1 piloto1) {
        m_piloto1 = piloto1;
    }

    public void setPiloto2(ConcretePiloto2 piloto2) {
        m_piloto2 = piloto2;
    }

    @Override
    public void send(String message, PilotoColaborador colleage) {
        if (colleage == m_piloto1) {
            m_piloto2.messageReceived(message);
        } else if (colleage == m_piloto2) {
            m_piloto1.messageReceived(message);
        } else {
            System.out.println("Sem Informações");
        }
    }

}
