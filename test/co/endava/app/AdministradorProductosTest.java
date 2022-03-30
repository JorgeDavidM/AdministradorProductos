package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @org.junit.jupiter.api.Test
    public void main() {
        //Prueba unitaria nombre
        String Nombre;
        Nombre = "Café";
        Producto p1 = new Producto(101, "Café", 1500);
        assertEquals(Nombre, p1.getNombre());

        //Prueba unitaria descuento
        Double Descuento;
        Descuento = 200.0;
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
        assertEquals(Descuento, p3.getDescuento());

        //Prueba unitaria ID
        int id;
        id = 102;
        Producto p2 = new Producto(102, "Azucar", 2500);
        assertEquals(id, p2.getId());
    }
}