package com.java.shopping;

abstract class Acount
{
	long   Acc_no;
	String Owner_name;
	double Balance;
	
	// Constructor Initilize With Iheritance Concepts
	public Acount(long Acc_no,String Owner_name)
	{
		this.Acc_no     = Acc_no;
		this.Owner_name = Owner_name;	
	}
	
	public abstract void deposit(double Amt);
	public abstract void withdraw(double Amt);
	public abstract void checkBalance();
	
	public abstract void displayDetails();
	
}

// SAVINGS ACCOUNT...
class Savings extends Acount  
{
	double rateOfintrest; 
	
	public Savings(double rateOfintrest,long Acc_no,String Owner_name)
	{
		super(Acc_no,Owner_name);    //--> Initilize parent class data members using " Super(); " keywords to achive object class
		this.rateOfintrest=rateOfintrest;
	}
	
	public void calculate_roi() 
	{
		if(Balance>=500.0)
		{
			Balance = Balance + Balance * rateOfintrest;
			System.out.println("Savings Amount : "+Balance+" With Rs/- "+rateOfintrest+" % Intrest ");
		}else
			{
			  System.out.println("No Intrest Amount is less than 500.0 Rs/-");
			}
	}
	
	@Override             // --> Modified the methods from parent class is known as "Method Overriding"
	public void deposit(double Amt)
	{
		Balance = Balance + Amt;
		System.out.println("Deposited Amount : "+Amt);
	}
	
	@Override             // --> Modified the methods from parent class is known as "Method Overriding"
	public void withdraw(double Amt) 
	{
		Balance = Balance - Amt;
		System.out.println("Withdraw Amount : "+Amt);
	}
	@Override             // --> Modified the methods from parent class is known as "Method Overriding"
	public void checkBalance() 
	{
		
		System.out.println("Check Balance "+Balance);
	}
	
	
	@Override             // --> Modified the methods from parent class is known as "Method Overriding"
	public void displayDetails() 
	{
		System.out.println("---------------------------");
		System.out.println("Savings Account Details..");
		System.out.println("---------------------------");
		System.out.println("Name :"+Owner_name);
		System.out.println("Account No : "+Acc_no);
	}
	
	
}

//CURRENT ACCOUNT...
class Current extends Acount 
{
	final  double minbal = 500.0; // minbal = minimum balance should be constant
	
	// Constructor Initilize With Iheritance Concepts
	public Current(long Acc_no,String Owner_name)
	{
		super(Acc_no,Owner_name);  //--> Initilize parent class data members using " Super(); " keywords to achive object class
	}
	
	@Override             // --> Modified the methods from parent class is known as "Method Overriding"
	public void deposit(double Amt)
	{
		if(Amt>=0)	
		{
			Balance = Balance + Amt;
			System.out.println("Deposited Amount : "+Amt);
		}
	}
	
	@Override             // --> Modified the methods from parent class is known as "Method Overriding"
	public void withdraw(double Amt) 
	{
		if(Amt>=0 && Balance>=Amt)
		{
			Balance = Balance - Amt;
			System.out.println("Withdraw Amount : "+Amt);
		}
	}
	@Override             // --> Modified the methods from parent class is known as "Method Overriding"
	public void checkBalance() 
	{
		
		System.out.println("Check Balance "+Balance);
	}
	
	@Override             // --> Modified the methods from parent class is known as "Method Overriding"
	public void displayDetails() 
	{
		System.out.println("--------------------------");
		System.out.println("Current Account Details..");
		System.out.println("--------------------------");
		System.out.println("Name : "+Owner_name);
		System.out.println("Account No : "+Acc_no);
	}
}


public class BankAccount 
{
	public static void main(String[] args) 
	{
		// Current Account class object
				Current c = new Current(7339110990l, "Madesh");
						c.displayDetails();
				        c.deposit(600.0);
				        c.withdraw(150.0); 
				        c.checkBalance();
				        
        // Savings Account class object
        Savings s = new Savings(0.05, 6448979025l, "Murugan");
		        s.displayDetails();
			    s.deposit(600.0);
			    s.withdraw(100.0);
			    s.calculate_roi();
			    s.checkBalance();
				        

				        
	}
}
