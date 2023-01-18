package Aplikacja.Model;

import java.util.ArrayList;

public class Hotel {

	private String nazwaHotelu;
	public ArrayList<Pokoj> pokoje = new ArrayList<>();

	/**
	 * 
	 * @param nazwaHotelu
	 */
	public Hotel(String nazwaHotelu) {
		this.nazwaHotelu = nazwaHotelu;
	}

	public String getNazwaHotelu() {
		return this.nazwaHotelu;
	}

	/**
	 * 
	 * @param nazwaHotelu
	 */
	public void setNazwaHotelu(String nazwaHotelu) {
		this.nazwaHotelu = nazwaHotelu;
	}

	public ArrayList<Pokoj> getPokoje() {
		return pokoje;
	}

	/**
	 * 
	 * @param pokoje
	 */
	public void setPokoje(ArrayList<Pokoj> pokoje) {
		this.pokoje = pokoje;
	}

	public void dodajPokoj(Pokoj pokoj){
		if(!pokoje.contains(pokoj)){
			pokoje.add(pokoj);
		}
	}

	public void wyswietlPokoje() {
		// TODO - implement Hotel.wyswietlPokoje
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Hotel{nazwa hotelu: " + nazwaHotelu + ", pokoje: " + pokoje.toString() + "}";
	}


}