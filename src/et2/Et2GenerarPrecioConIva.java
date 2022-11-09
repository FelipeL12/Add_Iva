package et2;

public class Et2GenerarPrecioConIva {

    static void calcularPrecioConIva(double precio, double iva) {
        double precioConIva = precio + iva;
        System.out.println("El precio con iva es: " + precioConIva);
    }
}
