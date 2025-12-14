package com.expenseproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expenseproject.model.expense;
import com.expenseproject.service.expenseService;


@RestController
public class expensecontroller {
	
	@Autowired
	private expenseService es;
	
	
	@PostMapping(value="/req")
	public expense m1(@RequestBody expense e)
	{
		return es.save(e);
	}

	
	@GetMapping(value="/")
	public List<expense> m2()
	{
		return es.findAll();
	}
	
	
	@DeleteMapping(value="/req1/{id}")
	public int m3(@PathVariable   int id)
	{
		return es.deleteById(id);
	}
	
	
	@GetMapping(value="/req2")
	public double m4()
	{
		return es.getTotalAmount();
	}
	
	@GetMapping(value="/req3/{month}/{year}")
	public double m5(@PathVariable int month, @PathVariable int year)
	{
		return es.getTotalAMountOFMonth(month, year);
	}
	
	@GetMapping(value="/req4/{category}")
	public List<expense> m6(@PathVariable String category)
	{
		return es. findByCategory(category);
	}
	
	
	@PutMapping(value="/req6")
	public expense m7(@RequestBody expense e)
	{
		return es.save(e);
	}
}
