/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_Bridge;

/**
 *
 * @author sicalderon
 */
public class TimeSliced implements IThreadScheduler {

    @Override
    public void planificar() {
       System.out.println("Se planifican los procesos con un esquema por secciones de tiempo.");
    }
    
}
