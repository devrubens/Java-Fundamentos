package basico;

public class EscopoVariavel {
    public static void main(String[] args) {
        System.out.println("Escopo de variáveis");

        int idade = 16;
        int quantidadePessoas = 4;
        
        
        //boolean casal = quantidadePessoas >= 2;

        boolean acompanhado;

        if (quantidadePessoas >= 2){
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("Você está acompanhado? " + acompanhado);

        if ( idade >= 18 || acompanhado){
            
            System.out.println("Você pode beber maluco!");

        } else {
            
            System.out.println("Você tá doido? Não pode beber aqui!");
        
        }

    }
}
