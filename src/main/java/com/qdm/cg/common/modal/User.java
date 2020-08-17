package com.qdm.cg.common.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@Column(name="user_name")
	private String UserName;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_Id")
	private Product products;
	
	
	
}
