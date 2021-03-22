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
@Table(name="vendor_db")
@NamedQueries({
	@NamedQuery
	(name="findByVendorNames",query="SELECT VENDOR FROM VendorEntity VENDOR where name=:nm"), 
	@NamedQuery
	(name="deleteByVendorid",query="DELETE FROM MachineEntity MACHINE where MACHINE.id=:id"),
	@NamedQuery
	(name="getAllName",query="SELECT * FROM VendorEntity "), 


})
public class VendorEntity {
    @Id
	@Column(name="ID")
	
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="TYPE")
	private String type;
	@Column(name="COMPANYNAME")
	private String company;
	public VendorEntity(int id, String name, String type, String company) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.company = company;
	}

}
