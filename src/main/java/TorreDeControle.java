import java.util.ArrayList;
import java.util.List;

public class TorreDeControle implements Mediador {

    private List<Voo> voosNaArea = new ArrayList<>();

    @Override
    public String solicitarAterrisagem(Voo voo) {
        voosNaArea.add(voo);
        return "Torre de Controle: Voo " + voo.getId() + " solicitou aterrisagem.";
    }

    @Override
    public String autorizarAterrisagem() {
        StringBuilder mensagem = new StringBuilder("Torre de Controle: Autorizando aterrisagem para voos na área.");
        for (Voo voo : voosNaArea) {
            voo.aterrisar();
            mensagem.append("\n").append("Voo ").append(voo.getId()).append(" aterrisou com sucesso.");
        }
        return mensagem.toString();
    }
}