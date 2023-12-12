package praticajava;

public class aplicaJava {
    private double distanciaViagem, desempenhoVeiculo, custoViagem;
    private final double precoCombustivel = 5.65;

    public void simularCusto(double distanciaViagem, double desempenhoVeiculo) {
        this.distanciaViagem = distanciaViagem;
        this.desempenhoVeiculo = desempenhoVeiculo;

        custoViagem = (distanciaViagem / desempenhoVeiculo) * precoCombustivel;
    }

    public double mostrarCusto() {
        return custoViagem;
    }
}
