import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "";
        TablaDispersa tabla = new TablaDispersa();
        CasaRural casa;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("-----------------");
            System.out.println("1 - INSERTAR CASA");
            System.out.println("2 - BUSCAR CASA");
            System.out.println("3 - ELIMINAR CASA");
            System.out.println("-----------------");
            System.out.println("0 - SALIR");
            try {
                opcion = entrada.readLine();
            } catch (IOException e) {
                System.out.println("Elija una opción de la lista.");
            }
            switch (opcion) {
                case "1":
                    casa = new CasaRural();
                    tabla.insertar(casa);
                    break;
                case "2":
                    System.out.print("Ingrese la casa que desea buscar: ");
                    try {
                        CasaRural buscado = tabla.buscar(entrada.readLine());
                        buscado.muestra();
                    } catch (Exception e) {
                        System.out.println("La casa no existe, ingrese nuevamente o presione 0 para salir");
                    }
                    break;
                case "3":
                    System.out.print("Ingrese el código de la casa que desea eliminar: ");
                    try {
                        tabla.eliminar(entrada.readLine());
                    } catch (IOException e) {
                        System.out.println("Código incorrecto, ingrese nuevamente o presione 0 para salir");
                    }
                    break;
                case "0":
                    break;
            }
        } while (!opcion.equals("0"));
    }
}