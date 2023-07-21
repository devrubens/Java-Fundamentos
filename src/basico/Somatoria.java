package basico;

public class Somatoria {
    public static void main(String[] args) {
        System.out.println("Somatoria usando While: ");
        int total = 0;

        int contador = 0;
        while (contador <= 10){
            total += contador;

            contador++;
        }
        System.out.println(total);
    }
}
