/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

/**
 *
 * @author Usuario
 */
public class DatosFacturacion extends User {

    String nombreCompleto;
    String direccion;
    String NIT;

    public DatosFacturacion(String nombreCompleto, String direccion, String NIT, String correo) {
        super(correo);
     
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.NIT = NIT;
        this.correo = correo;
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

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    @Override
    public String toString() {
        return "DatosFacturacion{" + "nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", NIT=" + NIT + ", correo=" + correo + '}';
    }

}
