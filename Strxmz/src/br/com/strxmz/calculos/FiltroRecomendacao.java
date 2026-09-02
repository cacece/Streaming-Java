package br.com.strxmz.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() == 3) {
            System.out.println("Está na média, mas vale a pena assistir.");
        } else {
            System.out.println("Coloque na sua lista de espera.");
        }
    }
    

}
