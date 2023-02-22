/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.principal;

import modelo.beans.Departamento;
import modelo.beans.Kiosco;
import modelo.beans.Municipio;
import modelo.beans.User;
import modelo.dao.UserDao;
import modelo.beans.Region;
import modelo.beans.RegistroTarjeta;
import modelo.dao.DepartamentoDao;
import modelo.dao.KioscoDao;
import modelo.dao.MunicipioDao;
import modelo.dao.RegionDao;
import modelo.dao.RegistroTarjetaDao;
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

    public static boolean agregar(User user) {
        return usuarioDoa.agregarUsuario(user);
    }

    public static User obtener(String correo) {
        return usuarioDoa.obtener(correo);
    }

    //region
    public static boolean agregarRegion(Region region) {
        return regionDao.agregarRegion(region);
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

    //deparmentos
    public static boolean agregarDepar(Departamento departamentos) {
        return departamentoDao.agregarDepar(departamentos);
    }

    public static Departamento obtenerDepart(String codigoDepart) {
        return departamentoDao.obtenerDepartemento(codigoDepart);
    }

    //municipio
    public static boolean agregarMuni(Municipio municipios) {
        return municipioDao.agregarMuni(municipios);
    }

    public static Municipio obtenerMuni(String nombreMuni) {
        return municipioDao.obtenerMuni(nombreMuni);
    }

    //registro de tarjeta
    public static boolean agregarTarjeta(RegistroTarjeta registroTarjetas) {
        return registroTarjetaDao.AgregarTarjeta(registroTarjetas);
    }

    public static void main(String[] args) {

        /*
        Frmlogin inicio =  new Frmlogin();
        inicio.show();*/
    }

}
