/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.beans.User;

/**
 *
 * @author User
 */
public class UserDao {

    public List<User> users;

    public UserDao() {
        //inicializanando el usuario
        users = new ArrayList<>();

    }

    //buscar el usuario
    public int buscarUsuario(String correo) {
        int n = -1;

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getCorreo().equals(correo)) {
                n = i;
                break;
            }
        }
        return n;
    }

    public boolean verificarContra(User user) {
        if (user.getPassword().length() > 8) {
            boolean mayus = false;
            boolean num = false;
            boolean simbolosEspciales = false;
            char c;

            for (int i = 0; i < user.getPassword().length(); i++) {
                String simbolos = user.getPassword();
                c = user.getPassword().charAt(i);

                if (Character.isDigit(c)) {
                    num = true;
                }
                if (Character.isUpperCase(c)) {
                    mayus = true;
                }
                if (simbolos.charAt(i) >= 32 && simbolos.charAt(i) <= 44) {
                    simbolosEspciales = true;
                }
            }

            if (num && mayus && simbolosEspciales) {

                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    //agregar usuario
    public boolean agregarUsuario(User user) {
        if (buscarUsuario(user.getCorreo()) == -1) {

            users.add(user);

            return true;
        } else {
            return false;
        }

    }

    //verificar sin existe el usuario
    public User obtener(String correo) {
        if (buscarUsuario(correo) != -1) {
            return users.get(buscarUsuario(correo));
        } else {
            return null;
        }
    }
}