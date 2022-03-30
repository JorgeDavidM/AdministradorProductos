/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

/**
 *
 * @author cafajardo
 */
//Se crea objeto producto con variables privadas
public class Producto {
    
    private int id;
    private String nombre;
    private double precio;

    //Crea función Producto
    public Producto() {
    }
    //Instancia los atributos de Producto
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Crea funcion que regresa el id
    public int getId() {
        return id;
    }
    //Permite asignar un nuevo id y lo instancia
    public void setId(int id) {
        this.id = id;
    }
    //Crea funcion que regresa el nombre
    public String getNombre() {
        return nombre;
    }
    //Permite asignar un nuevo nombre y lo instancia
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Crea funcion que regresa el precio
    public double getPrecio() {
        return precio;
    }
    //Permite asignar un nuevo precio, pero si este es menor a 0, conserva el valor antiguo.
    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("No se permiten precios negativos");
        } else {
            this.precio = precio;
        }
    }
    //Crea funcion que hace un descuento sobre el valor del precio (0.1 dia)
    public double getDescuento(){
        return precio * 0.1d;
    }
    //Sobrecarga el metodo para que imprima el id, nombre y precio
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + precio;
    }
}
