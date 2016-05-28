package egov.logic.domain;

import java.util.List;

import org.joda.time.LocalDate;

import egov.logic.enums.Civility;
import egov.logic.enums.Sex;

/**
 * {@link Citoyen}.
 * 
 * @author monta
 *
 */
public class Citoyen {

	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	private Address address1;
	private Address address2;
	private Civility civility;
	private Sex sex;
	private Citoyen pere;
	private Citoyen mere;
	private String cin;
	private String extrait;
	private List<Permis> permis;
	private List<SanctionPenale> sanctions;
	private List<ContratMariage> mariages;
	private List<Facture> factures;
	private List<Compte> comptes;
	
	
	public Citoyen() {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}


	public Address getAddress1() {
		return address1;
	}


	public void setAddress1(Address address1) {
		this.address1 = address1;
	}


	public Address getAddress2() {
		return address2;
	}


	public void setAddress2(Address address2) {
		this.address2 = address2;
	}


	public Civility getCivility() {
		return civility;
	}


	public void setCivility(Civility civility) {
		this.civility = civility;
	}


	public Sex getSex() {
		return sex;
	}


	public void setSex(Sex sex) {
		this.sex = sex;
	}


	public Citoyen getPere() {
		return pere;
	}


	public void setPere(Citoyen pere) {
		this.pere = pere;
	}


	public Citoyen getMere() {
		return mere;
	}


	public void setMere(Citoyen mere) {
		this.mere = mere;
	}


	public String getCin() {
		return cin;
	}


	public void setCin(String cin) {
		this.cin = cin;
	}


	public String getExtrait() {
		return extrait;
	}


	public void setExtrait(String extrait) {
		this.extrait = extrait;
	}


	public List<Permis> getPermis() {
		return permis;
	}


	public void setPermis(List<Permis> permis) {
		this.permis = permis;
	}


	public List<SanctionPenale> getSanctions() {
		return sanctions;
	}


	public void setSanctions(List<SanctionPenale> sanctions) {
		this.sanctions = sanctions;
	}


	public List<ContratMariage> getMariages() {
		return mariages;
	}


	public void setMariages(List<ContratMariage> mariages) {
		this.mariages = mariages;
	}


	public List<Facture> getFactures() {
		return factures;
	}


	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}


	public String toStringNomPrenom() {
		return "Citoyen " + firstName + "  =" + lastName;
	}
	
	

	
	
	


	
	
	

}
