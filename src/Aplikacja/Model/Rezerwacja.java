package Aplikacja.Model;

public class Rezerwacja {

	private Pokoj pokoj;
	private boolean oplacona = false;
	private Klient klient;
	private Data dataPrzyjazdu;



	private Data dataWyjazdu;

	@Override
	public String toString() {
		return "Rezerwacja{" +
				"pokoj=" + pokoj +
				", oplacona=" + oplacona +
				", klient=" + klient +
				", dataPrzyjazdu=" + dataPrzyjazdu +
				", dataWyjazdu=" + dataWyjazdu +
				'}';
	}

	/**
	 * 
	 * @param pokoj
	 * @param dataPrzyjazdu
	 * @param klient
	 */
	public Rezerwacja(Pokoj pokoj, Data dataPrzyjazdu, Data dataWyjazdu, Klient klient) {
		this.pokoj = pokoj;
		this.dataPrzyjazdu = dataPrzyjazdu;
		this.dataWyjazdu = dataWyjazdu;
		this.klient = klient;
	}

	public Pokoj getPokoj() {
		return this.pokoj;
	}

	/**
	 * 
	 * @param pokoj
	 */
	public void setPokoj(Pokoj pokoj) {
		this.pokoj = pokoj;
	}

	public Data getDataPrzyjazdu() {
		return this.dataPrzyjazdu;
	}

	/**
	 * 
	 * @param dataPrzyjazdu
	 */
	public void setDataPrzyjazdu(Data dataPrzyjazdu) {
		this.dataPrzyjazdu = dataPrzyjazdu;
	}

	public Klient getKlient() {
		return this.klient;
	}

	/**
	 * 
	 * @param klient
	 */
	public void setKlient(Klient klient) {
		this.klient = klient;
	}

	public boolean getOplacona() {
		return this.oplacona;
	}

	/**
	 * 
	 * @param oplacona
	 */
	public void setOplacona(boolean oplacona) {
		this.oplacona = oplacona;
	}

	public Data getDataWyjazdu() {
		return dataWyjazdu;
	}

	public void setDataWyjazdu(Data dataWyjazdu) {
		this.dataWyjazdu = dataWyjazdu;
	}


}