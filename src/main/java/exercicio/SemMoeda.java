package exercicio;

public class SemMoeda implements Estado {
    private MaquinaVenda maquina;

    public SemMoeda(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    public void inserirMoeda() {
        System.out.println("Moeda inserida.");
        maquina.setEstado(maquina.getComMoeda());
    }

    public void ejetarMoeda() {
        System.out.println("Nenhuma moeda para ejetar.");
    }

    public void selecionarProduto() {
        System.out.println("Insira a moeda primeiro.");
    }

    public void dispensar() {
        System.out.println("Pagamento necessário antes de dispensar.");
    }
}
