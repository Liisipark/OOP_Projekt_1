import java.util.ArrayList;
import java.util.Collections;

public class Test_sõiduk {
    public static void main(String[] args) {

        Sõidukirent test = new Sõidukirent("RendiPunkt");

        Sõiduk auto1 = new Auto("Auto", "BMW", 150, 9.8, 2);
        Sõiduk auto2 = new Auto("Auto", "Opel", 50, 4.8, 4);
        Sõiduk auto3 = new Auto("Auto", "Nissan", 70, 6.8, 5);
        Sõiduk roller1 = new Roller("Roller", "Vespa", 25, 1.2);
        Sõiduk roller2 = new Roller("Roller", "Vespa2", 35, 1.9);
        Sõiduk jalgratas1 = new Jalgratas("Jalgratas", "Scott", 10);
        Sõiduk jalgratas2 = new Jalgratas("Jalgratas", "Trec", 50);

        ArrayList<Kliendid> kliendid = new ArrayList<>();

        test.lisaSõiduk(auto1);
        test.lisaSõiduk(auto2);
        test.lisaSõiduk(auto3);
        test.lisaSõiduk(roller1);
        test.lisaSõiduk(roller2);
        test.lisaSõiduk(jalgratas1);
        test.lisaSõiduk(jalgratas2);

        Collections.sort(test.getSõidukid_saadaval());

        for(Sõiduk sõiduk: test.getSõidukid_saadaval()){
            System.out.println(sõiduk);
        }

        Kliendid klient1 = new Kliendid("Liisi", "5677890", 200);
        Kliendid klient2 = new Kliendid("Mari", "5677891", 100);

        test.broneeriSõiduk(auto1, klient1);
        System.out.println("Arve " + klient1.getArve() + " Allahindlus arvelt " + test.allahindlusArvelt(klient1));
        test.broneeriSõiduk(auto2, klient2);
        System.out.println("Arve " + klient2.getArve() +  " Allahindlus arvelt " + test.allahindlusArvelt(klient2));

        test.broneeriSõiduk(auto1, klient2);

        System.out.println(test.getSõidukid_saadaval());
        System.out.println(test.getBroneeringud());

        System.out.println(jalgratas1.rendiMaksumus(5));


    }


}
