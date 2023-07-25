package bytebank;

public class CriarConta {
   public static void main(String[] args) {
      Conta primeirConta = new Conta();
      primeirConta.saldo = 200;
      System.out.println(primeirConta.saldo);

      primeirConta.saldo += 100;
      System.out.println(primeirConta.saldo);

      Conta segundaConta = new Conta();
      segundaConta.saldo = 50;

      System.out.println("Segunda Conta " + segundaConta.saldo);
      System.out.println("Primeira Conta: " + primeirConta.saldo);
      System.out.println(primeirConta.titular);

      System.out.println(segundaConta.agencia);

      if (primeirConta == segundaConta){
         System.out.println("São a mesma conta");
     } else {
         System.out.println("conta diferente");
     }


   }

}
