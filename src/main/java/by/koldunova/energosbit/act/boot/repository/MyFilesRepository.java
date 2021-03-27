package by.koldunova.energosbit.act.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.koldunova.energosbit.act.boot.entity.MyFiles;


@Repository
public interface MyFilesRepository extends JpaRepository<MyFiles, Integer>{
    MyFiles findById(int id);
}
