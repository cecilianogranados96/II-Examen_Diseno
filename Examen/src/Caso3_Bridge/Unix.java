
package Caso3_Bridge;

/**
 *
 * @author sicalderon
 */
public class Unix extends Platform{

    public Unix(IThreadScheduler iThreadScheduler) {
        super(iThreadScheduler);
    }

    @Override
    public void ejecutarProceso() {
        System.out.println("Ejecutando proceso en Unix...");
        iThreadScheduler.planificar();
    }
    
}
