import java.util.ArrayList;
import java.util.List;

public class Sõidukirent {
    private String asutus;

    private List<Sõiduk> sõidukid_saadaval = new ArrayList<>();

    ArrayList<Sõiduk> broneeringud = new ArrayList<Sõiduk>();

    public Sõidukirent(String asutus) {
        this.asutus = asutus;
    }

    public boolean kasSaadavalAuto(Sõiduk x){
        return "Auto".equals(x.getLiik());
    }

    public void lisaSõiduk(Sõiduk s){
        sõidukid_saadaval.add(s);
    }

    public List<Sõiduk> getSõidukid_saadaval() {
        return sõidukid_saadaval;
    }

    public ArrayList<Sõiduk> getBroneeringud() {
        return broneeringud;
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

    public double allahindlusArvelt(Kliendid x) {return Math.round(Math.random()*99+1)*x.getArve()/100; } //arvutab juhusliku allhindluse arvelt
}









