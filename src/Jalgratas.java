
public class Jalgratas extends Sõiduk {
    public Jalgratas(String liik, String mark, int rendi_hind) {
        super(liik, mark, rendi_hind);
    }

    @Override
    double sõiduMaksumus(int vahemaa, double hind) {
        return 0;
    }

    @Override
    int rendiMaksumus(int kestus) {
        return getRendi_hind()*kestus;
    }

}
