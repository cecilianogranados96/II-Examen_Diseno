
package Caso3_Bridge;

/**
 *
 * @author sicalderon
 */
public abstract class Platform {
    IThreadScheduler iThreadScheduler;

    public Platform(IThreadScheduler iThreadScheduler) {
        this.iThreadScheduler = iThreadScheduler;
    }
    
    public abstract void ejecutarProceso();
    
    public void setIThreadScheduler(IThreadScheduler iThreadScheduler){
        this.iThreadScheduler = iThreadScheduler;
    }
    public IThreadScheduler getIThreadScheduler(){
        return iThreadScheduler;
    }
}
