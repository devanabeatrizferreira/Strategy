public class Aritmetica implements CalcMedia {
    @Override
    public double calculaMedia(double a, double b) {
        return (a + b) / 2;
    }

    @Override
    public String situacao(double media) {
        return media >= 5.0 ? "Aprovado" : "Reprovado";
    }
}
