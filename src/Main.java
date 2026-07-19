public class Main{

    public static void main(String[] args) {
        System.out.println("Welcome to Strxmz");
        System.out.println("Filme: Paprika");

        int anoDeLancamento = 2006;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notdaDoFilme = 8.4;
        //Media calculada das notas da minha cabeca
        double media = (10 + 5.3)/ 2;
        System.out.println("Nota: " + media);
        String sinopse;
        sinopse = """
        Filme Paprika
        Filme Psicodelico Japones Maluco
        Bom demais!
        """;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println("Estrelhas: " + classificacao);
    }
}
