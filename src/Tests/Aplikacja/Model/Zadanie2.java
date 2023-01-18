package Aplikacja.Model;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Zadanie2 {
    Pokoj pokoj;
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Before
    public void setUp() {
        pokoj = new Pokoj(1,3,"pokój 3-osobowy");
    }

    @Test
    public void testTestToString() {
        assertEquals("Pokoj{numer pokoju: 1, liczba miejsc: 3, opis pokoju: pokój 3-osobowy}", pokoj.toString());
    }

    @Test
    public void testGetNumerPokoju() {
        assertEquals(1,pokoj.getNumerPokoju());
    }
}