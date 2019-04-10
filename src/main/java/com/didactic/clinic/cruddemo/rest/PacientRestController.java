package com.didactic.clinic.cruddemo.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.didactic.clinic.cruddemo.dao.PacientDAO;
import com.didactic.clinic.cruddemo.entity.Pacient;

@RestController
@RequestMapping("/api")
public class PacientRestController {

	private PacientDAO pacientDAO;
	
	//dirty, temporary solution for testing purposes
	@Autowired
	public PacientRestController(PacientDAO pacientDao) {
		pacientDAO = pacientDao;
	}
	
	@GetMapping("/pacients")
	public List<Pacient> getPacients(){
		return pacientDAO.getPacients();
	}
}
