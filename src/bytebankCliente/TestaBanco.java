package bytebankCliente;

public class TestaBanco {
    public static void main(String[] args) {
        ContaCliente abraao = new ContaCliente();
        abraao.nome = "Abraão";
        abraao.cpf = "222.222.222-22";
        abraao.profissao = "Líder Técnico";

        Conta contaDoAbraao = new Conta();
        contaDoAbraao.deposita(100);


        //Associação da conta com o cliente
        contaDoAbraao.titular = abraao;
        System.out.println(contaDoAbraao.titular.nome);
    }
}
