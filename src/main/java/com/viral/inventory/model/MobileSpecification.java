package com.viral.inventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile_specification")
public class MobileSpecification implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3482833697869308714L;

	@Id
	@Column(name = "MOB_SPEC_ID", columnDefinition = "INT")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mobileSpecId;
	
	private String name;
	
	private String model;
	
	private String internalStorage;

	private String externalStorage;
	
	private String frontCamera;
	
	private String backCamera;
	
	private String operatingSystem;
	
	
	
	
	
	
}
