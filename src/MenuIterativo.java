import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        while(!salir){
            System.out.println("""
                    *** SISTEMA DE ADMINISTRACIÓN DE CUENTAS
                    Menú:
                    1. Crear cuenta.
                    2. Eliminar cuenta.
                    3. Salir.
                    Escoje la opción:\s
                    """);
            var opcion = consola.nextInt();
            switch(opcion){
                case 1 ->
                    System.out.println("Creando tu cuenta...\n");
                case 2 ->
                    System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliando tu cuenta...\n");
                    salir = true;
                }
                default ->
                    System.out.println("Opción invalida...\n");
            }
        }
        System.out.println("Fin del sistema de administración de cuentas. Adios!");
    }
}
