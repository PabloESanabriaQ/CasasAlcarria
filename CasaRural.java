import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CasaRural {
    private String codigo, poblacion, direccion;
    private int numHabitacion;
    private double precio;
    boolean esAlta;

    public CasaRural(){
        esAlta = true;
        asigna();
    }
    
    public void asigna(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("\n Codigo 10 caracteres: ");
            codigo = entrada.readLine();
            System.out.println("\n Población: ");
            poblacion = entrada.readLine();            
            System.out.println("\n Direccion: ");
            direccion = entrada.readLine();
            System.out.println("\n Número de habitaciones: ");
            numHabitacion = Integer.parseInt(entrada.readLine());
            System.out.println("\n Precio por día de la estancia: ");
            precio = (new Double(entrada.readLine())).doubleValue();   
            
        } catch (IOException e) {
            System.out.println("Excepción en la entrada de datos: " + e.getMessage()
            + ". No se pudo dar de alta");
            esAlta = false;
        }
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void muestra(){
        System.out.println("\n Casa Rural " + codigo);
        System.out.println("Población " + poblacion);
        System.out.println("Dirección " + direccion);
        System.out.println("Precio por día " + precio);
    }
}