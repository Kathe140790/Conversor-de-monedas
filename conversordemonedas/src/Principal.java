import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        CalculaMoneda mostrar = new CalculaMoneda();

        int opcion = 0;

        String menuOpciones = """
                ------------------------------------------------
                Conversor de monedas
                
                Selecciona el tipo de conversion a realizar
                
                1. Dolar --> Peso Argentino
                2. Peso Argenino --> Dolar
                3. Dolar --> Real Brasilenio
                4. Real Brasilenio --> Dolar
                5. Dolar --> Peso Colombiano
                6. Peso Colombiano --> Dolar
                7. Salir
                ------------------------------------------------
                """;

        while (opcion != 7) {
            System.out.println(menuOpciones);
            System.out.println("Selecciona una opcion valida: ");

            try {
                opcion = Integer.parseInt(lectura.next());

                switch (opcion) {

                    case 1 -> {
                        System.out.println(" dolar a peso argentino");
                        mostrar.calcularConversion("USD", "ARS", lectura);
                    }

                    case 2 -> {
                        System.out.println(" dolar a peso argentino");
                        mostrar.calcularConversion("ARS", "USD", lectura);
                    }

                    case 3 -> {
                        System.out.println(" dolar a peso argentino");
                        mostrar.calcularConversion("USD", "BRL", lectura);
                    }

                    case 4 -> {
                        System.out.println(" dolar a peso argentino");
                        mostrar.calcularConversion("BRL", "USD", lectura);
                    }

                    case 5 -> {
                        System.out.println(" dolar a peso argentino");
                        mostrar.calcularConversion("USD", "COP", lectura);
                    }

                    case 6 -> {
                        System.out.println(" dolar a peso argentino");
                        mostrar.calcularConversion("COP", "USD", lectura);
                    }

                    case 7 -> {
                        System.out.println("SALIR");
                       
                    }

                    default -> {
                        System.out.println("Opcion no valida");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un numero valido");
            } catch (InputMismatchException e) {
                System.out.println("Ocurrio un error. Ingresa un numero");
                lectura.next();
            }
        }
        lectura.close();
    }
}






