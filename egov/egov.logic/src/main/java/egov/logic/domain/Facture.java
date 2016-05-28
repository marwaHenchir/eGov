package egov.logic.domain;

import egov.logic.enums.EtatFacture;
import egov.logic.enums.TypeFacture;

public class Facture {
	
	private int num;
	private Citoyen citoyen;
	private TypeFacture type;
	private EtatFacture etat;
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(int num, Citoyen citoyen, TypeFacture type, EtatFacture etat) {
		super();
		this.num = num;
		this.citoyen = citoyen;
		this.type = type;
		this.etat = etat;
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
	public TypeFacture getType() {
		return type;
	}
	public void setType(TypeFacture type) {
		this.type = type;
	}
	public EtatFacture getEtat() {
		return etat;
	}
	public void setEtat(EtatFacture etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Facture [num=" + num + ", citoyen=" + citoyen.toStringNomPrenom() + ", type=" + type + ", etat=" + etat + "]";
	}
	

	
}
