package by.energosbit.acts.boots.service;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import by.energosbit.acts.entity.MyFiles;

@Service
public class MyFilesService {
	@Autowired
	MyFilesService myFilesService;
    @PersistenceContext
    private EntityManager em;
	
//	public List<MyFiles> findFilesByIdAct(int id){
//		return null;
//	}
}
