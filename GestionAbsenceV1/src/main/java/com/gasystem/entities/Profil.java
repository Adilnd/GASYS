package com.gasystem.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Profil {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_Profil", unique=true, nullable=false, precision=10)
    private int idProfil;
    @Column(name="nom_Profil")
    private String nomProfil;
    @Column(name="prenom_Profil")
    private String prenomProfil;
    @Column(name="adresse_Profil")
    private String adresseProfil;
    @Column(name="tel_Profil")
    private String telProfil;
    @Column(name="email_Profil")
    private String emailProfil;
    @Column(name="lieu_Naissance")
    private String lieuNaissance;
    @Column(name="date_Naissance")
    private Date dateNaissance;
    @Column(name="date_Recrutement")
    private Date dateRecrutement;
    @Column(name="civilite_Profil")
    private String civiliteProfil;
    @Column(name="solde_Profil")
    private double soldeProfil;
    
    
    
    
    
	public Profil() {
		super();
	}



	public Profil(int idProfil, String nomProfil, String prenomProfil, String adresseProfil, String telProfil,
			String emailProfil, String lieuNaissance, Date dateNaissance, Date dateRecrutement, String civiliteProfil,
			double soldeProfil) {
		super();
		this.idProfil = idProfil;
		this.nomProfil = nomProfil;
		this.prenomProfil = prenomProfil;
		this.adresseProfil = adresseProfil;
		this.telProfil = telProfil;
		this.emailProfil = emailProfil;
		this.lieuNaissance = lieuNaissance;
		this.dateNaissance = dateNaissance;
		this.dateRecrutement = dateRecrutement;
		this.civiliteProfil = civiliteProfil;
		this.soldeProfil = soldeProfil;
	}



	public String getNomProfil() {
		return nomProfil;
	}



	public void setNomProfil(String nomProfil) {
		this.nomProfil = nomProfil;
	}



	public String getPrenomProfil() {
		return prenomProfil;
	}



	public void setPrenomProfil(String prenomProfil) {
		this.prenomProfil = prenomProfil;
	}



	public String getAdresseProfil() {
		return adresseProfil;
	}



	public void setAdresseProfil(String adresseProfil) {
		this.adresseProfil = adresseProfil;
	}



	public String getTelProfil() {
		return telProfil;
	}



	public void setTelProfil(String telProfil) {
		this.telProfil = telProfil;
	}



	public String getEmailProfil() {
		return emailProfil;
	}



	public void setEmailProfil(String emailProfil) {
		this.emailProfil = emailProfil;
	}



	public String getLieuNaissance() {
		return lieuNaissance;
	}



	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}



	public Date getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public Date getDateRecrutement() {
		return dateRecrutement;
	}



	public void setDateRecrutement(Date dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
	}



	public String getCiviliteProfil() {
		return civiliteProfil;
	}



	public void setCiviliteProfil(String civiliteProfil) {
		this.civiliteProfil = civiliteProfil;
	}



	public double getSoldeProfil() {
		return soldeProfil;
	}



	public void setSoldeProfil(double soldeProfil) {
		this.soldeProfil = soldeProfil;
	}
    
    
    

    
}
