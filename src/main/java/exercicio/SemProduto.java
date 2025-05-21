package exercicio;

public class SemProduto implements Estado {
    private MaquinaVenda maquina;

    public SemProduto(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    public void inserirMoeda() {
        System.out.println("Produto esgotado.");
    }

    public void ejetarMoeda() {
        System.out.println("Nenhuma moeda inserida.");
    }

    public void selecionarProduto() {
        System.out.println("Produto indisponível.");
    }

    public void dispensar() {
        System.out.println("Não há produto para liberar.");
    }
}
