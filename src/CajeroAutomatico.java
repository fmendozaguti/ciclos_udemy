import java.sql.SQLOutput;
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE CAJERO AUTOMATICO");
        var op = new Scanner(System.in);
        var cantidad = new Scanner(System.in);
        var salir = false;
        var saldo = 10000;

        while(!salir){

            System.out.println("""
                    *** Escoje la opción ***
                    1. Consultar Saldo
                    2. Retirar Saldo
                    3. Depositar Saldo
                    4. Salir
                    Ingrese el número de la opción: 
                    """);
            var opcion = op.nextInt();
            switch (opcion){
                case 1 -> System.out.println("Tu saldo actual es de : "+ saldo);
                case 2 -> {
                    System.out.println("Cuanto saldo desea retirar?");
                    var retiro = cantidad.nextInt();
                    saldo = saldo - retiro;
                    System.out.println("Acabas de retirar: "+retiro+", Tu saldo actual es de: " + saldo);
                }
                case 3 -> {
                    System.out.println("Cuanto saldo desea depositar?");
                    var deposito = cantidad.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("Tu saldo actual es: " + saldo);
                }
                case 4 -> {
                    System.out.println("Gracias por usar el servicio de cajero automatico - ¡Buen día!");
                    salir = false;
                }
                default -> System.out.println("Opción invalida, selecciona otra opción.");
            }
        }
    }
}
