package com.darla.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {
	
	@Id
	private int userId;
	private String user;
    private double rating;
    private String comment;
    private String date;
    
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Review(int userId, String user, double rating, String comment, String date) {
		super();
		this.userId = userId;
		this.user = user;
		this.rating = rating;
		this.comment = comment;
		this.date = date;
	}
    
    
}
