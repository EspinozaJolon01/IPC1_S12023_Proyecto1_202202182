/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.principal;

import java.util.ArrayList;
import modelo.beans.Departamento;
import modelo.beans.Kiosco;
import modelo.beans.Municipio;
import modelo.beans.User;
import modelo.dao.UserDao;
import modelo.beans.Region;
import modelo.beans.RegistroTarjeta;
import modelo.dao.DepartamentoDao;
import modelo.dao.KioscoDao;
import static modelo.dao.KioscoDao.kiosco;
import modelo.dao.MunicipioDao;
import modelo.dao.RegionDao;
import static modelo.dao.RegionDao.region;
import modelo.dao.RegistroTarjetaDao;
import static modelo.dao.UserDao.users;
import static modelo.principal.Principal.autentificarUser;
import vistas.FrmModificarDatos;
import vistas.Frmlogin;

/**
 *
 * @author Usuario
 */
public class Principal {

    private static UserDao usuarioDoa = new UserDao();
    private static RegionDao regionDao = new RegionDao();
    private static KioscoDao kioscoDao = new KioscoDao();
    private static DepartamentoDao departamentoDao = new DepartamentoDao();
    private static MunicipioDao municipioDao = new MunicipioDao();
    private static RegistroTarjetaDao registroTarjetaDao = new RegistroTarjetaDao();

    //verificar 
    public static boolean autentificarUser(String correo, String password) {

        if (obtener(correo) != null) {

            if (obtener(correo).getCorreo().equals(correo) && obtener(correo).getPassword().equals(password)) {

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static void crearAdmin() {
        User admin = new User("admin", "admin", "admin");
        users.add(admin);
        System.out.println(admin);
    }

    public static void agregarRegion() {

        Region region1 = new Region("M", "Metropolitana", 35, 25);
        Region region2 = new Region("NT", "Norte", 68.50, 45.55);
        Region region3 = new Region("NO", "Nororiente", 58.68, 35.48);
        Region region4 = new Region("SO", "Suroriente", 38.68, 32.48);
        Region region5 = new Region("SOC", "Suroccidente", 34.00, 29.00);
        Region region6 = new Region("NOC", "Noroccidente", 44.50, 40.00);

        region.add(region1);
        region.add(region2);
        region.add(region3);
        region.add(region4);
        region.add(region5);
        region.add(region6);

    }

    public static boolean agregar(User user) {
        return usuarioDoa.agregarUsuario(user);
    }

    public static User obtener(String correo) {
        return usuarioDoa.obtener(correo);
    }

    public static boolean buscarContr(User user) {
        return usuarioDoa.verificarContra(user);
    }

    public static User buscarRol(String correo) {
        return usuarioDoa.buscarRolUserExistente(correo);
    }

    //region
    public static void editarRegion(String codigo, double precioEstandar, double precioEspecial) {
        regionDao.modificarRegion(codigo, precioEstandar, precioEspecial);
    }

    public static Region obtenerRegion(String codigo) {
        return regionDao.obtenerRegion(codigo);
    }

    //kisko
    public static boolean agregarKisco(Kiosco kiosco) {
        return kioscoDao.agregarKiosco(kiosco);
    }

    public static Kiosco obtenerKisco(String codigoKiosco) {
        return kioscoDao.obtenerKisco(codigoKiosco);
    }

    public static void editarKiosco(String codigoKiosco, String nombreKiosco) {
        kioscoDao.modificarKiosco(codigoKiosco, nombreKiosco);
    }

    //deparmentos
    public static boolean agregarDepar(Departamento departamentos) {
        return departamentoDao.agregarDepar(departamentos);
    }

    public static Departamento obtenerDepart(String codigoDepart) {
        return departamentoDao.obtenerDepartemento(codigoDepart);
    }

    public static void editarDepartamento(String codigoDepart, String nombreDepart) {
        departamentoDao.modificarDepartamento(codigoDepart, nombreDepart);
    }

    //municipio
    public static boolean agregarMuni(Municipio municipios) {
        return municipioDao.agregarMuni(municipios);
    }

    public static Municipio obtenerMuni(String nombreMuni) {
        return municipioDao.obtenerMuni(nombreMuni);
    }

    public static void editarMunicipio(String nombreMuni, String codigoDepart) {
        municipioDao.modificarMunicion(nombreMuni, codigoDepart);
    }

    //registro de tarjeta
    public static boolean agregarTarjeta(RegistroTarjeta registroTarjetas) {
        return registroTarjetaDao.AgregarTarjeta(registroTarjetas);
    }

    //registro de datos tarjeta
    public static boolean agregarDatosTarjeta(RegistroTarjeta registroTarjetos) {
        return registroTarjetaDao.agregarDatosUser(registroTarjetos);
    }

    public static void main(String[] args) {

        Frmlogin inicio = new Frmlogin();
        inicio.setVisible(true);
        agregarRegion();
        crearAdmin();

    }

}
