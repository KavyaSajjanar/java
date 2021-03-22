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
@Table(name="person_db")
@NamedQueries({
	@NamedQuery
	(name="findByPersonNames",query="SELECT MACHINE FROM MachineEntity MACHINE where name=:nm"), 
	@NamedQuery
	(name="deleteByPersonids",query="DELETE FROM MachineEntity MACHINE where MACHINE.id=:id"), 
	@NamedQuery
	(name="getAllE",query="SELECT * FROM PersonEntity "), 

})

public class PersonEntity {
@Id
	
	@Column(name="ID")
	
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="TYPE")
	private String type;
	@Column(name="COMPANYNAME")
	private String companyName;
	public PersonEntity(int id, String name, String type, String companyName) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.companyName = companyName;
	}


}
