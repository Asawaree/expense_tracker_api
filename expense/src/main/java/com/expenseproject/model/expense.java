package com.expenseproject.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class expense {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String title;
	    private Double amount;
	    private String category;

	    private LocalDate date;   

	    private String description;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "expense [id=" + id + ", title=" + title + ", amount=" + amount + ", category=" + category
					+ ", date=" + date + ", description=" + description + "]";
		}

	    
	    
}
