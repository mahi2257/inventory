package com.viral.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="subCategory")
public class SubCategory {
	
	@Id
	@Column(name = "SUB_CAT_ID", columnDefinition = "INT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subCatId;
	
	@Column(name="NAME", unique = true)
	private String subCatName;
	
	@Column(name="STATUS")
	private Integer subCategoryStatus;

	@OneToOne
	@JoinColumn(name = "CAT_ID_FK")
	private Category category;
	
	public Long getSubCatId() {
		return subCatId;
	}

	public void setSubCatId(Long subCatId) {
		this.subCatId = subCatId;
	}

	public String getSubCatName() {
		return subCatName;
	}

	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}

	public Integer getSubCategoryStatus() {
		return subCategoryStatus;
	}

	public void setSubCategoryStatus(Integer subCategoryStatus) {
		this.subCategoryStatus = subCategoryStatus;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
