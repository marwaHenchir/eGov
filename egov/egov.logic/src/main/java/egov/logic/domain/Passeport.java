package egov.logic.domain;

import org.joda.time.LocalDate;



public class Passeport {
	
	private int numero;
	private LocalDate date_attribution;
	private LocalDate date_expiration;
	private Citoyen citoyen;
	public Passeport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passeport(int numero, LocalDate date_attribution, LocalDate date_expiration, Citoyen citoyen) {
		super();
		this.numero = numero;
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
		return "Passeport [numero=" + numero + ", date_attribution=" + date_attribution + ", date_expiration="
				+ date_expiration + ", citoyen=" + citoyen + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((citoyen == null) ? 0 : citoyen.hashCode());
		result = prime * result + ((date_attribution == null) ? 0 : date_attribution.hashCode());
		result = prime * result + ((date_expiration == null) ? 0 : date_expiration.hashCode());
		result = prime * result + numero;
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
		Passeport other = (Passeport) obj;
		if (citoyen == null) {
			if (other.citoyen != null)
				return false;
		} else if (!citoyen.equals(other.citoyen))
			return false;
		if (date_attribution == null) {
			if (other.date_attribution != null)
				return false;
		} else if (!date_attribution.equals(other.date_attribution))
			return false;
		if (date_expiration == null) {
			if (other.date_expiration != null)
				return false;
		} else if (!date_expiration.equals(other.date_expiration))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	

}
