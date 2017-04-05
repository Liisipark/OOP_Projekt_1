/*
*Sõidukirendist saadavate sõidukite ülemklass
 */

abstract class Sõiduk implements Comparable<Sõiduk> {
    private String liik;
    private String mark;
    private int rendi_hind;

    public Sõiduk(String liik, String mark, int rendi_hind) {
        this.liik = liik;
        this.mark = mark;
        this.rendi_hind = rendi_hind;
    }

    public int getRendi_hind() {
        return rendi_hind;
    }

    public String getMark() {
        return mark;
    }

    public String getLiik() {
        return liik;
    }

    // Meetod, mis arvutab ette antd vahemaa ja hinna korral sõiduki maksumuse
    abstract double sõiduMaksumus(int vahemaa, double hind);

    // Meetod, mis arvutab ette antud rendipäevade põhjal rendi kogumaksumuse
    abstract int rendiMaksumus(int kestus);

    @Override
    public String toString() {
        return "Sõiduk{ " +
                "liik=' " + liik + '\'' +
                ", rendi_hind= " + rendi_hind +
                '}';
    }

    // Sõidukite reastamine rendi_hinna alusel
    @Override
    public int compareTo(Sõiduk o) {
        if (this.rendi_hind > o.getRendi_hind()) {
            return 1;
        } else if (this.rendi_hind < o.getRendi_hind()) {
            return -1;
        } else {
            return 0;
        }
    }
}
