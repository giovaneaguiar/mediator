public class Voo {
    private int id;
    private Mediador mediador;
    private boolean aterrisagemAutorizada;

    public Voo(int id, Mediador mediador) {
        this.id = id;
        this.mediador = mediador;
        this.aterrisagemAutorizada = false;
    }

    public String solicitarAterrisagem() {
        return mediador.solicitarAterrisagem(this);
    }

    public void aterrisar() {
        this.aterrisagemAutorizada = true;
    }

    public boolean isAterrisagemAutorizada() {
        return aterrisagemAutorizada;
    }

    public int getId() {
        return id;
    }
}