import modelo.Moneda;
import modelo.MonedaAPI;

import java.util.Scanner;

public class CalculaMoneda {

    public static void calcularConversion(String monedaBase,
                                          String monedaObjetivo,
                                          Scanner lectura) {

        double monto;
        double montoTotal;

        ConsultarMoneda consultar = new ConsultarMoneda();
        System.out.println(" Ingresa el monto que deseas convertir: ");

        try {
            monto = Double.parseDouble(lectura.next());

            MonedaAPI monedasAPI = consultar.buscarMoneda(monedaBase, monedaObjetivo);

            Moneda moneda = new Moneda(monedasAPI);

            montoTotal = monto * moneda.getTasaConvertido();

            System.out.println("\nEl valor %.2f[%s] corresponde al valor final de: %.2f[%s]\n"
                    .formatted(monto, monedaBase, montoTotal, monedaObjetivo));

        } catch (NumberFormatException e) {
            System.out.println("Ingresa un monto valido ");
        }
    }
}


