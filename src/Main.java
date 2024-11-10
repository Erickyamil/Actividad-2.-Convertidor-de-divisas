import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int opcionEntrada;
        int opcionSalida;

        do {
            do { // Validar la opción de entrada.
                System.out.println("---Menu de opciones---");
                System.out.println("Seleccione su divisa de origen: ");
                System.out.println("1) Dólar");
                System.out.println("2) Euro");
                System.out.println("3) Peso");
                System.out.println("4) Yen");
                System.out.println("5) Rublo");
                System.out.println("6) Cancelar");
                opcionEntrada = entrada.nextInt();

                if (opcionEntrada < 1 || opcionEntrada > 6) {
                    System.out.println("Opción no válida. Por favor, ingrese una opción [1-6].");
                }
            } while (opcionEntrada < 1 || opcionEntrada > 6);

            if (opcionEntrada == 6) {
                System.out.println("Saliendo...");
                break;
            }

            do { // Validar la opción de salida.
                System.out.println("Seleccione su divisa de destino: ");
                System.out.println("1) Dólar");
                System.out.println("2) Euro");
                System.out.println("3) Peso");
                System.out.println("4) Yen");
                System.out.println("5) Rublo");
                System.out.println("6) Salir");
                opcionSalida = entrada.nextInt();

                if (opcionSalida < 1 || opcionSalida > 6) {
                    System.out.println("Opción no válida. Por favor, ingrese una opción [1-6].");
                }
            } while (opcionSalida < 1 || opcionSalida > 6);

            if (opcionSalida == 6) {
                System.out.println("Saliendo...");
                break;
            }

            //solicitar cantidad de de entrada
            System.out.println("Ingrese su cantidad de entrada: ");
            double cantidadEntrada = entrada.nextDouble();

            DivisaEntrada origen = new DivisaEntrada(cantidadEntrada, opcionEntrada);
            DivisaSalida destino = new DivisaSalida(origen.calcularSalida(), opcionSalida);
            double cantidadSalida = destino.calcularSalida();

            String nombreOrigen = origen.obtenerNombreDivisa(opcionEntrada);
            String nombreDestino = destino.obtenerNombreDivisa(opcionSalida);

            // imprimir el resultado de la conversión
            System.out.println(cantidadEntrada + " " + nombreOrigen + " son " + 
                                cantidadSalida + " " + nombreDestino);
            System.out.println();
            
        } while (opcionEntrada != 1);
        entrada.close();
    }
}
