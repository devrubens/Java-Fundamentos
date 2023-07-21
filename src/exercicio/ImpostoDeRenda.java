package exercicio;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        System.out.println("Imposto de renda");

        double salario = 2300.0;

        if (salario <= 1899.99){
            
            System.out.println("Você é insento de IR");
        
        } if (salario >= 1900.00 && salario <= 2800.00){
            
            System.out.println("O valor do IR é de 7.5% para redução");
            double cotaUmIr = salario - 142;
            System.out.println("Seu valor eh: " + cotaUmIr);

        } if (salario >= 3751.0){

            System.out.println("O vakir do IR é de 15% para redução");
            double cotaDoisIr = salario - 350;
            System.out.println("Seu valor eh: " + cotaDoisIr);

        } else {
            System.out.println("O valor do IR é de 22.5 para redução");
            double cotaTresIr = salario - 636;
            System.out.println("Seu valor eh: " + cotaTresIr);
        }
    }
}
