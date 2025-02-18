class CaminhaoRefrigerado extends Caminhao {
    private double temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, double capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia() {
        return super.calcularAutonomia() * 0.9; // Redução de 10% devido ao sistema de refrigeração
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Temperatura Mínima: " + this.temperaturaMinima + "°C | Autonomia Reduzida: " + this.calcularAutonomia() + " km");
    }
}