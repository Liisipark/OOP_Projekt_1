
public class TestPuhkus {

    public static void main(String[] args) {

        Töötaja Liisi = new Töötaja("Liisi", "Spetsialist", 28);
        Töötaja Malle = new Üliõpilane("Malle", "õppiv_ametnik", 28, 20, 30);

        System.out.println("Liisi puhkus kokku on " + Liisi.puhkusKokku() + " päeva");
        System.out.println("Malle puhkus kokku on " + Malle.puhkusKokku() + " päeva");

    }
}
