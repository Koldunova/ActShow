package by.koldunova.energosbit.act.boot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.koldunova.energosbit.act.boot.entity.Act;
import by.koldunova.energosbit.act.boot.repository.ActRepository;


@Service
public class ActService {
	@Autowired
	private ActRepository actRepository;
    @PersistenceContext
    private EntityManager em;

	public List<Act> findAllActs(){
	    try {
	        List<Act> acts = actRepository.findAll();
	        System.out.println(acts.size());
	        return acts;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

	}
	
	public Act findActById(int id) {
		return actRepository.findActById(id);
	}
	
	public List<Act> findByContract(String contract) {
	    return actRepository.findByContract(contract);
	}
}
