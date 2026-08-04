public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2006;
        boolean incluidoNoPlano = true;
        double notdaDoFilme = 8.4;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2025){
            System.out.println("Lancamentos que os usuários estão curtindo! ");
        } else {
            System.out.println("Clássicos que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")){
            System.out.println("Filme liberado.");
        } else {
            System.out.println("Deve pagar a locacão ou plano Plus");
        }
    }
}
