public class Main {
    public static void main(String[] args) {
        System.out.println("==== TESTE DE VEÍCULOS ====");

        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Sedan");
        carro.exibirDetalhes();
        System.out.println();

        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2021, 10);
        caminhao.exibirDetalhes();
        System.out.println();

        try {
            Onibus onibus = new Onibus("Mercedes-Benz", "Paradiso", 2023, 50, 8);
            onibus.exibirDetalhes();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar ônibus: " + e.getMessage());
        }
        System.out.println();

        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, "Sedan", 100);
        carroEletrico.exibirDetalhes();
        System.out.println();

        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "P360", 2020, 8, -20);
        caminhaoRefrigerado.exibirDetalhes();
    }
}