package com.qdm.cg.common.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class UserMarital {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer maritalId;
	
	private String Single;
	
	private String Married;

	private String Widowed;

	private String Separated;
	
	private String Divorced;
	
	
	
	
	

}
