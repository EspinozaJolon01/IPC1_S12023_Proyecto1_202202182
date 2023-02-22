/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

/**
 *
 * @author Usuario
 */
public class Departamento extends Region {

    protected String codigoDepart;
    protected String nombreDepart;

    public Departamento(String codigoDepart, String nombreDepart, String codigo) {
        super(codigo);
        this.codigoDepart = codigoDepart;
        this.nombreDepart = nombreDepart;
        this.codigo = codigo;
    }

    public String getCodigoDepart() {
        return codigoDepart;
    }

    public void setCodigoDepart(String codigoDepart) {
        this.codigoDepart = codigoDepart;
    }

    public String getNombreDepart() {
        return nombreDepart;
    }

    public void setNombreDepart(String nombreDepart) {
        this.nombreDepart = nombreDepart;
    }

    @Override
    public String toString() {
        return "Departamento{" + "codigoDepart=" + codigoDepart + ", nombreDepart=" + nombreDepart + "codigo=" + codigo + '}';
    }

}
