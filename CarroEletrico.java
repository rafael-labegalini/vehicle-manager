class CarroEletrico extends Carro {
    private double bateriaKWh;
    private static final double CONSUMO_POR_KWH = 5;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        return bateriaKWh * CONSUMO_POR_KWH;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bateria: " + this.bateriaKWh + " kWh | Autonomia: " + this.calcularAutonomia() + " km");
    }
}