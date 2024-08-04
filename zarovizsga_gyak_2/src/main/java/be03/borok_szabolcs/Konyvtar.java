package be03.borok_szabolcs;

import java.util.ArrayList;
import java.util.List;

public class Konyvtar implements IkonyvekSzama {

    List<Konyv> konyvek;

    public Konyvtar() {
        this.konyvek = new ArrayList<>();
    }

    @Override
    public Integer ISBNperDarab(String ISBNSzam) {
        int cnt = 0;

        for (Konyv konyv : konyvek) {
            if (konyv.getISBN().equals(ISBNSzam)) {
                cnt++;
            }
        }
        return cnt;
    }

    public void konyvHozzaAd(Konyv hozzaadandoKonyv) {
        konyvek.add(hozzaadandoKonyv);
    }

    public List<Konyv> getKonyvek() {
        return konyvek;
    }

}
