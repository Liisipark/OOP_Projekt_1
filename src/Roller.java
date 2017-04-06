
public class Roller extends Sõiduk{
    private double kütuseKulu;

    public Roller(String liik, String mark, int rendi_hind, double kütuseKulu) {
        super(liik, mark, rendi_hind);
        this.kütuseKulu = kütuseKulu;
    }

    @Override
    double sõiduMaksumus(int vahemaa, double hind) {
        return vahemaa/this.kütuseKulu*hind;
    }

    @Override
    int rendiMaksumus(int kestus) {
        return getRendi_hind()*kestus;
    }

    @Override
    public String toString() {
        return "Roller{" +
                "kütuseKulu=" + kütuseKulu +
                "rendiHind=" + getRendi_hind() +
                '}';
    }
}
