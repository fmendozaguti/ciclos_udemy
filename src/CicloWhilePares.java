public class CicloWhilePares {
    public static void main(String[] args) {
        System.out.println("Números pares del 1 al 20");
        var contador = 1;
        while(contador <= 20){
            if(contador % 2 == 0){
                System.out.print(contador+" ");
            }
            contador++;
        };
        do{
            System.out.println(contador++);

        } while(contador <= 3);
    }
}
