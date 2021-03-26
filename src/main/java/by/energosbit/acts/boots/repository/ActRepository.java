package by.energosbit.acts.boots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.energosbit.acts.boots.entity.Act;

@Repository
public interface ActRepository extends JpaRepository<Act, Integer> {
	Act findActByIdAct(int idAct);
}
