/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.beans.Departamento;

/**
 *
 * @author Usuario
 */
public class DepartamentoDao {

    public static ArrayList<Departamento> departamento;

    public DepartamentoDao() {
        departamento = new ArrayList<>();
    }

    public int buscarDepart(String codigoDepart) {
        int n = -1;

        for (int i = 0; i < departamento.size(); i++) {
            if (departamento.get(i).getCodigoDepart().equals(codigoDepart)) {
                n = i;
                break;
            }
        }
        return n;
    }
//agregar

    public boolean agregarDepar(Departamento departamentos) {
        if (buscarDepart(departamentos.getCodigoDepart()) == -1) {
            departamento.add(departamentos);
            return true;
        } else {
            return false;
        }
    }

    //actualizar
    public void modificarDepartamento(String codigoDepart, String nombreDepart) {
        for (Departamento departamento1 : departamento) {
            if (departamento1.getCodigoDepart().equals(codigoDepart)) {

                departamento1.setNombreDepart(nombreDepart);

            }
        }
    }

    //obner
    public Departamento obtenerDepartemento(String codigoDepart) {
        if (buscarDepart(codigoDepart) != -1) {
            return departamento.get(buscarDepart(codigoDepart));
        } else {
            return null;
        }
    }

    //BUSCAR POR NOMBRE
    public static String searchDeapartmentByName(String nameDepartment) {
        for (int i = 0; i < departamento.size(); i++) {
            if (departamento.get(i).getNombreDepart().equals(nameDepartment)) {
                return departamento.get(i).getCodigoDepart();
            }
        }
        return null;
    }

    //BUSCAR POR NOMBRE
    public static String searchDeapartmentByNameAndReturnRegionCode(String nameDepartment) {
        for (int i = 0; i < departamento.size(); i++) {
            if (departamento.get(i).getNombreDepart().equals(nameDepartment)) {
                return departamento.get(i).getCodigo();
            }
        }
        return null;
    }

}
