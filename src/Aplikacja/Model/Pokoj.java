package Aplikacja.Model;

import java.util.Objects;

public class Pokoj {

	private int numerPokoju;
	private int liczbaMiejsc;
	private String opisPokoju;

	/**
	 * 
	 * @param numerPokoju
	 * @param liczbaMiejsc
	 * @param opisPokoju
	 */
	public Pokoj(int numerPokoju, int liczbaMiejsc, String opisPokoju) {
		this.numerPokoju = numerPokoju;
		this.liczbaMiejsc = liczbaMiejsc;
		this.opisPokoju = opisPokoju;
	}

	public int getNumerPokoju() {
		return this.numerPokoju;
	}

	/**
	 * 
	 * @param numerPokoju
	 */
	public void setNumerPokoju(int numerPokoju) {
		this.numerPokoju = numerPokoju;
	}

	public int getLiczbaMiejsc() {
		return this.liczbaMiejsc;
	}

	/**
	 * 
	 * @param liczbaMiejsc
	 */
	public void setLiczbaMiejsc(int liczbaMiejsc) {
		this.liczbaMiejsc = liczbaMiejsc;
	}

	public String getOpisPokoju() {
		return this.opisPokoju;
	}

	/**
	 * 
	 * @param opisPokoju
	 */
	public void setOpisPokoju(String opisPokoju) {
		this.opisPokoju = opisPokoju;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pokoj pokoj = (Pokoj) o;
		return numerPokoju == pokoj.numerPokoju;
	}

	@Override
	public String toString() {
		return "Pokoj{numer pokoju: " + numerPokoju + ", liczba miejsc: " + liczbaMiejsc + ", opis pokoju: " + opisPokoju + "}";
	}
}