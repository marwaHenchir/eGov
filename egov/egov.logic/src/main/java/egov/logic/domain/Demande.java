package egov.logic.domain;
import org.joda.time.LocalDate;

import egov.logic.enums.EtatDemande;
import egov.logic.enums.TypeDemande;

public class Demande {
	
	private int numero;
	private LocalDate date;
	private Citoyen citoyen;
	private TypeDemande type;
	private EtatDemande etat;
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demande(int numero, LocalDate date, Citoyen citoyen, TypeDemande type, EtatDemande etat) {
		super();
		this.numero = numero;
		this.date = date;
		this.citoyen = citoyen;
		this.type = type;
		this.etat = etat;
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
	public Citoyen getCitoyen() {
		return citoyen;
	}
	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	public TypeDemande getType() {
		return type;
	}
	public void setType(TypeDemande type) {
		this.type = type;
	}
	public EtatDemande getEtat() {
		return etat;
	}
	public void setEtat(EtatDemande etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Demande [numero=" + numero + ", date=" + date + ", citoyen=" + citoyen.getFirstName()+"  "+citoyen.getLastName() + ", type=" + type + ", etat="
				+ etat + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((citoyen == null) ? 0 : citoyen.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result + numero;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demande other = (Demande) obj;
		if (citoyen == null) {
			if (other.citoyen != null)
				return false;
		} else if (!citoyen.equals(other.citoyen))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (etat != other.etat)
			return false;
		if (numero != other.numero)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	
	

}
