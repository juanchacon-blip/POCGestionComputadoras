/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cal.gestioncomputadoras.model;

import java.time.LocalDate;

/**
 * Clase A: Computadora. Hereda de DispositivoElectronico (la clase
 * madre) los atributos Codigo, Marca, Modelo, Precio y
 * FechaFabricacion, y agrega sus propios atributos: MemoriaRAM y
 * Procesador.
 *
 * @author UNIBAGUE
 */
public class Computadora extends DispositivoElectronico {

    private int memoriaRAM;
    private String procesador;

    public Computadora(String codigo, String marca, String modelo, double precio, LocalDate fechaFabricacion, int memoriaRAM, String procesador) throws Exception {
        super(codigo, marca, modelo, precio, fechaFabricacion);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
    }

    @Override
    public double calcularValorActual() {
        return getPrecio() * 0.85;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

}
