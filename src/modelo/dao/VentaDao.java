/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.beans.Venta;

/**
 *
 * @author Usuario
 */
public class VentaDao {

    public static ArrayList<Venta> ventas;
    public static ArrayList<Venta> ventasNpaquetes;

    public VentaDao() {
        ventas = new ArrayList<>();
        ventasNpaquetes = new ArrayList<>();

    }

    public static ArrayList<Venta> ordenarPaquetes() {
        ventasNpaquetes = ventas;
        Collections.sort(ventasNpaquetes);
        ventasNpaquetes.sort((o1, o2) -> o1.compareTo(o2));
        return ventasNpaquetes;
    }

    //crear Ventas
    public boolean realizarVentas(Venta venta) {
        ventas.add(venta);

        return true;
    }

    public static ArrayList<Venta> getSalesById(Integer id) {
        ArrayList<Venta> saleById = new ArrayList<>();

        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getId().equals(id)) {
                saleById.add(ventas.get(i));
            }
        }

        return saleById;
    }

    //sumar venta totales
    public static Double obtenerTotalSumarlo() {
        double num = 0;
        for (int i = 0; i < ventas.size(); i++) {
            double total = ventas.get(i).getTotal();
            num += total;
        }
        return num;

    }

    //sumar venta totales
    public static int obtenerPaquetesTotales() {
        int num = 0;
        for (int i = 0; i < ventas.size(); i++) {
            int total = ventas.get(i).getnPaquete();
            num += total;
        }
        return num;

    }

    //generar codigo
    public static String codigoPaquetes() {
        final String cadena = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXZYabcdefhijklmnpqrstuvwxyz";

        final int longitud = 5;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            double aleatorio = Math.random() * cadena.length();
            int posicion = (int) aleatorio;
            char letra = cadena.charAt(posicion);
            sb.append(letra);
        }

        return "IPCD_" + sb.toString() + "" + sb.length();
    }

    //generar codigo de venta
    public static String nFacturas() {
        final String cadena = "1234567890";

        final int longitud = 5;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            double aleatorio = Math.random() * cadena.length();
            int posicion = (int) aleatorio;
            char letra = cadena.charAt(posicion);
            sb.append(letra);
        }

        return sb.toString() + "" + sb.length();
    }

}
