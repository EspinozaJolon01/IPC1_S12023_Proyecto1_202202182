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
public class RegistroTarjeta extends User {

    private String nombreTarjeta;
    private String numTarjeta;
    private String fechaVencimiento;

    public RegistroTarjeta(String nombreTarjeta, String numTarjeta, String fechaVencimiento, String correo, Integer id) {
        super(correo);
        this.id = id;
        this.nombreTarjeta = nombreTarjeta;
        this.numTarjeta = numTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.correo = correo;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "RegistroTarjeta{" + "nombreTarjeta=" + nombreTarjeta + ", numTarjeta=" + numTarjeta + ", fechaVencimiento=" + fechaVencimiento + ", correo=" + correo + '}';
    }

}
