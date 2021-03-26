package by.energosbit.acts.boots.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.energosbit.acts.boots.entity.Act;

@Service
public class ActService {
	@Autowired
	private ActService actService;
    @PersistenceContext
    private EntityManager em;

	public List<Act> findAll(){
		return actService.findAll();
	}
	
	public Act findActById(int id) {
		return actService.findActById(id);
	}
}
