package Aplikacja.Kontroler;

import Aplikacja.Model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Aplikacja {

	public ArrayList<Hotel> hotele = new ArrayList<>();
	public ArrayList<Klient> klienci = new ArrayList<>();
	public ArrayList<Rezerwacja> rezerwacje = new ArrayList<>();

	public boolean zaloguj(String login, String haslo) {
		// TODO - implement Aplikacja.zaloguj
		throw new UnsupportedOperationException();
	}

	public ArrayList<Rezerwacja> getRezerwacje() {
		return rezerwacje;
	}

	public void setRezerwacje(ArrayList<Rezerwacja> rezerwacje) {
		this.rezerwacje = rezerwacje;
	}

	public ArrayList<Klient> getKlienci() {
		return klienci;
	}

	public void setKlienci(ArrayList<Klient> klienci) {
		this.klienci = klienci;
	}

	public ArrayList<Hotel> getHotele() {
		return hotele;
	}

	public void setHotele(ArrayList<Hotel> hotele) {
		this.hotele = hotele;
	}

	public void dodajRezerwacje(Rezerwacja rezerwacja){
		if(sprawdzDostepnosc(rezerwacja)){
			rezerwacje.add(rezerwacja);
		}
	}

	public void modyfikujRezerwacje(Rezerwacja rezerwacja, int wybor, Data termin, Data dataWyjazdu){
		int index;
		if((index = rezerwacje.indexOf(rezerwacja)) != -1){
			switch (wybor){
				case 0: {
					zmienTermin(rezerwacje.get(index),termin,dataWyjazdu);
					break;
				}
				case 1: {
					if(!rezerwacje.get(index).getOplacona())
						rezerwacje.get(index).setOplacona(true);
					break;
				}
				case 2: {
					rezerwacje.remove(rezerwacje.get(index));
					break;
				}
			}
		}
	}

	public void zmienTermin(Rezerwacja rezerwacja, Data termin, Data dataWyjazdu){
		Rezerwacja rezerwacjaNowa = null;
		rezerwacjaNowa.setPokoj(rezerwacja.getPokoj());
		rezerwacjaNowa.setDataPrzyjazdu(termin);
		rezerwacjaNowa.setDataWyjazdu(dataWyjazdu);
		if (sprawdzDostepnosc(rezerwacjaNowa)){
			rezerwacje.remove(rezerwacja);
			rezerwacje.add(rezerwacjaNowa);
		}
	}

	public Rezerwacja szukajRezerwacje(Rezerwacja rezerwacja) {
		int index;
		if((index = rezerwacje.indexOf(rezerwacja)) != -1){
			return rezerwacje.get(index);
		}else{
			return null;
		}
	}

	public void wyswietlRezerwacje() {
		for (Rezerwacja rezerwacja : rezerwacje) {
			System.out.println(rezerwacja.toString());
		}
	}

	public void wyswietlHotele() {
		for (Hotel hotel : hotele){
			System.out.println(hotel.toString());
		}
	}

	public void wyswietlKlientow() {
		for (Klient klient : klienci){
			System.out.println(klient.toString());
		}
	}

	public boolean sprawdzDostepnosc(Rezerwacja rezerwacja){
		for(int i = 0; i < rezerwacje.size(); i++){
			Rezerwacja obecna;
			obecna = rezerwacje.get(i);

			if(obecna.getPokoj() != rezerwacja.getPokoj()){
				continue;
			}

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			try{
				String data = obecna.getDataPrzyjazdu().toString();
				Date dataPrzyjazduO = sdf.parse(data);
				data = obecna.getDataWyjazdu().toString();
				Date dataWyjazduO = sdf.parse(data);

				data = rezerwacja.getDataPrzyjazdu().toString();
				Date dataPrzyjazduN = sdf.parse(data);
				data = rezerwacja.getDataWyjazdu().toString();
				Date dataWyjazduN = sdf.parse(data);

				if(dataPrzyjazduN.after(dataPrzyjazduO) && dataPrzyjazduN.before(dataWyjazduO)){
					return false;
				}

				if(dataWyjazduN.after(dataPrzyjazduO) && dataWyjazduN.before(dataWyjazduO)) {
					return false;
				}

				if(dataPrzyjazduN.equals(dataPrzyjazduO) && dataWyjazduN.equals(dataWyjazduO)){
					return false;
				}

			}catch (ParseException ignored){

			}

		}
		return true;
	}

	public static void main(String[] args)  {
		Aplikacja aplikacja =  new Aplikacja();
		Klient klient1 = new Klient("Adam","Kowalski","login123","haslo321");
		aplikacja.klienci.add(klient1);
		Hotel hotel1 = new Hotel("Hotel1");
		Pokoj pokoj1 = new Pokoj(1,3,"pokoj 3-osobowy");
		hotel1.dodajPokoj(pokoj1);
		aplikacja.hotele.add(hotel1);
		Data nowaData = new Data(21,12,2022);
		Data nowaData2 = new Data(26,12,2022);
		Data nowaData3 = new Data(26,12,2022);
		Data nowaData4 = new Data(28,12,2022);
		Rezerwacja rezerwacja1 = new Rezerwacja(pokoj1,nowaData,nowaData2,klient1);
		aplikacja.rezerwacje.add(rezerwacja1);
		Rezerwacja rezerwacja2 = new Rezerwacja(pokoj1,nowaData3,nowaData4,klient1);

		aplikacja.wyswietlHotele();
		aplikacja.wyswietlKlientow();
		aplikacja.wyswietlRezerwacje();
	}

}