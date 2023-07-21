package basico;

public class Conversao {
    public static void main (String [] args){

        double salario = 134.23;
        int valor = (int)salario; // casting
        System.out.println("valor do numero: " + valor);

        long numeroGrande = 1234567890;
        short valorPequeno = (short)numeroGrande;
        byte b = 127;
        float flutuante = 3.14f;

    }
}
