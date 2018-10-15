
package Caso3_Bridge;
/**
 *
 * @author sicalderon
 */
public class main {
    public static void main(String[] args) {
       //Se crea una nueva plataforma de tipo JVM que planifica
       //la ejecución de sus procesos por medio de un ThreadScheduler de tipo preemptive
       Platform plataforma = new JVM(new Preemptive());
       plataforma.ejecutarProceso();
       
       //Se modifica el esquema para que sea de tipo time sliced
       plataforma.setIThreadScheduler(new TimeSliced());
       plataforma.ejecutarProceso();
    }
}

