package by.koldunova.energosbit.act.boot.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.koldunova.energosbit.act.boot.entity.Act;
@Repository
public interface ActRepository extends JpaRepository<Act, Long> {
	Act findActById(int idAct);
	
	List<Act> findByContract(String contract);

}
