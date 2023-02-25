/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.beans.RegistroTarjeta;

/**
 *
 * @author Usuario
 */
public class RegistroTarjetaDao {

    public List<RegistroTarjeta> registroTarjeta;

    public RegistroTarjetaDao() {
        registroTarjeta = new ArrayList<>();
    }

    //buscar
    public int buscarTarjeta(String nombreTarjeta) {
        int n = -1;
        for (int i = 0; i < registroTarjeta.size(); i++) {
            if (registroTarjeta.get(i).getNombreTarjeta().equals(nombreTarjeta)) {
                n = i;
                break;
            }

        }
        return n;
    }

    public boolean AgregarTarjeta(RegistroTarjeta registroTarjetas) {
        if (buscarTarjeta(registroTarjetas.getNombreTarjeta()) != 1) {
            registroTarjeta.add(registroTarjetas);
            return true;
        } else {
            return false;
        }

    }

    //registro de datos
    public int buscarNombres(String nombreCompleto) {
        int m = -1;

        for (int i = 0; i < registroTarjeta.size(); i++) {
            if (registroTarjeta.get(i).getNombreCompleto().equals(nombreCompleto)) {
                m = i;
                break;

            }
        }
        return m;
    }

    public boolean agregarDatosUser(RegistroTarjeta registroTarjetas) {
        if (buscarNombres(registroTarjetas.getNombreCompleto()) != 1) {
            registroTarjeta.add(registroTarjetas);
            return true;
        } else {
            return false;
        }
    }

}
