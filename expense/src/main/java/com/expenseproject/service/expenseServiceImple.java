package com.expenseproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenseproject.dao.expensedao;
import com.expenseproject.model.expense;


@Service
public class expenseServiceImple implements expenseService {
	
	
	@Autowired
	private expensedao ed;

	@Override
	public expense save(expense e) {
		// TODO Auto-generated method stub
		return ed.save(e);
	}

	@Override
	public List<expense> findAll() {
		// TODO Auto-generated method stub
		return ed.findAll();
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return ed.deleteById(id);
	}

	@Override
	public double getTotalAmount() {
		// TODO Auto-generated method stub
		return ed.getTotalAmount();
	}

	@Override
	public double getTotalAMountOFMonth(int month, int year) {
		// TODO Auto-generated method stub
		return ed.getTotalAMountOFMonth(month, year);
	}

	@Override
	public List<expense> findByCategory(String category) {
		// TODO Auto-generated method stub
		return ed.findByCategory(category);
	}
}
