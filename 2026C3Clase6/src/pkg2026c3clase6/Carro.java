/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2026c3clase6;

import java.util.Date;

/**
 *
 * @author viti
 */
public class Carro {
    public static String iniciaPlaca ="MEO-";

    private String marca;
    private String modelo;
    private String tipoMotor;
    private int cc;
    private Date fechaCreacion;
    private long bin;
    private String placa;
    private Dueno dueno;
    private boolean funciona;
    private EstadoCarro estado;

    public Carro() {
        marca="No definido";
        modelo="Pendiente";
        tipoMotor="N/A";
        fechaCreacion=new Date(); //devuelve la fecha que se ejeucta
        placa="";
        estado=EstadoCarro.buscaMateriales;
    }

    public Carro(String marca, String modelo, String tipoMotor, int cc, Date fechaCreacion, boolean funciona) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
        this.cc = cc;
        this.fechaCreacion = fechaCreacion;
        this.funciona = funciona;
    }
    
    
    
    
 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public long getBin() {
        return bin;
    }

    public void setBin(long bin) {
        this.bin = bin;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = iniciaPlaca+placa;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public boolean isFunciona() {
        return funciona;
    }

    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }

    public EstadoCarro getEstado() {
        return estado;
    }

    public void setEstado(EstadoCarro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", tipoMotor=" + tipoMotor + ", cc=" + cc + ", fechaCreacion=" + fechaCreacion + ", bin=" + bin + ", placa=" + placa + ", dueno=" + dueno + ", funciona=" + funciona + ", estado=" + estado + '}';
    }
    
    

  
}
