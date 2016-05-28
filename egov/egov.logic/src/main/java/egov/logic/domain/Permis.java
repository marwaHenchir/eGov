package egov.logic.domain;
import org.joda.time.LocalDate;

import egov.logic.enums.TypePermis;

public class Permis {
	
	private int numero;
	private TypePermis type;
	private LocalDate date_attribution;
	private LocalDate date_expiration;
	private Citoyen citoyen;
	
	public Permis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Permis(int numero, TypePermis type, LocalDate date_attribution, LocalDate date_expiration, Citoyen citoyen) {
		super();
		this.numero = numero;
		this.type = type;
		this.date_attribution = date_attribution;
		this.date_expiration = date_expiration;
		this.citoyen = citoyen;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public TypePermis getType() {
		return type;
	}
	public void setType(TypePermis type) {
		this.type = type;
	}
	public LocalDate getDate_attribution() {
		return date_attribution;
	}
	public void setDate_attribution(LocalDate date_attribution) {
		this.date_attribution = date_attribution;
	}
	public LocalDate getDate_expiration() {
		return date_expiration;
	}
	public void setDate_expiration(LocalDate date_expiration) {
		this.date_expiration = date_expiration;
	}
	public Citoyen getCitoyen() {
		return citoyen;
	}
	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	@Override
	public String toString() {
		return "Permis [numero=" + numero + ", type=" + type + ", date_attribution=" + date_attribution
				+ ", date_expiration=" + date_expiration + ", citoyen=" + citoyen.getFirstName()+"  "+citoyen.getLastName() + "]";
	}
	
	
	
	
}
