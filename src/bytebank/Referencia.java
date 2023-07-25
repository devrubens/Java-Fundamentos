package bytebank;

public class Referencia {
    public static void main(String[] args) {
        Conta primeirConta = new Conta();
        primeirConta.saldo = 300;

        System.out.println("Saldo primeira conta: " + primeirConta.saldo);

        Conta segundaConta = primeirConta;
        System.out.println(segundaConta);

        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);
        System.out.println(primeirConta.saldo);

        if (primeirConta == segundaConta){
            System.out.println("São a mesma conta");
        } else {
            System.out.println("conta diferente");
        }
    }
}
