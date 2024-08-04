package be03.borok_szabolcs;

public abstract class Rekord {
    private String ISBN;

    protected Rekord(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setISBN(String ISBN) throws RangeException {
        if (ISBN.length() == 13 || ISBN.length() == 10) {
            this.ISBN = ISBN;
        }
        else {
            try {
                throw new RangeException();
            } catch (Exception e) {
                System.out.println("Az ISBN értéke 10 vagy 13 hosszú számsor lehet csak!");
            }
        }
    }

    public String getISBN() {
        return ISBN;
    }

}
