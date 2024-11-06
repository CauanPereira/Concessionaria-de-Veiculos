package atividadeveiculos;

public class Main {

    public static void main (String[] args) {
        
        System.out.println("\nAqui esta as informações dos veiculos cadastrados: \n");

        Carro primeiroCarro = new Carro("Toyota", "Corolla", 2018, 4);
        Moto primeiraMoto = new Moto("Honda", "CG-Fan 125", 2014, false);
        
        System.out.println("Informações do carro:\n");
        primeiroCarro.ExibirDetalhes();
        
        System.out.println("\nInformações da Moto:\n");
        primeiraMoto.ExibirDetalhes();
    }
}