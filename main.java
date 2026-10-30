import java.util.Scanner;

public class main {
    // Declaramos la variable Scanner para poder utilizar Scanner
    static Scanner sc = new Scanner(System.in);

    static void mostrarMenu(){
        System.err.println("1. XV años");
        System.err.println("2. Boda");
        System.err.println("3. Fotografía Empresarial");
        System.err.println("4. Fotografía de productos");
        System.out.print("Seleccione una opción: ");
    }

    
    
    public static void main(String[] args) {
    
        System.out.println("=== FOTODESK ===");
        mostrarMenu();
        int opcion = sc.nextInt();


    }
}