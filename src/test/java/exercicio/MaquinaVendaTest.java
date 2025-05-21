package exercicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaquinaVendaTest {

    private MaquinaVenda maquina;

    @BeforeEach
    public void setup() {
        maquina = new MaquinaVenda(2);
    }

    @Test
    public void deveInserirMoedaComSucesso() {
        maquina.inserirMoeda();
        assertTrue(maquina.getComMoeda() instanceof Estado);
    }

    @Test
    public void deveComprarProdutoComSucesso() {
        maquina.inserirMoeda();
        maquina.selecionarProduto();
        maquina.dispensar();

        assertEquals(1, maquina.getEstoque());
    }

    @Test
    public void deveEjetarMoedaSeNaoSelecionarProduto() {
        maquina.inserirMoeda();
        maquina.ejetarMoeda();
        maquina.selecionarProduto();
    }

    @Test
    public void deveInformarProdutoEsgotado() {
        MaquinaVenda maquina1 = new MaquinaVenda(1);
        maquina1.inserirMoeda();
        maquina1.selecionarProduto();
        maquina1.dispensar();
        maquina1.inserirMoeda();
        maquina1.selecionarProduto();
    }

    @Test
    public void naoDevePermitirDispensarSemMoeda() {
        maquina.dispensar();
        assertEquals(2, maquina.getEstoque());
    }

    @Test
    public void naoDevePermitirSegundaMoeda() {
        maquina.inserirMoeda();
        maquina.inserirMoeda();
    }
}
