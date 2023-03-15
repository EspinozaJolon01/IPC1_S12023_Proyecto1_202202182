/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.beans.DatosFacturacion;
import modelo.beans.RegistroTarjeta;
import modelo.beans.User;
import static modelo.dao.UserDao.users;

/**
 *
 * @author Usuario
 */
public class RegistroTarjetaDao {

    public static ArrayList<RegistroTarjeta> registroTarjeta;

    public RegistroTarjetaDao() {
        registroTarjeta = new ArrayList<>();

    }

    public static ArrayList<RegistroTarjeta> getSalesById(Integer id) {
        ArrayList<RegistroTarjeta> saleById = new ArrayList<>();

        for (int i = 0; i < registroTarjeta.size(); i++) {
            if (registroTarjeta.get(i).getId().equals(id)) {
                saleById.add(registroTarjeta.get(i));
            }
        }

        return saleById;
    }

    //actualizar
    public void modificarKiosco(String nombreTarjeta, String numTarjeta, String fechaVencimiento) {
        for (RegistroTarjeta registroTarjeta1 : registroTarjeta) {
            if (registroTarjeta1.getNombreTarjeta().equals(nombreTarjeta)) {
              
                registroTarjeta1.setNumTarjeta(numTarjeta);
                registroTarjeta1.setFechaVencimiento(fechaVencimiento);

            }
        }
    }

    //buscar
//    public int buscarTarjeta(String nombreTarjeta) {
//        int n = -1;
//        for (int i = 0; i < registroTarjeta.size(); i++) {
//            if (registroTarjeta.get(i).getNombreTarjeta().equals(nombreTarjeta)) {
//                n = i;
//                break;
//            }
//
//        }
//        return n;
//    }
    public boolean AgregarTarjeta(RegistroTarjeta registroTarjetas) {
        registroTarjeta.add(registroTarjetas);
        return true;
    }

    public static ArrayList buscarNumeroTarjeta(String correoTarjeta) {

        ArrayList tajertasUsuario = new ArrayList<>();

        for (int i = 0; i < registroTarjeta.size(); i++) {
            if (registroTarjeta.get(i).getCorreo().equals(correoTarjeta)) {
                tajertasUsuario.add(registroTarjeta.get(i));
            }

        }
        return tajertasUsuario;
    }

}
