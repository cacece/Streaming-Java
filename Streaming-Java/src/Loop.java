import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Qual sua nota para o filme?" );
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        mediaAvaliacao /= 3;
        System.out.println("Media das notas: " + mediaAvaliacao);
    }
    
}
