package com.project.Phase3EndProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Phase3EndProject.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findByEmail(String email);

	List<User> findByPassword(String password);

	@Query(value = "select * from user where id=:id", nativeQuery = true)
	List<User> find(int id);

}
