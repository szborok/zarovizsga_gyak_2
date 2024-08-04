
package be03.borok_szabolcs;

public class RangeException extends Exception {

    public RangeException() {
        super("Az ISBN értéke 10 vagy 13 hosszú számsor lehet csak!");
    }
}
