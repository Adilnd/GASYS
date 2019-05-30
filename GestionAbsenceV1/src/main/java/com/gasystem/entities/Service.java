package com.gasystem.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Service {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idService;
	@OneToMany(mappedBy="service")
    private List<User> users;
	public int getIdService() {
		return idService;
	}
	public void setIdService(int idService) {
		this.idService = idService;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Service(int idService, List<User> users) {
		super();
		this.idService = idService;
		this.users = users;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
