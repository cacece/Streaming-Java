import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;


        while (nota != -1) {
            System.out.println("Qual sua nota para o filme?(-1 para encerrar)" );
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
            
        }

        System.out.println("Media das notas: " + mediaAvaliacao / totalNotas);
    }
    
}
