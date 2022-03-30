/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author dsanchez
 */
public class AdministradorProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crean los objetos y se inicializan
        Producto p1 = new Producto(101, "Café", 1500);
        Producto p2 = new Producto(102, "Azucar", 2500);
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(2));
        Producto p4 = new Bebida(104, "Té", 1800);

        //Se imprime el valor precio de p1, p2,
        System.out.println(p1.getPrecio());
        System.out.println(p2.getPrecio());

        //Se imprime la fecha de vencimiento, precio y descuento de p3
        System.out.println("Fecha: "+ p3.getFechaVencimiento() +  ", Precio: "+ p3.getPrecio() + ", Dcto: " + p3.getDescuento());

        //Se imprime el precio, y el descuento de p4
        System.out.println("Precio: "+ p4.getPrecio() + ", Dcto: " + p4.getDescuento());

        //Se crea un quinto objeto y se inicializa
        Producto p5 = new Producto(105, "Agua", 1800);

        //Se crea funcion que imprime si el objeto no tiene valores, si nó, imprime si el nombre no tiene valores, y si tiene valores, lo imprime.
        if (p5 == null) {
            System.out.println("El objeto está nulo");
        } else {
            if (p5.getNombre() == null) {
                System.out.println("El nombre está nulo");
            } else {
                System.out.println(p5.getNombre());
            }
        }
        //Se crea variable con tipo de dato BigDecimal el cual almacena gran cantidad de decimales de un número
        BigDecimal numero = BigDecimal.ZERO;
        //Intenta convertir un número entero a un valor con decimales e imprime el resultado
        try {
            numero = BigDecimal.valueOf(Long.parseLong("140"));
        } catch (Exception e){
            numero = BigDecimal.ONE;
            System.out.println("No se pudo convertir " + e);
        }
        System.out.println(numero);
    }
    
}
