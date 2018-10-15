
package Caso3_Bridge;

/**
 *
 * @author sicalderon
 */
public class JVM extends Platform{

    public JVM(IThreadScheduler iThreadScheduler) {
        super(iThreadScheduler);
    }

    @Override
    public void ejecutarProceso() {
        System.out.println("Ejecutando proceso en JVM...");
        iThreadScheduler.planificar();
    }
    
}
