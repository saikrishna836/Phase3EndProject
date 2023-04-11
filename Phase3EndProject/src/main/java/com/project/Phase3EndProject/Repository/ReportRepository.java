package com.project.Phase3EndProject.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.Phase3EndProject.Entity.Reports;

public interface ReportRepository extends JpaRepository<Reports,Integer> {
	@Query(value="select id,prodname,brand,gender,size,price from reports order by localdate",nativeQuery=true)
	List<Reports> orderbylastdate();
	@Query(value="select user_id,username,count(username) from reports order by count(username)",nativeQuery=true)
	List<Reports> userReport();
	@Query(value="select brand,count(brand) from reports ",nativeQuery=true)
	List<Reports> brandReport();
}
