class Onibus extends Veiculo {
    private int quantidadeEixos;
    private static final double CONSUMO_POR_LITRO = 5;
    private static final double TAMANHO_TANQUE = 200;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, "Diesel");
        if (quantidadeEixos < 6 || quantidadeEixos > 10) {
            throw new IllegalArgumentException("O ônibus deve ter entre 6 e 10 eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        return TAMANHO_TANQUE * CONSUMO_POR_LITRO;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Eixos: " + this.quantidadeEixos + " | Autonomia: " + this.calcularAutonomia() + " km");
    }
}