import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

class MediatorTest {

    @Test
    void testMediator() {
        Mediador torreDeControle = new TorreDeControle();

        Voo voo1 = new Voo(1, torreDeControle);
        Voo voo2 = new Voo(2, torreDeControle);

        String mensagemVoo1 = voo1.solicitarAterrisagem();
        String mensagemVoo2 = voo2.solicitarAterrisagem();

        assertEquals("Torre de Controle: Voo 1 solicitou aterrisagem.", mensagemVoo1);
        assertEquals("Torre de Controle: Voo 2 solicitou aterrisagem.", mensagemVoo2);

        String mensagemAutorizacao = torreDeControle.autorizarAterrisagem();

        assertTrue(mensagemAutorizacao.contains("Torre de Controle: Autorizando aterrisagem para voos na área."));
        assertTrue(mensagemAutorizacao.contains("Voo 1 aterrisou com sucesso."));
        assertTrue(mensagemAutorizacao.contains("Voo 2 aterrisou com sucesso."));

        assertTrue(voo1.isAterrisagemAutorizada());
        assertTrue(voo2.isAterrisagemAutorizada());
    }
}