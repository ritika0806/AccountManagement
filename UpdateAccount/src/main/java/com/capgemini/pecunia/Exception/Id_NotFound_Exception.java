package com.capgemini.pecunia.Exception;

public class Id_NotFound_Exception extends Exception{
	public Id_NotFound_Exception(String errorMsg){
		super(errorMsg);
		System.out.println("id does not exist");
	}
}
