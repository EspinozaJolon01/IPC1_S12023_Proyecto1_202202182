/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

/**
 *
 * @author Usuario
 */
public class Municipio extends Departamento {

    private String nombreMuni;

    public Municipio(String nombreMuni, String codigoDepart, String nombreDepart, String codigo) {
        super(codigoDepart, nombreDepart, codigo);
        this.nombreMuni = nombreMuni;
        this.codigoDepart = codigoDepart;
    }

    public String getNombreMuni() {
        return nombreMuni;
    }

    public void setNombreMuni(String nombreMuni) {
        this.nombreMuni = nombreMuni;
    }

    @Override
    public String toString() {
        return "Municipio{" + "nombreMuni=" + nombreMuni + "codigo=" + codigoDepart + '}';
    }

}
