package exercicio;

public class ProdutoVendido implements Estado {
    private MaquinaVenda maquina;

    public ProdutoVendido(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    public void inserirMoeda() {
        System.out.println("Aguarde, estamos processando seu pedido.");
    }

    public void ejetarMoeda() {
        System.out.println("Produto já foi selecionado.");
    }

    public void selecionarProduto() {
        System.out.println("Já em processo de entrega.");
    }

    public void dispensar() {
        maquina.liberarProduto();
        if (maquina.getEstoque() > 0) {
            maquina.setEstado(maquina.getSemMoeda());
        } else {
            System.out.println("Produto esgotado!");
            maquina.setEstado(maquina.getSemProduto());
        }
    }
}
