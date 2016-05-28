package egov.logic.domain;

import java.util.List;

public class Compte {
	
	private int num;
	private Citoyen citoyen;
	private List<Transaction> transactions;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(int num, Citoyen citoyen, List<Transaction> transactions) {
		super();
		this.num = num;
		this.citoyen = citoyen;
		this.transactions = transactions;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Citoyen getCitoyen() {
		return citoyen;
	}
	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "Compte [num=" + num + ", citoyen=" + citoyen.toStringNomPrenom() + ", transactions=" + transactions + "]";
	}
	
	
	

}
