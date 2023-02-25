/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class RegistroTarjeta {

    private String nombreTarjeta;
    private int numTarjeta;
    private Date fechaVencimiento;
    private String nombreCompleto;
    private String direccion;
    private String direccionDestino;
    private int NIT;

    public RegistroTarjeta(String nombreTarjeta, int numTarjeta, Date fechaVencimiento) {
        this.nombreTarjeta = nombreTarjeta;
        this.numTarjeta = numTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    public RegistroTarjeta(String nombreCompleto, String direccion, String direccionDestino, int NIT) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.direccionDestino = direccionDestino;
        this.NIT = NIT;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    @Override
    public String toString() {
        return "RegistroTarjeta{" + "nombreTarjeta=" + nombreTarjeta + ", numTarjeta=" + numTarjeta + ", fechaVencimiento=" + fechaVencimiento + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", direccionDestino=" + direccionDestino + ", NIT=" + NIT + '}';
    }

}
