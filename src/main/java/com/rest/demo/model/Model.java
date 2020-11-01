package com.rest.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Model 
{
	@Id
	@GeneratedValue
	public int id;
	public  String about;
	public boolean veg ;
	public String openingtime;
	public String closingtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	}
	public String getOpeningtime() {
		return openingtime;
	}
	public void setOpeningtime(String openingtime) {
		this.openingtime = openingtime;
	}
	public String getClosingtime() {
		return closingtime;
	}
	public void setClosingtime(String closingtime) {
		this.closingtime = closingtime;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", about=" + about + ", veg=" + veg + ", openingtime=" + openingtime
				+ ", closingtime=" + closingtime + "]";
	}
	public Model() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	

}
