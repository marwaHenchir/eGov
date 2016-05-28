package egov.logic.domain;

import org.joda.time.LocalDate;

public class SanctionPenale {
	
	private int num;
	private LocalDate date;
	private Citoyen citoyen;
	private int amende;
	private int dureePrison;
	private String tribunal;
	public SanctionPenale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanctionPenale(int num, LocalDate date, Citoyen citoyen, int amende, int dureePrison, String tribunal) {
		super();
		this.num = num;
		this.date = date;
		this.citoyen = citoyen;
		this.amende = amende;
		this.dureePrison = dureePrison;
		this.tribunal = tribunal;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Citoyen getCitoyen() {
		return citoyen;
	}
	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	public int getAmende() {
		return amende;
	}
	public void setAmende(int amende) {
		this.amende = amende;
	}
	public int getDureePrison() {
		return dureePrison;
	}
	public void setDureePrison(int dureePrison) {
		this.dureePrison = dureePrison;
	}
	public String getTribunal() {
		return tribunal;
	}
	public void setTribunal(String tribunal) {
		this.tribunal = tribunal;
	}
	@Override
	public String toString() {
		return "SanctionPenale [num=" + num + ", date=" + date + ", citoyen=" + citoyen.toStringNomPrenom() + ", amende=" + amende
				+ ", dureePrison=" + dureePrison + ", tribunal=" + tribunal + "]";
	}

	
	

	
	
}
