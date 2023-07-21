package basico;

public class LaçoBreak {
    public static void main(String[] args) {
        System.err.println("Utilizando Break no For: ");
        for (int linha = 0; linha <= 10; linha++){
            for(int coluna = 0; coluna <= 10; coluna++){
                if(coluna > linha){
                    break;
                }
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
