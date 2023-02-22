/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.beans.Region;

/**
 *
 * @author Usuario
 */
public class RegionDao {

    public List<Region> region;

    public RegionDao() {
        region = new ArrayList<>();
    }

    //bucar codigo;
    public int buscarCodigo(String codigo) {
        int n = -1;

        for (int i = 0; i < region.size(); i++) {
            if (region.get(i).getCodigo().equals(codigo)) {
                n = i;
                break;
            }
        }
        return n;
    }

    //agregar kiscos
    public boolean agregarRegion(Region regiones) {
        if (buscarCodigo(regiones.getCodigo()) == -1) {
            region.add(regiones);
            return true;
        } else {
            return false;
        }
    }

    //buscar kioco
    public Region obtenerRegion(String codigo) {
        if (buscarCodigo(codigo) != -1) {
            return region.get(buscarCodigo(codigo));
        } else {
            return null;
        }
    }

}
