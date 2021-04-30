package br.com.fiap.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_PROGAMER_USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long id;
	
	@Column(name = "nm_user")
	private String name;
	
	@Column(name = "dt_birthdate")
	private LocalDate birthdate;
	
	@Column(name = "ds_email")
	private String email;
	
	@Column(name = "ds_password")
	private String password;
	

	public User() {}

	public User(Long id, String name, LocalDate birthdate, String email, String password) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.email = email;
		this.password = password;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", email=" + email + ", password="
				+ password + "]";
	}

	
}
