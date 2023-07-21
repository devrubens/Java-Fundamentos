package basico;

public class CondicionalBoolean {
    public static void main(String[] args) {
        System.out.println("Codicionais com IF e Bool");
        int idade = 16;
        int quantidadePessoas = 4;
        boolean casal = quantidadePessoas >= 2;

        System.out.println("Você está acompanhado? " + casal);

        if ( idade >= 18 || casal){
            
            System.out.println("Você pode beber maluco!");

        } else {
            
            System.out.println("Você tá doido? Não pode beber aqui!");
        
        }

    
    }
}
