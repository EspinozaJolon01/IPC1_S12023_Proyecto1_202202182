/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.Comparator;
import modelo.beans.Venta;

/**
 *
 * @author Usuario
 */
public class ordenamiento implements Comparator<Venta> {

    @Override
    public int compare(Venta o1, Venta o2) {
        if (o1.getnPaquete() > o2.getnPaquete()) {
            return -1;
        } else if (o1.getnPaquete() > o2.getnPaquete()) {
            return 0;
        } else {
            return 1;
        }
    }

}
