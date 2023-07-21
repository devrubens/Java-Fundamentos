package exercicio;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Desafio Fatorial: ");

        int fatorial = 1;

        for (int n = 1; n < 10; n ++){
            fatorial *= n;
            System.out.println("Fatorial de " + n + " = " + fatorial);

        }

    }
}
