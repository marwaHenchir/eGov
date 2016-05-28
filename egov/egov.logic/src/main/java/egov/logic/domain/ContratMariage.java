package egov.logic.domain;
import org.joda.time.LocalDate;

import egov.logic.enums.Civility;

public class ContratMariage {
	
	private int numero;
	private LocalDate date;
	private Citoyen mari;
	private Citoyen mariee;
	
	
	public ContratMariage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ContratMariage(int numero, LocalDate date, Citoyen mari, Citoyen mariee) {
		super();
		this.numero = numero;
		this.date = date;
		this.mari = mari;
		this.mariee = mariee;
		
		mari.setCivility(Civility.MARRIED);
		mariee.setCivility(Civility.MARRIED);
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
	public Citoyen getMari() {
		return mari;
	}
	public void setMari(Citoyen mari) {
		this.mari = mari;
	}
	public Citoyen getMariee() {
		return mariee;
	}
	public void setMariee(Citoyen mariee) {
		this.mariee = mariee;
	}

	@Override
	public String toString() {
		return "ContratMariage [numero=" + numero + ", date=" + date + ", mari=" + mari.getFirstName()+"  "+mari.getLastName() + ", mariee=" + mariee.getFirstName()+"  "+mariee.getLastName() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((mari == null) ? 0 : mari.hashCode());
		result = prime * result + ((mariee == null) ? 0 : mariee.hashCode());
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
		ContratMariage other = (ContratMariage) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (mari == null) {
			if (other.mari != null)
				return false;
		} else if (!mari.equals(other.mari))
			return false;
		if (mariee == null) {
			if (other.mariee != null)
				return false;
		} else if (!mariee.equals(other.mariee))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
	
	
	
	

}
