import java.util.ArrayList;
import java.util.List;

public class Sõidukirent {
    private String asutus;

    private List<Sõiduk> sõidukid_saadaval = new ArrayList<>();

    ArrayList<Sõiduk> broneeringud = new ArrayList<Sõiduk>();

    public Sõidukirent(String asutus) {
        this.asutus = asutus;
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

    // Meetodi sõiduki proneerimiseks kliendi poolt juhul kui sõiduk on saadaval
    public void broneeriSõiduk(Sõiduk x, Kliendid y) {
        if (sõidukid_saadaval.contains(x)) {
            sõidukid_saadaval.remove(x);
            broneeringud.add(x);
        } else {
            System.out.println("Sõiduk ei ole saadaval!");
        }
    }

    // Meetod, mis arvutab juhusliku allhindluse arvelt
    public double allahindlusArvelt(Kliendid x) {
        return Math.round(Math.random() * 99 + 1) * x.getArve() / 100;
    }
}









