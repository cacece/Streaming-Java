public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    double pegaMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Media das avaliacoes: " + pegaMedia());
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
}