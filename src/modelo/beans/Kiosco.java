/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

/**
 *
 * @author Usuario
 */
public class Kiosco extends Region {

    private String codigoKiosco;
    private String nombreKiosco;

    public Kiosco(String codigoKiosco, String nombreKiosco, String codigo) {
        super(codigo);
        this.codigoKiosco = codigoKiosco;
        this.nombreKiosco = nombreKiosco;
        this.codigo = codigo;
    }

    public String getCodigoKiosco() {
        return codigoKiosco;
    }

    public void setCodigoKiosco(String codigoKiosco) {
        this.codigoKiosco = codigoKiosco;
    }

    public String getNombreKiosco() {
        return nombreKiosco;
    }

    public void setNombreKiosco(String nombreKiosco) {
        this.nombreKiosco = nombreKiosco;
    }

    @Override
    public String toString() {
        return "Kiosco{" + "codigoKiosco=" + codigoKiosco + ", nombreKiosco=" + nombreKiosco +"codigo=" + codigo + '}';
    }

}
