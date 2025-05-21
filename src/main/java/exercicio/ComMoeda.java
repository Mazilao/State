package exercicio;

public class ComMoeda implements Estado {
    private MaquinaVenda maquina;

    public ComMoeda(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    public void inserirMoeda() {
        System.out.println("Moeda já inserida.");
    }

    public void ejetarMoeda() {
        System.out.println("Moeda devolvida.");
        maquina.setEstado(maquina.getSemMoeda());
    }

    public void selecionarProduto() {
        System.out.println("Produto selecionado.");
        maquina.setEstado(maquina.getProdutoVendido());
    }

    public void dispensar() {
        System.out.println("Selecione um produto primeiro.");
    }
}
