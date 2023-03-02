/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.beans.Municipio;

/**
 *
 * @author Usuario
 */
public class MunicipioDao {

    public static ArrayList<Municipio> municipio;

    public MunicipioDao() {
        municipio = new ArrayList<>();
    }

    //buscar
    public int buscarMuni(String nombreMuni) {
        int n = -1;
        for (int i = 0; i < municipio.size(); i++) {
            if (municipio.get(i).getNombreMuni().equalsIgnoreCase(nombreMuni)) {
                n = i;
                break;
            }
        }
        return n;
    }

    //agregar
    public boolean agregarMuni(Municipio municipios) {
        if (buscarMuni(municipios.getNombreMuni()) == -1) {
            municipio.add(municipios);
            return true;
        } else {
            return false;
        }
    }

    //obtener
    public Municipio obtenerMuni(String nombreMuni) {
        if (buscarMuni(nombreMuni) != -1) {
            return municipio.get(buscarMuni(nombreMuni));
        } else {
            return null;
        }
    }

}
