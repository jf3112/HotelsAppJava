package Aplikacja.Model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Data{

	private int dzien;
	private int miesiac;
	private int rok;

	/**
	 * 
	 * @param dzien
	 * @param miesiac
	 * @param rok
	 */
	public Data(int dzien, int miesiac, int rok) throws DateTimeException {
		try {
			LocalDate.of(rok, miesiac, dzien);
			this.dzien = dzien;
			this.miesiac = miesiac;
			this.rok = rok;
		}catch (DateTimeException e){
			throw new DateTimeException("Niepoprawna data");
		}

	}

	public int getDzien() {
		return this.dzien;
	}

	/**
	 * 
	 * @param dzien
	 */
	public void setDzien(int dzien) {
		this.dzien = dzien;
	}

	public int getMiesiac() {
		return this.miesiac;
	}

	/**
	 * 
	 * @param miesiac
	 */
	public void setMiesiac(int miesiac) {
		this.miesiac = miesiac;
	}

	public int getRok() {
		return this.rok;
	}

	/**
	 * 
	 * @param rok
	 */
	public void setRok(int rok) {
		this.rok = rok;
	}

	public int porownajDate(Data data){
		// TODO - implement Data.porownajDate
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return dzien + "-" + miesiac + "-" + rok;
	}
}