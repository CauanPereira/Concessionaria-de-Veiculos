package atividadeveiculos;

public class Carro extends Veiculo {
    
    private int numeroDePortas;
    
    public Carro(String marca, String modelo, int ano, int numeroDePortasportas) {

        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortasportas;
    }

    public int getnumeroDePortas() {

        return numeroDePortas;
    }

    public void setnumeroDePortas(int numeroDePortas) {

        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void ExibirDetalhes() {

        super.ExibirDetalhes();
        System.out.println("Portas do veículo: " +getnumeroDePortas());
    }
}

