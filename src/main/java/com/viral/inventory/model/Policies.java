package com.viral.inventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policies")
public class Policies implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2696812642377733206L;
	
	@Id
	@Column(name = "POLICY_ID", columnDefinition = "INT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long policyId;
	
	@Column(name = "CAN_RETURN")
	private boolean canReturn;
	
	@Column(name = "SELLABLE")
	private boolean sellable;
	
	@Column(name = "CAN_REPLACE")
	private boolean canReplace;
	
	@Column(name = "REPAIR_INSURANCE")
	private boolean repairInsurance;
	
	@Column(name = "WARRANTY_DURATION")
	private float warrantyDuration;

	
	public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public boolean isCanReturn() {
		return canReturn;
	}

	public void setCanReturn(boolean canReturn) {
		this.canReturn = canReturn;
	}

	public boolean isSellable() {
		return sellable;
	}

	public void setSellable(boolean sellable) {
		this.sellable = sellable;
	}

	public boolean isCanReplace() {
		return canReplace;
	}

	public void setCanReplace(boolean canReplace) {
		this.canReplace = canReplace;
	}

	public boolean isRepairInsurance() {
		return repairInsurance;
	}

	public void setRepairInsurance(boolean repairInsurance) {
		this.repairInsurance = repairInsurance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public float getWarrantyDuration() {
		return warrantyDuration;
	}

	public void setWarrantyDuration(float warrantyDuration) {
		this.warrantyDuration = warrantyDuration;
	}
	
	
}
