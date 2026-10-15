/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22026clase6;

/**
 *
 * @author viti
 */
public class Instructor {
    private int id;
    private String nombre;
    private Double salarioGeneral;
    private Double salarioClaseprivada;
    private EstadoInstructor estadoInstructor;

    public Instructor(int id, String nombre, Double salarioGeneral, Double salarioClaseprivada) {
        this.id = id;
        this.nombre = nombre;
        this.salarioGeneral = salarioGeneral;
        this.salarioClaseprivada = salarioClaseprivada;
        this.estadoInstructor=EstadoInstructor.Activo;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalarioGeneral() {
        return salarioGeneral;
    }

    public void setSalarioGeneral(Double salarioGeneral) {
        this.salarioGeneral = salarioGeneral;
    }

    public Double getSalarioClaseprivada() {
        return salarioClaseprivada;
    }

    public void setSalarioClaseprivada(Double salarioClaseprivada) {
        this.salarioClaseprivada = salarioClaseprivada;
    }

    @Override
    public String toString() {
        return "Instructor{" + "\nid=" + id + ", \nnombre=" + nombre + ", \nsalarioGeneral=" + salarioGeneral + ", \nsalarioClaseprivada=" + salarioClaseprivada + ", \nestadoInstructor=" + estadoInstructor + '}';
    }


    
    
}
