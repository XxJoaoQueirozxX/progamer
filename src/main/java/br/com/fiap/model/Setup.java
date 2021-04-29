package br.com.fiap.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PROGRAMER_SETUP")
public class Setup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_setup")
	private Long id;
	
	@Column(name="nm_setup")
	private String name;
	
	@Column(name="ds_setup")
	private String description;
	
	@Column(name="vl_price")
	private BigDecimal price;
	

	
	public Setup() {}

	public Setup(Long id, String name, String description, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Setup [name=" + name + ", description=" + description + ", price=" + price + "]";
	}


	
	
}
