package atividadeveiculos;

public class Moto extends Veiculo {

    private boolean temSidecar;
    
    public Moto(String marca, String modelo, int ano, boolean temSidecar) {

        super(marca, modelo, ano);
        this.temSidecar = temSidecar;
    }

    public boolean getTemSidecar() {

        return temSidecar;
    }

    public void setTemSidecar(boolean temSidecar) {

        this.temSidecar = temSidecar;
    }

    @Override
    public void ExibirDetalhes() {
        
        super.ExibirDetalhes(); 
        System.out.println("Possui sidecar: " + (getTemSidecar() ? "Sim" : "Não"));
    }
}
