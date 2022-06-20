package com.xworkz.placement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="placements")
public class PlacementEntity {

	@Id
	@Column(name="id")
	private String CompanyName ;
	private String CompanyFounder;
	private boolean CompanyType;
	private long CompContactNo;
	 
	  @Column(name = "name") // column to class member mapping(if both names are diff) 
	  private String name;
	   private double rating;
	   private String type;
	 

}
