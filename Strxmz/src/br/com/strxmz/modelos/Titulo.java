package br.com.strxmz.modelos;

public class Titulo {
private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());
        System.out.println("Incluido no plano: " + getIncluidoNoPlano());
        System.out.println("Duração media para maratonar: " + getDuracaoEmMinutos() + " minutos");
        if (getTotalDeAvaliacoes() > 0) {
            System.out.println("Media das avaliacoes: " + pegaMedia());
        } else {
            System.out.println("Nenhuma avaliacao registrada.\n");
        }
        if (getTotalDeAvaliacoes() > 0) {
            System.out.println("Total de avaliações: " + getTotalDeAvaliacoes() + "\n");
        }
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
   
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
