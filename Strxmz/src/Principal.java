import br.com.strxmz.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Paprika";
        meuFilme.nome.
        meuFilme.anoDeLancamento = 2006;
        meuFilme.incluidoNoPlano = true;
        meuFilme.somaDasAvaliacoes = 85.0;
        meuFilme.totalDeAvaliacoes = 10;
        meuFilme.duracaoEmMinutos = 90;

        meuFilme.avalia(6.1);
        meuFilme.exibeFichaTecnica();

    }
}
