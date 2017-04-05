
public class Auto extends Sõiduk {
    private double kütusekulu;
    private int kohtasid;

    public Auto(String liik, String mark, int rendi_hind, double kütusekulu, int kohtasid) {
        super(liik, mark, rendi_hind);
        this.kütusekulu = kütusekulu;
        this.kohtasid = kohtasid;
    }

    public double getKütusekulu() {
        return kütusekulu;
    }

    @Override
    double sõiduMaksumus(int vahemaa, double hind) {
        return vahemaa/this.kütusekulu*hind;
    }

    @Override
    int rendiMaksumus(int kestus) {
        return getRendi_hind()*kestus;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mark = " + getMark() +
                " kütusekulu = " + kütusekulu +
                ", rendiHind = " + getRendi_hind() +
                ", kohtasid = " + kohtasid +
                '}';
    }
}
