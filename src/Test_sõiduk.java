import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_sõiduk {
    public static void main(String[] args) {

        Sõidukirent test = new Sõidukirent("RendiPunkt");

        Sõiduk auto1 = new Auto("Auto", "BMW", 150, 9.8, 2);
        Sõiduk auto2 = new Auto("Auto", "Opel", 50, 4.8, 4);
        Sõiduk auto3 = new Auto("Auto", "Nissan", 70, 6.8, 5);

        List<Sõiduk> sõidukid_saadaval = new ArrayList<>();
        ArrayList<Kliendid> broneeringud = new ArrayList<>();
        ArrayList<Kliendid> kliendid = new ArrayList<>();

        sõidukid_saadaval.add(auto1);
        sõidukid_saadaval.add(auto2);
        sõidukid_saadaval.add(auto3);

        Collections.sort(sõidukid_saadaval);

        for(Sõiduk sõiduk: sõidukid_saadaval){
            System.out.println(sõiduk);
        }

        Kliendid klient1 = new Kliendid("Liisi", "5677890", 600);
        Kliendid klient2 = new Kliendid("Liisi", "5677890", 50);

        test.broneeriAuto(auto1, klient1);
        test.broneeriAuto(auto2, klient2);


    }

    //meetod, mis loeb failist sõidukid ja väljastab sõidukite listi;


}
