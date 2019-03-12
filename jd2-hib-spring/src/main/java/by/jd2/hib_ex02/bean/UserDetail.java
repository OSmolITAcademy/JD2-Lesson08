package by.jd2.hib_ex02.bean;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

public class UserDetail {
	
	private int idUserDetails;
	private String country;
	private String city;
	private Timestamp birthday;
	private User user;
	
	public UserDetail() {}

	
	public UserDetail(String country, String city, Timestamp birthday) {
		super();
		this.country = country;
		this.city = city;
		this.birthday = birthday;
	}

	public int getIdUserDetails() {
		return idUserDetails;
	}

	public void setIdUserDetails(int idUserDetails) {
		this.idUserDetails = idUserDetails;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	

}
