
package Caso3_Bridge;

/**
 *
 * @author sicalderon
 */
public class Windows extends Platform{

    public Windows(IThreadScheduler iThreadScheduler) {
        super(iThreadScheduler);
    }

    @Override
    public void ejecutarProceso() {
        System.out.println("Ejecutando proceso en Windows...");
        iThreadScheduler.planificar();
    }
    
}
