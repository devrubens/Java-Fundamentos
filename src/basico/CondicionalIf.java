package basico;

public class CondicionalIf {
    public static void main(String[] args) {
        System.out.println("Condicionais com If");
        int idade = 16;
        int quantidadePessoas = 3;
        if ( idade >= 18){
            System.out.println("Você pode beber maluco!");
        } else {
            if (quantidadePessoas >= 4){
                System.out.println("Você pode entrar, mas não pode beber");
            }else {
                System.out.println("Você não está nem acompanhado e nem pode beber maluco");
            }
            System.out.println("Você tá doido? Não pode beber aqui!");
        } 
    }
}
