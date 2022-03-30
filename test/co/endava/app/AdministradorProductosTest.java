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
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
        assertEquals(Descuento, p3.getDescuento());

    }
}