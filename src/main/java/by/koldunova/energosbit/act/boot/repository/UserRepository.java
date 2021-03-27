package by.koldunova.energosbit.act.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.koldunova.energosbit.act.boot.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
