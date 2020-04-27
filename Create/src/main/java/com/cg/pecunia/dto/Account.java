package com.cg.pecunia.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Account {
	@Id
	String accId;
	String branchId;
	String accType;
	String accStatus;
	String accBal;
	@OneToOne
	Customer customer;
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getAccStatus() {
		return accStatus;
	}
	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}
	public String getAccBal() {
		return accBal;
	}
	public void setAccBal(String accBal) {
		this.accBal = accBal;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", branchId=" + branchId + ", accType=" + accType + ", accStatus="
				+ accStatus + ", accBal=" + accBal + ", , customer=" + customer + "]";
	}
	

}
