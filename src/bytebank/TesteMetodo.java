package bytebank;

public class TesteMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println(conta.saldo);

        boolean retiradaDinehiro = conta.saca(20);
        System.out.println(retiradaDinehiro);

        Conta contaDois = new Conta();
        contaDois.deposita(2000);

        if (contaDois.transfere(200, conta)){
            System.out.println("Relizado com sucesso!");
        } else {
            System.out.println("Não realizado");
        }
        System.out.println(contaDois.saldo);

        conta.titular = "Rubens Abraão";
        System.out.println(conta.titular);


    }
}
