import java.util.ArrayList;
import java.util.List;

public class Sõidukirent {
    private String asutus;

    List<Sõiduk> sõidukid_saadaval = new ArrayList<>();

    ArrayList<Sõiduk> broneeringud = new ArrayList<Sõiduk>();

    public Sõidukirent(String asutus) {
        this.asutus = asutus;
    }

    public boolean kasSaadavalAuto(Sõiduk x){
        return "Auto".equals(x.getLiik());
    }

    public boolean kasSaadavalRoller(Sõiduk x){
        return "Roller".equals(x.getLiik());
    }

    public boolean kasSaadavalJalgratas(Sõiduk x){
        return "Jalgratas".equals(x.getLiik());
    }

    public void broneeriAuto (Sõiduk x, Kliendid y){
        if (kasSaadavalAuto(x)) {
            sõidukid_saadaval.remove(x);
            broneeringud.add(x);

        }

    }
}









