
public class Kliendid {
    private String nimi;
    private String telefon;
    private double arve;

    public Kliendid(String nimi, String telefon, double arve) {
        this.nimi = nimi;
        this.telefon = telefon;
        this.arve = arve;
    }

    public double getArve() {
        return arve;
    }
}