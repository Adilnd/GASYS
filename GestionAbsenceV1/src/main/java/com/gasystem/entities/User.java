package com.gasystem.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Size;

@Entity
@PrimaryKeyJoinColumn(name = "userId")
public class User extends Profil{

	
	private String username;
	
	
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="USER_ROLES",joinColumns = {
	@JoinColumn(name="username",referencedColumnName = "username")},
	inverseJoinColumns = {@JoinColumn(name="ROLE_NAME",referencedColumnName = "roleName")})
	private List<RoleUser> roles;
	
	@ManyToOne
    @JoinColumn(name="idService")
    private Service service;
	
	@OneToMany(mappedBy="user")
    private List<Demande> Demande;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<RoleUser> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleUser> roles) {
		this.roles = roles;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public List<Demande> getDemande() {
		return Demande;
	}

	public void setDemande(List<Demande> demande) {
		Demande = demande;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int idProfil, String nomProfil, String prenomProfil, String adresseProfil, String telProfil,
			String emailProfil, String lieuNaissance, Date dateNaissance, Date dateRecrutement, String civiliteProfil,
			double soldeProfil) {
		super(idProfil, nomProfil, prenomProfil, adresseProfil, telProfil, emailProfil, lieuNaissance, dateNaissance,
				dateRecrutement, civiliteProfil, soldeProfil);
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, List<RoleUser> roles, Service service) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.service = service;
	}

	public User(String username, String password, Service service) {
		super();
		this.username = username;
		this.password = password;
		this.service = service;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	
	
	
}
