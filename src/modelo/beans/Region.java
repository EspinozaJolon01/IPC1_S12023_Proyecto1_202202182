/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

/**
 *
 * @author Usuario
 */
public class Region {

    protected String codigo;
    protected String nombreRegion;
    protected double precioEstandar;
    protected double precioEspecial;

    public Region(String codigo, String nombreRegion, double precioEstandar, double precioEspecial) {
        this.codigo = codigo;
        this.nombreRegion = nombreRegion;
        this.precioEstandar = precioEstandar;
        this.precioEspecial = precioEspecial;
    }

    public Region(String codigo) {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreKiosco(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public double getPrecioEstandar() {
        return precioEstandar;
    }

    public void setPrecioEstandar(double precioEstandar) {
        this.precioEstandar = precioEstandar;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }

    public void setPrecioEspecial(double precioEspecial) {
        this.precioEspecial = precioEspecial;
    }

    @Override
    public String toString() {
        return "Region{" + "codigo=" + codigo + ", nombreRegion=" + nombreRegion + ", precioEstandar=" + precioEstandar + ", precioEspecial=" + precioEspecial + '}';
    }

}
