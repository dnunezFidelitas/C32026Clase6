/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2026c3clase6;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author viti
 */
public class Dueno {
    private int id;
    private int id2;
    private String nombre;
    private String tipoDueno;
    private Date fechaNaciminetoOCreacion;
    private EstadoDueno estadoPrestamo;

    public Dueno() {
        id= (int) Math.random() *1000;
        Random numero = new Random();
        id2=numero.nextInt(100, 300);
        estadoPrestamo=EstadoDueno.enEstudio;
      
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

    public String getTipoDueno() {
        return tipoDueno;
    }

    public void setTipoDueno(String tipoDueno) {
        this.tipoDueno = tipoDueno;
    }

    public Date getFechaNaciminetoOCreacion() {
        return fechaNaciminetoOCreacion;
    }

    public void setFechaNaciminetoOCreacion(Date fechaNaciminetoOCreacion) {
        this.fechaNaciminetoOCreacion = fechaNaciminetoOCreacion;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public EstadoDueno getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(EstadoDueno estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    @Override
    public String toString() {
        return "Dueno{" + "id=" + id + ", id2=" + id2 + ", nombre=" + nombre + ", tipoDueno=" + tipoDueno + ", fechaNaciminetoOCreacion=" + fechaNaciminetoOCreacion + ", estadoPrestamo=" + estadoPrestamo + '}';
    }
    
     
}
