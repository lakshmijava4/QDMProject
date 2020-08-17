package com.qdm.cg.common.modal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmationlStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Supportive;
	@Column
	private String Caring;
	@Column
	private String Concerned;
	@Column
	private String Anxious;
	@Column
	private String Weary;
	@Column
	private String Exhausted;
	@Column
	private String Defensive;
	@Column
	private String Controlling;
}
