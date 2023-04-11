package com.project.Phase3EndProject.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.Phase3EndProject.Entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	@Query(value = "select id,prodname,brand,gender,size,price from product order by prodname", nativeQuery = true)
	List<Product> orderbyname();

	@Query(value = "select id,prodname,brand,gender,size,price from product order by brand", nativeQuery = true)
	List<Product> orderbybrand();

	@Query(value = "select id,prodname,brand,gender,size,price from product order by gender", nativeQuery = true)
	List<Product> orderbygender();

	@Query(value = "select id,prodname,brand,gender,size,price from product order by size", nativeQuery = true)
	List<Product> orderbysize();

}
