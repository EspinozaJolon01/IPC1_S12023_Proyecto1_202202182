/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
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
