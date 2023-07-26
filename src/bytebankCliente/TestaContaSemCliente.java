package bytebankCliente;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaTeste = new Conta();
        System.out.println(contaTeste.getSaldo());

        contaTeste.titular = new ContaCliente();
        System.out.println(contaTeste.titular);
        contaTeste.titular.nome = "Marcela";
        System.out.println(contaTeste.titular.nome);
    }
}
