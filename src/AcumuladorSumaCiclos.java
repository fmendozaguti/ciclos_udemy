public class AcumuladorSumaCiclos {
    public static void main(String[] args) {
        System.out.println("Acumulador SumaCiclos");
        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        var numero = 1;
        while(numero <= MAXIMO){
            acumuladorSuma += numero++;
        }
        System.out.println("la suma de los primeros "+MAXIMO+" es igual a "+acumuladorSuma);
    }
}
