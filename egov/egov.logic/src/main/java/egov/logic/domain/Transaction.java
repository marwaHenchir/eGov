package egov.logic.domain;

import org.joda.time.LocalDate;

import egov.logic.enums.TypeTransaction;

public class Transaction {
	
	private int numero;
	private LocalDate date;
	private int montant;
	private Compte compte;
	private TypeTransaction type;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int numero, LocalDate date, int montant, Compte compte, TypeTransaction type) {
		super();
		this.numero = numero;
		this.date = date;
		this.montant = montant;
		this.compte = compte;
		this.type = type;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public TypeTransaction getType() {
		return type;
	}

	public void setType(TypeTransaction type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transaction [numero=" + numero + ", date=" + date + ", montant=" + montant + ", compte=" + compte
				+ ", type=" + type + "]";
	}
	
	
	

}
