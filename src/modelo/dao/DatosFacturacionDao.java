/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.beans.DatosFacturacion;

/**
 *
 * @author Usuario
 */
public class DatosFacturacionDao {

    public static ArrayList<DatosFacturacion> datosFacturaciones;

    public DatosFacturacionDao() {
        datosFacturaciones = new ArrayList<>();
    }

    //agregar datos de facturacion
    public boolean agregarDatosUser(DatosFacturacion datosFacturacion) {

        datosFacturaciones.add(datosFacturacion);
        return true;

    }

    public static ArrayList buscarumeroTarjeta(String correoTarjeta) {

        ArrayList datosFacturacion = new ArrayList<>();

        for (int i = 0; i < datosFacturaciones.size(); i++) {
            if (datosFacturaciones.get(i).getCorreo().equals(correoTarjeta)) {
                datosFacturacion.add(datosFacturaciones.get(i));
            }

        }
        return datosFacturacion;
    }

}
