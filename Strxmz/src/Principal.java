public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.nome = "Paprika";
        meuFilme.anoDeLancamento = 2006;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 90;

        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        meuFilme.avalia(7.5);
        meuFilme.avalia(10.0);
        meuFilme.avalia(6.1);

        meuFilme.exibeFichaTecnica();
    }
}