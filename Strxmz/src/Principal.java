import br.com.strxmz.calculos.CalculadoraDeTempo;
import br.com.strxmz.modelos.Filme;
import br.com.strxmz.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme paprikaFilme = new Filme();

        paprikaFilme.setNome("Paprika");
        paprikaFilme.setAnoDeLancamento(2006);
        paprikaFilme.setIncluidoNoPlano(true);
        paprikaFilme.setDuracaoEmMinutos(90);

        paprikaFilme.avalia(8.5);
        paprikaFilme.avalia(9.0);
        paprikaFilme.avalia(7.5);
        paprikaFilme.avalia(10.0);
        paprikaFilme.avalia(6.1);

        paprikaFilme.exibeFichaTecnica();

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Attack on Titan");
        minhaSerie.setAnoDeLancamento(2013);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpisodiosPorTemporada(12);
        minhaSerie.setMinutosPorEpisodio(24);

        minhaSerie.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    }
}