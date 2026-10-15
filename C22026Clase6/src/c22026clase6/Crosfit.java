/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22026clase6;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author viti
 */
public class Crosfit {
    private int id;
    private int cantidadPersona;
    private Date horario;
    private String rutina;
    private Instructor instructor;

    public Crosfit() {
        id=new Random().nextInt();
        cantidadPersona=20;
        horario=new Date();
        rutina="20 burpes\n"
                + "50 cajones\n"
                + "20 handclean \n"
                + "60 salto decuerda \n"
                + "20 burpes"
                + "10 min corrida";
        instructor=null;
        
    }

    public Crosfit(int id, int cantidadPersona, Date horario, String rutina, Instructor instructor) {
        this.id = id;
        this.cantidadPersona = cantidadPersona;
        this.horario = horario;
        this.rutina = rutina;
        this.instructor = instructor;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadPersona() {
        return cantidadPersona;
    }

    public void setCantidadPersona(int cantidadPersona) {
        this.cantidadPersona = cantidadPersona;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getRutina() {
        return rutina;
    }

    public void setRutina(String rutina) {
        String extra = "\n Correr 10 min";
        this.rutina = rutina;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Crosfit{" + "\nid=" + id + ", \ncantidadPersona=" + cantidadPersona + ", \nhorario=" + horario + ", \nrutina=" + rutina + ", \ninstructor=" + instructor + '}';
    }


   
    
}
