/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalTime;

/**
 *
 * @author cafajardo
 */
//Hereda atributos del metodo Producto
public class Bebida extends Producto {
    //Agrega los atributos del padre
    public Bebida(int id, String nombre, double precio){
        super(id, nombre, precio);
    }
    //Sobrecarga el metodo de descuento, si la hora actual está entre las 17 y las 18 efectua el descuento, si no el descuento es de 0.
    @Override
    public double getDescuento() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(17, 0)) && now.isBefore(LocalTime.of(18, 0))) {
            return this.getPrecio();
        } else {
            return 0;
        }
    }
}
