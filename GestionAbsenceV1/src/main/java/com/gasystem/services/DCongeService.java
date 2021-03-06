package com.gasystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasystem.entities.DemandeConge;
import com.gasystem.entities.User;
import com.gasystem.repositories.DemandeCongeRepository;

@Service
public class DCongeService {
	
	@Autowired
	private DemandeCongeRepository congeRepository ;
	
	public void createConge(DemandeConge demande)
	{
		congeRepository.save(demande);
	}

	public List<DemandeConge> findCongesByUser(User user)
	{
		return congeRepository.findCongeByUser(user);
	}
	
}