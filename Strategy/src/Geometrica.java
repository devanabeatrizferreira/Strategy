public class Geometrica implements CalcMedia {
    @Override
    public double calculaMedia(double a, double b) {
        return Math.sqrt(a * b);
    }

    @Override
    public String situacao(double media) {
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
}
