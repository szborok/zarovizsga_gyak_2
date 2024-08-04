package be03.borok_szabolcs;

public class App {
    public static void main(String[] args) {

        Konyvtar konyvtarrrrr = new Konyvtar();

        Konyv konyv1 = new Konyv("9783404142163", "Egri csillagok", "Gárdonyi  Géza", "magyar", 1899);
        Konyv konyv2 = new Konyv("9788807900365", "A Pál utcai fiúk", "Molnár Ferenc", "magyar", 1906);

        konyvtarrrrr.konyvHozzaAd(konyv1);
        konyvtarrrrr.konyvHozzaAd(konyv2);

        String isbnnnnn = "9783404142163";
        Integer result = konyvtarrrrr.ISBNperDarab(isbnnnnn);
        System.out.println(
                "A könyvtárban " + result + " db " + isbnnnnn + "-as/es ISBN számmal rendelkező könyv található.");

    }
}
