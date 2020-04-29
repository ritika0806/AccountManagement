package com.capgemini.pecunia.updateaccount.dao;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

//import com.capgemini.pecunia.updateaccount.entity.Account;
import com.capgemini.pecunia.updateaccount.entity.Customer;

public interface AccountManagementDao extends JpaRepository<Customer,Integer> {

	@Modifying
	@Query("update Customer SET customer_Name=?2,contactNumber=?3,address=?4 where account_Id=?1")
	void updateAccount(String accountId,String customerName, String contactNumber, String address);
}
	