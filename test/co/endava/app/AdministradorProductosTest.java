package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @org.junit.jupiter.api.Test
    public void main() {
        Double Descuento;
        Descuento = 150.0;
        Producto p1 = new Producto(101, "Café", 1500);
        assertEquals(Descuento, p1.getDescuento());

    }
}