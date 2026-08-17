/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cal.gestioncomputadoras.model;

import java.time.LocalDate;

/**
 * Clase madre (superclase) que representa un dispositivo electronico
 * generico. Todos los atributos y comportamientos comunes a cualquier
 * dispositivo electronico se definen aqui, y son heredados por las
 * clases hijas (por ejemplo, Computadora).
 *
 * @author UNIBAGUE
 */
public abstract class DispositivoElectronico {

    private String codigo;
    private String marca;
    private String modelo;
    private double precio;
    private LocalDate fechaFabricacion;

    public DispositivoElectronico(String codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
    }

    public DispositivoElectronico(String codigo, String marca, String modelo, double precio, LocalDate fechaFabricacion) throws Exception {
        this(codigo, marca);
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        setPrecio(precio);
    }

    public void setPrecio(double precio) throws Exception {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new Exception("Precio menor a 0");
        }
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    /**
     * Calcula el valor actual del dispositivo. Las clases hijas pueden
     * sobreescribir este metodo para aplicar su propia formula de
     * depreciacion (equivalente a calcularSalario() en el ejemplo de
     * Empleado/Docente).
     */
    public double calcularValorActual() {
        return precio;
    }

}
