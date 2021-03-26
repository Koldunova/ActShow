package by.energosbit.acts.boots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.energosbit.acts.boots.entity.MyFiles;

@Repository
public interface MyFilesRepository extends JpaRepository<MyFiles, Integer>{

}
