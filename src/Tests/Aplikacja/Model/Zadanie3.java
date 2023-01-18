package Aplikacja.Model;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Zadanie3 extends TestCase {
    Pokoj pokoj;
    Hotel hotel;
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Before
    public void setUp() {
        pokoj = new Pokoj(1,3,"pokój 3-osobowy");
        hotel = new Hotel("Jantar");
        hotel.dodajPokoj(pokoj);
    }

    @Test
    public void testTestToString() {
        assertFalse(hotel.pokoje.isEmpty());
        assertEquals("Hotel{nazwa hotelu: Jantar, pokoje: [Pokoj{numer pokoju: 1, liczba miejsc: 3, opis pokoju: pokój 3-osobowy}]}",hotel.toString());
    }

    @Test
    public void testDodajPokoj() {
        var pokojIstniejacy = new Pokoj(1,4,"pokój 4-osobowy");
        assertFalse(hotel.pokoje.isEmpty());
        assertTrue(hotel.pokoje.contains(pokojIstniejacy));
        assertEquals(1,hotel.pokoje.size());
        hotel.dodajPokoj(pokojIstniejacy);
        assertEquals(1,hotel.pokoje.size());
    }
}