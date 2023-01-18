package Aplikacja.Model;

public class Klient {

	private String imie;
	private String nazwisko;
	private String login;
	private String haslo;

	/**
	 * 
	 * @param imie
	 * @param naziwsko
	 * @param login
	 * @param haslo
	 */
	public Klient(String imie, String naziwsko, String login, String haslo) {
		this.imie = imie;
		this.nazwisko = naziwsko;
		this.login = login;
		this.haslo = haslo;
	}

	public String getImie() {
		return this.imie;
	}

	/**
	 * 
	 * @param imie
	 */
	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	/**
	 * 
	 * @param nazwisko
	 */
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getLogin() {
		return this.login;
	}

	/**
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return this.haslo;
	}

	/**
	 * 
	 * @param haslo
	 */
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	@Override
	public String toString() {
		return "Klient{" +
				"imie='" + imie + '\'' +
				", nazwisko='" + nazwisko + '\'' +
				", login='" + login + '\'' +
				", haslo='" + haslo + '\'' +
				'}';
	}
}