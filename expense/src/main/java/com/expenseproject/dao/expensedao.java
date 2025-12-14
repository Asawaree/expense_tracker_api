package com.expenseproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.expenseproject.model.expense;

@Repository
public interface expensedao extends JpaRepository<expense, Integer> {
	
	expense save(expense e);
	List<expense> findAll();
	@Query(value="delete from expense where id=:a")
	@Modifying
	int deleteById(@Param("a") int id);
	
	@Query(value="select sum(amount) from expense")
	double getTotalAmount();
	
	
	@Query(value="select sum(amount) from expense where month(date)=:month AND year(date)=:year", nativeQuery = true)
	double getTotalAMountOFMonth(@Param("month") int month, @Param("year")int year);
	
	
	List<expense> findByCategory(String category);

}
