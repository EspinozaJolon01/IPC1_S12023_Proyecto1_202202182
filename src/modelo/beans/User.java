/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

import java.util.Date;

/**
 *
 * @author User
 */
public class User {

    protected Integer id;
    protected String correo;
    protected String nombre;
    protected String apellido;
    protected String password;
    protected String dpi;
    protected String fecha;
    protected String sobreNombre;
    protected String telefono;
    protected String rol;
    protected String genero;
    protected String nacionalidad;
    protected String foto;

    public User(String rol) {

    }

    public User(Integer id, String correo, String nombre, String apellido, String password, String dpi, String fecha, String sobreNombre, String telefono, String rol, String nacionalidad, String genero, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.dpi = dpi;
        this.correo = correo;
        this.fecha = fecha;
        this.sobreNombre = sobreNombre;
        this.telefono = telefono;
        this.rol = rol;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.foto = foto;

    }

    public User() {

    }

    public User(Integer id, String correo, String password, String rol) {
        this.id = id;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSobreNombre() {
        return sobreNombre;
    }

    public void setSobreNombre(String sobreNombre) {
        this.sobreNombre = sobreNombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", correo=" + correo + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password + ", dpi=" + dpi + ", fecha=" + fecha + ", sobreNombre=" + sobreNombre + ", telefono=" + telefono + ", rol=" + rol + ", genero=" + genero + ", nacionalidad=" + nacionalidad + ", foto=" + foto + '}';
    }

}
