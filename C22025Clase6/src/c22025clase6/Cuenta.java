/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025clase6;

/**
 *
 * @author viti
 */
public class Cuenta {
    private String idCuenta;
    private Estado estado;

    public Cuenta() {
    }

    public Cuenta(String idCuenta, Estado estado) {
        this.idCuenta = idCuenta;
        this.estado = estado;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "idCuenta=" + idCuenta + ", estado=" + estado + '}';
    }
    
    
}
