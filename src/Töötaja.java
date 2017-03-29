/*
* Klass töötaja, kus sisaldub info töötaja nime, ameti ja tavapärase puhkuse osas
*/

public class Töötaja {
    private String nimi;
    private String amet;
    private int puhkus;

    public Töötaja(String nimi, String amet, int puhkus) {
        this.nimi = nimi;
        this.amet = amet;
        this.puhkus = 28;
    }

    public int getPuhkus() {
        return puhkus;
    }

    public void setPuhkus(int puhkus) {
        this.puhkus = puhkus;
    }

    // meetod, mis väljastab puhkuse päevade koguarvu/ jäägi
    public int puhkusKokku() {
        return getPuhkus();
    }

    //meetod, mis saab argumendiks ette kuupäeva ja puhkuse kestuse ning tagastab pukuse perioodi


    // //meetod, mis saab argumendiks ette kuupäeva ja puhkuse kestuse ning tagastab pukuse perioodi


    // meetod, mis vähendab puhkuse jääki, kui puhkus on lisatud

    // meetod, mis salvestab puhkuse listi

}
