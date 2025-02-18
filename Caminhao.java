class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private static final double CONSUMO_POR_LITRO = 6;
    private static final double TAMANHO_TANQUE = 300;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano, 2, "Diesel");
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double consumoReduzido = CONSUMO_POR_LITRO * (1 - (capacidadeCarga / 100));
        return TAMANHO_TANQUE * consumoReduzido;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + this.capacidadeCarga + " toneladas | Autonomia: " + this.calcularAutonomia() + " km");
    }
}