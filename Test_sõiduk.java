import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test_sõiduk {
    public static void main(String[] args) throws Exception {

        Sõidukirent test = new Sõidukirent("RendiPunkt");

        List<Sõiduk> sõidukid_failist = loeSõidukid("soidukid.txt");
        ArrayList<Kliendid> kliendid = new ArrayList<>();

        for(Sõiduk sõiduk: sõidukid_failist){
            test.lisaSõiduk(sõiduk);
        }

        Sõiduk auto1 = new Auto("Auto", "BMW", 150, 9.8, 2);
        Sõiduk auto2 = new Auto("Auto", "Opel", 50, 4.8, 4);
        Sõiduk auto3 = new Auto("Auto", "Nissan", 70, 6.8, 5);
        Sõiduk roller1 = new Roller("Roller", "Vespa", 25, 1.2);
        Sõiduk roller2 = new Roller("Roller", "Vespa2", 35, 1.9);
        Sõiduk jalgratas1 = new Jalgratas("Jalgratas", "Scott", 10);
        Sõiduk jalgratas2 = new Jalgratas("Jalgratas", "Trec", 50);

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

    public static List<Sõiduk> loeSõidukid(String failiNimi) throws Exception {
        List<Sõiduk> sõidukid = new ArrayList<>();

        File file = new File(failiNimi);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String rida = scanner.nextLine();
            String[] osad = rida.split(";");
            if ("Auto".equals(osad[0])){
                sõidukid.add(new Auto(osad[0],osad[1], Integer.parseInt(osad[2]), Double.parseDouble(osad[3]), Integer.parseInt(osad[4])));
            } else if ("Roller".equals(osad[0])){
                sõidukid.add(new Roller(osad[0],osad[1], Integer.parseInt(osad[2]), Double.parseDouble(osad[3])));
            }else if ("Jalgratas".equals(osad[0])){
                sõidukid.add(new Jalgratas(osad[0], osad[1], Integer.parseInt(osad[2])));
            }
        }
        scanner.close();

        return sõidukid;
    }


}
