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
@Table(name="temple_db")

  @NamedQueries({
  
  @NamedQuery
  (name="findByName",query="SELECT TEMPLE FROM TempleEntity TEMPLE where name=:nm"), 
  @NamedQuery
  (name="deleteById",query="DELETE FROM TempleEntity TEMPLE where TEMPLE.id=:id"), 
  @NamedQuery
	(name="getAllnames",query="SELECT * FROM TempleEntity "), 

  
  })
 


public class TempleEntity {
@Id
	
	@Column(name="ID")
	
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="NOOFVISITORSPERDAY")
	private int noOfVisitorsPerDay;
	@Column(name="NoOfPriest")
	private int noOfPriest;
	public TempleEntity(int id, String name, String location, int noOfVisitorsPerDay, int noOfPriest) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.noOfVisitorsPerDay = noOfVisitorsPerDay;
		this.noOfPriest = noOfPriest;
	}
	
	
	}
	


