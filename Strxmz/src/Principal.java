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

        Serie aotSerie = new Serie();
        aotSerie.setNome("Attack on Titan");
        aotSerie.setAnoDeLancamento(2013);
        aotSerie.setIncluidoNoPlano(true);
        aotSerie.setTemporadas(8);
        aotSerie.setEpisodiosPorTemporada(12);
        aotSerie.setMinutosPorEpisodio(24);

        aotSerie.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(paprikaFilme);
        calculadora.inclui(aotSerie);
        System.out.println("\nTempo para maratonar tudo: " + calculadora.getTempoTotal());
    }
}