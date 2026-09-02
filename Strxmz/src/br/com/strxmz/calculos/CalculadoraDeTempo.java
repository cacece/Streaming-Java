package br.com.strxmz.calculos;
import br.com.strxmz.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

// public void inclui(Filme f) {
//     this.tempoTotal += f.getDuracaoEmMinutos();
// }

// public void inclui(Serie s) {
//     this.tempoTotal += s.getDuracaoEmMinutos();
// }

    public void inclui(Titulo t) {
        System.out.println("\nAdicionando duração em minutos de: " + t.getNome());
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
