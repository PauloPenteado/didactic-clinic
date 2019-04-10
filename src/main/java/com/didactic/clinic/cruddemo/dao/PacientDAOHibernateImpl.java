package com.didactic.clinic.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.didactic.clinic.cruddemo.entity.Pacient;

@Repository
public class PacientDAOHibernateImpl implements PacientDAO {

	private EntityManager entityManager;
	
	@Autowired
	public PacientDAOHibernateImpl(EntityManager em) {
		entityManager = em;
	}
	
	@Override
	@Transactional //so that we don`t have to manually start and commit a transaction
	public List<Pacient> getPacients() {

		Session currentSession = entityManager.unwrap(Session.class);
		 
		Query<Pacient> query = currentSession.createQuery("from Pacient", Pacient.class);
		
		List<Pacient> pacients = query.getResultList();
		
		return pacients;
	}

}
