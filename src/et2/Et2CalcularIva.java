package et2;

public class Et2CalcularIva {

    public static double calcularIva(double precio, double porcentajedeIva) {
        double iva = (precio * porcentajedeIva) / 100;
        return iva;
    }
}
