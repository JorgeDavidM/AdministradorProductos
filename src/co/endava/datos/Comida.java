/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalDate;

/**
 *
 * @author cafajardo
 */
//el metodo Comida hereda de Producto
public class Comida extends Producto {
    //crea variable privada con la fecha actual
    private LocalDate fechaVencimiento;
    //Crea metodo con sus atributos, trae los atributos del metodo padre e instancia la fecha de vencimiento.
    public Comida(int id, String nombre, double precio, LocalDate fechaVencimiento) {
        super(id, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }
    //Crea metodo que regresa la fecha de vencimiento
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    //Crea metodo que asigna fecha a la variable fechaVencimiento sin retornarla.
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //Sobrecarga el metodo descuento haciendo funcion donde compara la fecha actual con fechaVencimiento, si es asi, aplica descuento, si no, regresa un 0.
    @Override
    public double getDescuento() {
        if (fechaVencimiento.equals(LocalDate.now())) {
            return super.getDescuento();
        } 
        else {
            return 0;
        }
    }
    //Sobrecarga el metodo trayendo la fecha de vencimiento del metodo padre.
    @Override
    public String toString(){
        return super.toString() + ", " + fechaVencimiento;
    }
}
