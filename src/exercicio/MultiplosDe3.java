package exercicio;

public class MultiplosDe3 {
    public static void main(String[] args) {
        System.out.println("Desafio multiplos de 3: ");

        for (int numero = 1; numero < 100; numero++){
            if(numero % 3 == 0) {
                System.out.println(numero);
            }
        }
    }
}
