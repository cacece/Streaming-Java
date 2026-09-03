import java.util.ArrayList;

import br.com.strxmz.calculos.CalculadoraDeTempo;
import br.com.strxmz.calculos.FiltroRecomendacao;
import br.com.strxmz.modelos.Episodio;
import br.com.strxmz.modelos.Filme;
import br.com.strxmz.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        var paprikaFilme = new Filme();
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

        var perfectBlueFilme = new Filme();
        perfectBlueFilme.setNome("Perfect Blue");
        perfectBlueFilme.setAnoDeLancamento(1997);
        perfectBlueFilme.setIncluidoNoPlano(true);
        perfectBlueFilme.setDuracaoEmMinutos(81);
        
        perfectBlueFilme.avalia(10.0);

        perfectBlueFilme.exibeFichaTecnica();

        var silentVoiceFilme = new Filme();
        silentVoiceFilme.setNome("A Voz do Silêncio");
        silentVoiceFilme.setAnoDeLancamento(2016);
        silentVoiceFilme.setIncluidoNoPlano(true);
        silentVoiceFilme.setDuracaoEmMinutos(130);

        silentVoiceFilme.avalia(9.5);

        silentVoiceFilme.exibeFichaTecnica();

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(paprikaFilme);
        listaDeFilmes.add(perfectBlueFilme);
        listaDeFilmes.add(silentVoiceFilme);
        System.out.println(listaDeFilmes);
        System.out.println("\nTamanho da lista de filmes: " + listaDeFilmes.size() + "\n");
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome() + "\n");



        var aotSerie = new Serie();
        aotSerie.setNome("Attack on Titan");
        aotSerie.setAnoDeLancamento(2013);
        aotSerie.setIncluidoNoPlano(true);
        aotSerie.setTemporadas(8);
        aotSerie.setEpisodiosPorTemporada(12);
        aotSerie.setMinutosPorEpisodio(24);

        aotSerie.exibeFichaTecnica();

        var calculadora = new CalculadoraDeTempo();
        calculadora.inclui(paprikaFilme);
        calculadora.inclui(aotSerie);
        calculadora.inclui(perfectBlueFilme);
        System.out.println("\nTempo para maratonar tudo: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(paprikaFilme);
        
        Episodio episodio1Aot = new Episodio();
        episodio1Aot.setNumero(1);
        episodio1Aot.setTotalDeVisualizacoes(150);
        episodio1Aot.setSerie(aotSerie);
        
        filtro.filtra(episodio1Aot);
    }
}