package Aplikacja.Kontroler;

import Aplikacja.Model.*;
import junit.framework.TestCase;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

import java.sql.Date;
import java.text.ParseException;
import java.time.DateTimeException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Zadanie4 {

    Aplikacja aplikacja;
    Klient klient1;
    Hotel hotel1;
    Pokoj pokoj1;
    Data nowaData;
    Data nowaData2;
    Data nowaData3;
    Data nowaData4;

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Before
    public void setUp() {
        aplikacja =  new Aplikacja();
        klient1 = new Klient("Adam","Kowalski","login123","haslo321");
        aplikacja.klienci.add(klient1);
        hotel1 = new Hotel("Hotel1");
        pokoj1 = new Pokoj(1,3,"pokoj 3-osobowy");
        hotel1.dodajPokoj(pokoj1);
        aplikacja.hotele.add(hotel1);
        nowaData = new Data(21,12,2022);
        nowaData2 = new Data(26,12,2022);
        nowaData3 = new Data(26,12,2022);
        nowaData4 = new Data(28,12,2022);
        Rezerwacja rezerwacja1 = new Rezerwacja(pokoj1,nowaData,nowaData2,klient1);
        aplikacja.rezerwacje.add(rezerwacja1);

    }

    @Test
    public void testSzukajRezerwacje(){
        Rezerwacja nieDodanaRezerwacja = new Rezerwacja(pokoj1,nowaData3,nowaData4,klient1);
        Assert.assertFalse(aplikacja.rezerwacje.isEmpty());
        Assert.assertNull(aplikacja.szukajRezerwacje(nieDodanaRezerwacja));
        aplikacja.dodajRezerwacje(nieDodanaRezerwacja);
        Assert.assertEquals(nieDodanaRezerwacja,aplikacja.szukajRezerwacje(nieDodanaRezerwacja));
    }


}