import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_sõiduk {
    public static void main(String[] args) {

        Sõidukirent test = new Sõidukirent("RendiPunkt");

        Sõiduk auto1 = new Auto("Auto", "BMW", 150, 9.8, 2);
        Sõiduk auto2 = new Auto("Auto", "Opel", 50, 4.8, 4);
        Sõiduk auto3 = new Auto("Auto", "Nissan", 70, 6.8, 5);

        ArrayList<Kliendid> kliendid = new ArrayList<>();

        test.lisaSõiduk(auto1);
        test.lisaSõiduk(auto2);
        test.lisaSõiduk(auto3);

        //Collections.sort(Sõidukid_saadaval());

        for(Sõiduk sõiduk: test.getSõidukid_saadaval()){
            System.out.println(sõiduk);
        }

        Kliendid klient1 = new Kliendid("Liisi", "5677890", 200);
        Kliendid klient2 = new Kliendid("Mari", "5677891", 100);

        test.broneeriAuto(auto1, klient1);
        System.out.println("Arve " + klient1.getArve() + " Allahindlus arvelt " + test.allahindlusArvelt(klient1));
        test.broneeriAuto(auto2, klient2);
        System.out.println("Arve " + klient2.getArve() +  " Allahindlus arvelt " + test.allahindlusArvelt(klient2));

        System.out.println(test.getSõidukid_saadaval());
        System.out.println(test.getBroneeringud());



    }

    //meetod, mis loeb failist sõidukid ja väljastab sõidukite listi;


}
