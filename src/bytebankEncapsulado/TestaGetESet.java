package bytebankEncapsulado;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        // conta.numero = 1337;
        conta.setNumero(1377);
        System.out.println(conta.getNumero());

        ContaCliente abraao = new ContaCliente();
        abraao.setNome("Rubens Abraão");

        conta.setTitular(abraao);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("líder técnico");
        System.out.println(conta.getTitular().getProfissao());

    }
}
