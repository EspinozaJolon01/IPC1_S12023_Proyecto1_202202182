/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.beans.Kiosco;

/**
 *
 * @author Usuario
 */
public class KioscoDao {

    public List<Kiosco> kiosco;

    public KioscoDao() {
        kiosco = new ArrayList<>();
    }

    //buscar kiosko
    public int buscarKiosco(String codigoKiosco) {
        int n = -1;

        for (int i = 0; i < kiosco.size(); i++) {
            if (kiosco.get(i).getCodigoKiosco().equalsIgnoreCase(codigoKiosco)) {
                n = i;
                break;
            }

        }
        return n;
    }

    //agregar kiosco
    public boolean agregarKiosco(Kiosco kioscos) {
        if (buscarKiosco(kioscos.getCodigoKiosco()) == -1) {
            kiosco.add(kioscos);
            return true;
        } else {
            return false;
        }
    }

    //buscar kiosco
    public Kiosco obtenerKisco(String codigoKiosco) {
        if (buscarKiosco(codigoKiosco) != -1) {
            return kiosco.get(buscarKiosco(codigoKiosco));

        } else {
            return null;
        }
    }
}
