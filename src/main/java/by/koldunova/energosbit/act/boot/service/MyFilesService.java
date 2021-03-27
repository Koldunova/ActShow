package by.koldunova.energosbit.act.boot.service;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.koldunova.energosbit.act.boot.entity.MyFiles;
import by.koldunova.energosbit.act.boot.repository.MyFilesRepository;

//import by.energosbit.acts.entity.MyFiles;

@Service
public class MyFilesService {
	@Autowired
	MyFilesRepository myFilesRepository;
    @PersistenceContext
    private EntityManager em;
	
//	public List<MyFiles> findFilesByIdAct(int id){
//		return null;
//	}
    
    public MyFiles findById(int id) {
        return myFilesRepository.findById(id);
    }
}
