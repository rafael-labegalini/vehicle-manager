class Carro extends Veiculo {
    private String tipoCarro;
    private static final double CONSUMO_POR_LITRO = 12;
    private static final double TAMANHO_TANQUE = 50;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, "Gasolina/Álcool");
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return TAMANHO_TANQUE * CONSUMO_POR_LITRO;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: " + this.tipoCarro + " | Autonomia: " + this.calcularAutonomia() + " km");
    }
}