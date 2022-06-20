package com.xworkz.placement.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="placements")
public class UserEntity {


		@Id
		@GenericGenerator(name="pkvalue", strategy="increment")
		@GeneratedValue(generator= "pkvalue")
		private int id;
		private String name;
		private  String email;
        private long contact;
        private String gender;
        private String password;
     //   @Column(name = "id") // column to class member mapping(if both names are diff)
		public void setPassword(String string) {
			// TODO Auto-generated method stub
			
		}
		

}
