package exercicio;

public class MaquinaVenda {
    private Estado estadoAtual;
    private int estoque;

    // Estados
    private Estado semMoeda;
    private Estado comMoeda;
    private Estado produtoVendido;
    private Estado semProduto;

    public MaquinaVenda(int estoqueInicial) {
        this.estoque = estoqueInicial;

        this.semMoeda = new SemMoeda(this);
        this.comMoeda = new ComMoeda(this);
        this.produtoVendido = new ProdutoVendido(this);
        this.semProduto = new SemProduto(this);

        this.estadoAtual = (estoque > 0) ? semMoeda : semProduto;
    }

    public void setEstado(Estado novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public Estado getSemMoeda() { return semMoeda; }
    public Estado getComMoeda() { return comMoeda; }
    public Estado getProdutoVendido() { return produtoVendido; }
    public Estado getSemProduto() { return semProduto; }

    public int getEstoque() { return estoque; }
    public void liberarProduto() {
        if (estoque > 0) {
            System.out.println("Produto liberado!");
            estoque--;
        }
    }

    // Métodos delegados
    public void inserirMoeda() { estadoAtual.inserirMoeda(); }
    public void ejetarMoeda() { estadoAtual.ejetarMoeda(); }
    public void selecionarProduto() { estadoAtual.selecionarProduto(); }
    public void dispensar() { estadoAtual.dispensar(); }
}
