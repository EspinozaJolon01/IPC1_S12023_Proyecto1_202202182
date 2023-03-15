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

    public static ArrayList<User> users;

    public UserDao() {
        //inicializanando el usuario
        users = new ArrayList<>();

    }

    public boolean listarUsuarios() {
        for (int i = 0; i < users.size(); i++) {
            users.get(i);

        }
        return false;
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

    //
    public static String buscarUsuarioTarjeta(String correo) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getCorreo().equals(correo)) {
                return users.get(i).getCorreo();
            }
        }
        return null;
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

    //verificar sin existe el usuario
    public User obtenerDatosPorUsuarioYContrasenia(String correo, String password) {
        if (buscarDatosPorUsuarioYContrasenia(correo, password) != -1) {
            return users.get(buscarDatosPorUsuarioYContrasenia(correo, password));
        } else {
            return null;
        }
    }

    //buscar el usuario
    public int buscarDatosPorUsuarioYContrasenia(String correo, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getCorreo().equals(correo) && users.get(i).getPassword().equals(password)) {
                return i;
            }
        }
        return -1;
    }

    //Obtener id del ultimo usuario
    public static Integer getLastId() {
        return users.get(users.size() - 1).getId();
    }

    //prueba
    public User buscarRolUserExistente(String correo) {
        if (buscarUsuario(correo) != -1) {
            for (int i = 0; i < users.size(); i++) {
                users.get(i).getRol();
            }

        } else {
            return null;
        }
        return null;
    }

    //actualizar
    public void modificarUser(String correo, String nombre, String apellido, String password, String dpi, String fecha, String sobreNombre, String telefono, String nacionalidad, String genero,String foto) {

        for (User user : users) {
            if (user.getCorreo().equals(correo)) {

                user.setApellido(apellido);
                user.setNombre(nombre);
                user.setCorreo(correo);
                user.setPassword(password);
                user.setDpi(dpi);
                user.setFecha(fecha);
                user.setSobreNombre(sobreNombre);
                user.setNacionalidad(nacionalidad);
                user.setGenero(genero);
                user.setTelefono(telefono);
                user.setFoto(foto);

            }
        }

    }
    
    
 
    

}
