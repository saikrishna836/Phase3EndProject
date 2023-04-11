package com.project.Phase3EndProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.Phase3EndProject.Entity.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
		List<Admin> findByEmail(String email);
		List<Admin> findByPassword(String password);
}
