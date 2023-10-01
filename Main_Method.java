package com.jsp.abstracts;
// ABSTRACT CONCEPTS

abstract class AmazonUser // Two user Customer and Admin     
{
	public abstract void login();     // Only method deceleration is called as adstract class
	public abstract void logout();
}

class Customer extends AmazonUser // Concrete Methods
{
	@Override
	public void login()           // Overriding is mandatory for with method decleration and method definition is called as concrete methods
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void logout() 
	{
		// TODO Auto-generated method stub
		
	}
}

class Admin extends AmazonUser // Concrete Methods
{
	@Override
	public void login() 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void logout() 
	{
		// TODO Auto-generated method stub
		
	}
}

public class Main_Method 
{
	public static void main(String...args) 
	{
		

	}
}
