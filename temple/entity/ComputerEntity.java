package com.xworkz.temple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="computer_db")
@NamedQueries({
	@NamedQuery
	(name="findByNames",query="SELECT COMPUTER FROM ComputerEntity COMPUTER where name=:nm"), 
@NamedQuery
(name="deleteByIds",query="DELETE FROM ComputerEntity COMPUTER where COMPUTER.id=:id"), 
@NamedQuery
(name="getAllEnt",query="SELECT * FROM ComputerEntity "), 


})


public class ComputerEntity {
@Id
	
	@Column(name="ID")
	
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="BRAND")
	private String brand;
	@Column(name="PRICE")
	private int price;
	@Column(name="TYPE")
	private String type;
	public ComputerEntity(int id, String name, String brand, int price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
	}



}

