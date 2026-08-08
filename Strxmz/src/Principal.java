public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Paprika";
        meuFilme.anoDeLancamento = 2006;
        meuFilme.incluidoNoPlano = true;
        meuFilme.avaliacao = 8.5;
        meuFilme.totalDeAvaliacoes = 1000;
        meuFilme.duracaoEmMinutos = 90;
        meuFilme.exibeFichaTecnica();
    }
}
