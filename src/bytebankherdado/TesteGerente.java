package bytebankherdado;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente funcionario = new Gerente();
        funcionario.setNome("Abraão Sousa");
        funcionario.setSalario(4000.0);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());

        funcionario.setSenha(1234);
        boolean autentica = funcionario.autentica(1234);

        System.out.println(autentica);
        
    }
}
