package com.expenseproject.service;

import java.util.List;

import com.expenseproject.model.expense;

public interface expenseService {
	expense save(expense e);
	List<expense> findAll();
	int deleteById(int id );
	double getTotalAmount();
	double getTotalAMountOFMonth(int month, int year);
	List<expense> findByCategory(String category);

}
