/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cal.gestioncomputadoras.servicios;

import com.cal.gestioncomputadoras.model.DispositivoElectronico;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author UNIBAGUE
 */
public class ServicioDispositivo {

    private static Map<String, DispositivoElectronico> dispositivos = new HashMap();

    public static Map<String, DispositivoElectronico> getDispositivos() {
        return Map.copyOf(dispositivos);
    }

    public static void addDispositivo(DispositivoElectronico disp) {
        dispositivos.put(disp.getCodigo(), disp);
    }

    public static double calcularSumatoriaValores() {
        double sumaTotal = 0.0;

        if (dispositivos != null) {
            for (DispositivoElectronico disp : dispositivos.values()) {
                if (disp != null) {
                    sumaTotal += disp.getPrecio();
                }
            }
        }

        return sumaTotal;
    }

    public static DispositivoElectronico buscarDispositivo(String modelo) {

        if (dispositivos != null) {
            for (DispositivoElectronico disp : dispositivos.values()) {
                if (disp != null && (disp.getModelo().equalsIgnoreCase(modelo))) {
                    return disp;
                }
            }
        }

        return null;
    }
}
