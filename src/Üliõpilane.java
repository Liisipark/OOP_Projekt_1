
public class Üliõpilane extends Töötaja {
    private int õppePuhkus;
    private int täiendavÕppePuhkus;

    public Üliõpilane(String nimi, String amet, int puhkus, int õppePuhkus, int täiendavÕppePuhkus) {
        super(nimi, amet, puhkus);
        this.õppePuhkus = õppePuhkus;
        this.täiendavÕppePuhkus = täiendavÕppePuhkus;
    }

    @Override
    public int puhkusKokku() {
        return super.puhkusKokku() + õppePuhkus + täiendavÕppePuhkus;
    }
}
