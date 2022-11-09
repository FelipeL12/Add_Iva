package et2;

import java.util.Scanner;

public class Et2Main {
    public static void main(String[] args) {

        double precio = 0;
        double porcentajeIva = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el precio base (separado por .)");
        precio = sc.nextDouble();

        System.out.println("Digite el procentaje de iva");
        porcentajeIva = sc.nextDouble();

        double iva = Et2CalcularIva.calcularIva(precio, porcentajeIva);

        Et2GenerarPrecioConIva.calcularPrecioConIva(precio, iva);

    }

}