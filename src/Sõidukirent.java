import java.util.ArrayList;
import java.util.List;

public class Sõidukirent {
    private String asutus;

    private List<Sõiduk> sõidukid_saadaval = new ArrayList<>();

    ArrayList<Sõiduk> broneeringud = new ArrayList<Sõiduk>();

    public Sõidukirent(String asutus) {
        this.asutus = asutus;
    }

    // Meetod, mis kontrollib, kas rendis on mõni auto saadaval
    public boolean kasSaadavalAuto(Sõiduk x){
        return "Auto".equals(x.getLiik());
    }

    // Meetod, mis lisab saadaolevate sõidukite listi uue sõiduki
    public void lisaSõiduk(Sõiduk s){
        sõidukid_saadaval.add(s);
    }

    // Meetod, mis väljastab saadaolevate sõidukite listi
    public List<Sõiduk> getSõidukid_saadaval() {
        return sõidukid_saadaval;
    }

    // Meetod, mis väljastab broneeringute listi
    public ArrayList<Sõiduk> getBroneeringud() {
        return broneeringud;
    }

    public boolean kasSaadavalRoller(Sõiduk x){
        return "Roller".equals(x.getLiik());
    }

    public boolean kasSaadavalJalgratas(Sõiduk x){
        return "Jalgratas".equals(x.getLiik());
    }

    // Meetodi sõiduki proneerimiseks kliendi poolt juhul kui sõiduk on saadaval
    public void broneeriAuto (Sõiduk x, Kliendid y){
        if (kasSaadavalAuto(x)) {
            sõidukid_saadaval.remove(x);
            broneeringud.add(x);
        }
    }

    // Meetod, mis arvutab juhusliku allhindluse arvelt
    public double allahindlusArvelt(Kliendid x) {
        return Math.round(Math.random() * 99 + 1) * x.getArve() / 100;
    }
}









