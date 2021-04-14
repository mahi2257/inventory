package com.viral.product.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class Rating implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1954541723733062767L;
	
	@Id
	@Column(name="starId_pk", columnDefinition = "INT")
	private Long starId;
	
	@Column(name = "FIRST_PERCENTAGE")
	private Integer firstPercentage;
	
	@Column(name = "TWO_PERCENTAGE")
	private Integer secondPercentage;
	
	@Column(name = "THREE_PERCENTAGE")
	private Integer thirdPercentage;
	
	@Column(name = "FORTH_PERCENTAGE")
	private Integer forthPercentage;
	
	@Column(name = "FIVE_PERCENTAGE")
	private Integer fivePercentage;

	
	
	public Long getStarId() {
		return starId;
	}

	public void setStarId(Long starId) {
		this.starId = starId;
	}

	public Integer getFirstPercentage() {
		return firstPercentage;
	}

	public void setFirstPercentage(Integer firstPercentage) {
		this.firstPercentage = firstPercentage;
	}

	public Integer getSecondPercentage() {
		return secondPercentage;
	}

	public void setSecondPercentage(Integer secondPercentage) {
		this.secondPercentage = secondPercentage;
	}

	public Integer getThirdPercentage() {
		return thirdPercentage;
	}

	public void setThirdPercentage(Integer thirdPercentage) {
		this.thirdPercentage = thirdPercentage;
	}

	public Integer getForthPercentage() {
		return forthPercentage;
	}

	public void setForthPercentage(Integer forthPercentage) {
		this.forthPercentage = forthPercentage;
	}

	public Integer getFivePercentage() {
		return fivePercentage;
	}

	public void setFivePercentage(Integer fivePercentage) {
		this.fivePercentage = fivePercentage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
