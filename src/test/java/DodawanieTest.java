import org.junit.Test;

import static org.junit.Assert.*;

public class DodawanieTest {

    @Test
    public void dodaj() {
        Dodawanie dodawanie = new Dodawanie();
        assertEquals(10, dodawanie.dodaj(5, 5));
    }
}