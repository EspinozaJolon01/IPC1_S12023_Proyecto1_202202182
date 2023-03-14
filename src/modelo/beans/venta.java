/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

/**
 *
 * @author Usuario
 */
public class Venta extends User {

    //origen
    private String departamentoOrig;
    private String municipioOrig;
    private String direccionOrig;

    //destino
    private String departamentoDest;
    private String municipioDest;
    private String direccionDest;

    private int nPaquete;
    private String tipoDePago;
    private String tipoDePesoPaquete;
    private String tipoServicios;
    private String nombre;
    private String direccion;
    private String nit;
    private double total;

    //codigos aleatorios
    private String nCodigoPq;
    private String nFactura;

    public Venta(String departamentoOrig, String municipioOrig, String direccionOrig, String departamentoDest, String municipioDest, String direccionDest, int nPaquete, String tipoDePago, String tipoDePesoPaquete, String tipoServicios, String nombre, String direccion, String nit, double total, String nCodigoPq, String nFactura, String correo, Integer id) {
        super(correo);
        this.id = id;
        this.departamentoOrig = departamentoOrig;
        this.municipioOrig = municipioOrig;
        this.direccionOrig = direccionOrig;
        this.departamentoDest = departamentoDest;
        this.municipioDest = municipioDest;
        this.direccionDest = direccionDest;
        this.nPaquete = nPaquete;
        this.tipoDePago = tipoDePago;
        this.tipoDePesoPaquete = tipoDePesoPaquete;
        this.tipoServicios = tipoServicios;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.total = total;
        this.nCodigoPq = nCodigoPq;
        this.nFactura = nFactura;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDepartamentoOrig() {
        return departamentoOrig;
    }

    public void setDepartamentoOrig(String departamentoOrig) {
        this.departamentoOrig = departamentoOrig;
    }

    public String getMunicipioOrig() {
        return municipioOrig;
    }

    public void setMunicipioOrig(String municipioOrig) {
        this.municipioOrig = municipioOrig;
    }

    public String getDireccionOrig() {
        return direccionOrig;
    }

    public void setDireccionOrig(String direccionOrig) {
        this.direccionOrig = direccionOrig;
    }

    public String getDepartamentoDest() {
        return departamentoDest;
    }

    public void setDepartamentoDest(String departamentoDest) {
        this.departamentoDest = departamentoDest;
    }

    public String getMunicipioDest() {
        return municipioDest;
    }

    public void setMunicipioDest(String municipioDest) {
        this.municipioDest = municipioDest;
    }

    public String getDireccionDest() {
        return direccionDest;
    }

    public void setDireccionDest(String direccionDest) {
        this.direccionDest = direccionDest;
    }

    public int getnPaquete() {
        return nPaquete;
    }

    public void setnPaquete(int nPaquete) {
        this.nPaquete = nPaquete;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public String getTipoDePesoPaquete() {
        return tipoDePesoPaquete;
    }

    public void setTipoDePesoPaquete(String tipoDePesoPaquete) {
        this.tipoDePesoPaquete = tipoDePesoPaquete;
    }

    public String getTipoServicios() {
        return tipoServicios;
    }

    public void setTipoServicios(String tipoServicios) {
        this.tipoServicios = tipoServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getnCodigoPq() {
        return nCodigoPq;
    }

    public void setnCodigoPq(String nCodigoPq) {
        this.nCodigoPq = nCodigoPq;
    }

    public String getnFactura() {
        return nFactura;
    }

    public void setnFactura(String nFactura) {
        this.nFactura = nFactura;
    }

    @Override
    public String toString() {
        return "Venta{" + "departamentoOrig=" + departamentoOrig + ", municipioOrig=" + municipioOrig + ", direccionOrig=" + direccionOrig + ", departamentoDest=" + departamentoDest + ", municipioDest=" + municipioDest + ", direccionDest=" + direccionDest + ", nPaquete=" + nPaquete + ", tipoDePago=" + tipoDePago + ", tipoDePesoPaquete=" + tipoDePesoPaquete + ", tipoServicios=" + tipoServicios + ", nombre=" + nombre + ", direccion=" + direccion + ", nit=" + nit + ", total=" + total + ", nCodigoPq=" + nCodigoPq + ", nFactura=" + nFactura + ", correo=" + correo + '}';
    }

}
