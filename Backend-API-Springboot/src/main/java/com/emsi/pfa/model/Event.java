package com.emsi.pfa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Events")
public class Event {
		
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long _id;
	 private String Organisme;
	 private String nom;
//	 private String prenom;
	 
//	 private String fonction;
//	 private String gsm;
//	 private String categorie;
//	 private String branche_dactivite;
//	 private String activite;
//	 private String principauxP_S;
	 private String adresse;
//	 private String tel;
//	 private String fax;
//	 private String email;
//	 private String siteWeb;
	 
	 
	 
	public Long get_id() {
		return _id;
	}
	public void set_id(Long _id) {
		this._id = _id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	 public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getOrganisme() {
		return Organisme;
	}
	public void setOrganisme(String organisme) {
		Organisme = organisme;
	}
	
	

	public Event(String organisme, String nom, String adresse) {
			super();
			Organisme = organisme;
			this.nom = nom;
			this.adresse = adresse;
	}
	public Event(Long _id, String organisme, String nom, String adresse) {
			super();
			this._id = _id;
			Organisme = organisme;
			this.nom = nom;
			this.adresse = adresse;
	}
	//	public String getFonction() {
//		return fonction;
//	}
//	public void setFonction(String fonction) {
//		this.fonction = fonction;
//	}
//	public String getGsm() {
//		return gsm;
//	}
//	public void setGsm(String gsm) {
//		this.gsm = gsm;
//	}
//	public String getCategorie() {
//		return categorie;
//	}
//	public void setCategorie(String categorie) {
//		this.categorie = categorie;
//	}
//	public String getBranche_dactivite() {
//		return branche_dactivite;
//	}
//	public void setBranche_dactivite(String branche_dactivite) {
//		this.branche_dactivite = branche_dactivite;
//	}
//	public String getActivite() {
//		return activite;
//	}
//	public void setActivite(String activite) {
//		this.activite = activite;
//	}
//	public String getPrincipauxP_S() {
//		return principauxP_S;
//	}
//	public void setPrincipauxP_S(String principauxP_S) {
//		this.principauxP_S = principauxP_S;
//	}
//	public String getAdresse() {
//		return adresse;
//	}
//	public void setAdresse(String adresse) {
//		this.adresse = adresse;
//	}
//	public String getTel() {
//		return tel;
//	}
//	public void setTel(String tel) {
//		this.tel = tel;
//	}
//	public String getFax() {
//		return fax;
//	}
//	public void setFax(String fax) {
//		this.fax = fax;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getSiteWeb() {
//		return siteWeb;
//	}
//	public void setSiteWeb(String siteWeb) {
//		this.siteWeb = siteWeb;
//	}
//	public Event(String nom, String prenom, String fonction, String gsm, String categorie, String branche_dactivite,
//			String activite, String principauxP_S, String adresse, String tel, String fax, String email,
//			String siteWeb) {
//		super();
//		this.nom = nom;
//		this.prenom = prenom;
//		this.fonction = fonction;
//		this.gsm = gsm;
//		this.categorie = categorie;
//		this.branche_dactivite = branche_dactivite;
//		this.activite = activite;
//		this.principauxP_S = principauxP_S;
//		this.adresse = adresse;
//		this.tel = tel;
//		this.fax = fax;
//		this.email = email;
//		this.siteWeb = siteWeb;
//	}
	public Event() {
		// TODO Auto-generated constructor stub
	}
//	
//	@Override
//	public String toString() {
//		return "Evenement [_id=" + _id + ", nom=" + nom + ", prenom=" + prenom + ", fonction=" + fonction + ", gsm="
//				+ gsm + ", categorie=" + categorie + ", branche_dactivite=" + branche_dactivite + ", activite="
//				+ activite + ", principauxP_S=" + principauxP_S + ", adresse=" + adresse + ", tel=" + tel + ", fax="
//				+ fax + ", email=" + email + ", siteWeb=" + siteWeb + "]";
//	}
	 
	
	
}
