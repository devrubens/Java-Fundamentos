package bytebankEncapsulado;



public class Conta {
    

    private double saldo;
    private int agencia;
    private int numero;
    private ContaCliente titular;
    private static int total;

public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de conta é" + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta" + this.numero);
    }

    public void deposita(double valor){
        
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){

        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }

        return false;

    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("Não pode ser numero negativo");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Não pode ser realizado com numero negativo");
            return;
        }
        this.agencia = agencia;
    }
    

    public void setTitular(ContaCliente titular) {
        this.titular = titular;
    }

    public ContaCliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
