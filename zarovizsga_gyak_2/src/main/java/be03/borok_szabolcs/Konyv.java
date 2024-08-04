package be03.borok_szabolcs;

public class Konyv extends Rekord{

    public String cím;
    public String szerzo;
    public String nyelv;
    public Integer megjelenesiDatum;

    public Konyv(String ISBN, String cím, String szerzo, String nyelv, Integer megjelenesiDatum) {
        super(ISBN);
        this.cím = cím;
        this.szerzo = szerzo;
        this.nyelv = nyelv;
        this.megjelenesiDatum = megjelenesiDatum;
    }

    

    

}
