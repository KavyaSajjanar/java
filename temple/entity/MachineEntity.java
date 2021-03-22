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
@Entity
@ToString
@Table(name="machine_db")
@NamedQueries({
	@NamedQuery
	(name="findBynames",query="SELECT MACHINE FROM MachineEntity MACHINE where name=:nm"), 
	@NamedQuery
	(name="deleteByids",query="DELETE FROM MachineEntity MACHINE where MACHINE.id=:id"), 
	@NamedQuery
	(name="getAllEn",query="SELECT * FROM MachineEntity "), 
})
public class MachineEntity {
@Id
	
	@Column(name="ID")
	
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="TYPE")
	private String type;
	@Column(name="COMPANYNAME")
	private String companyName;
	public MachineEntity(int id, String name, String type, String companyName) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.companyName = companyName;
	}
	
}
