package BankApplication.java;
import java.util.Scanner;

public class BankApplication {
	public static void main(String []args) {
		BankAccount obj1= new BankAccount("sakshi wasadikar","12345");
		obj1.showmenu();
	}

}
class BankAccount
{
	int balance;
	int previoustransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname,String cId)
	
	{
		customerName= cname;
		customerId=cId;
	
	
	}
		
		
	
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
			previoustransaction=amount;
			
		}
	}
	void withdraw(int amount) 
	{
		if(amount!=0) {
			balance=balance-amount;
			previoustransaction=-amount;
			
		}
		
	}
	void getprevioustransaction()
	{
		if(previoustransaction >0)
		{
			System.out.println("deposited:"+previoustransaction);
		}
		else if(previoustransaction <0)
		{
			System.out.println("withdrawn:"+Math.abs(previoustransaction));
		}
		else{
	
			System.out.println("no transaction occured");
		}
}
	

	void showmenu()
	{
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		System.out.println("welcome:"+customerName);
		System.out.println("YourId:"+customerId);
		System.out.println("\n");
		System.out.println("A.checkbalance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdrwan");
		System.out.println("D.Previous Transaction");
		System.out.println("E. Exit");
		do 
		{
			System.out.println("_________________________________________");
			System.out.println("Enter an option");
			System.out.println("-----------------------------------------");
			option= scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
			System.out.println("-----------------------------------------");
			System.out.println("Balance="+balance);
			System.out.println("-----------------------------------------");
			System.out.println("\n");
			break;
			
			case 'B':
			System.out.println("-----------------------------------------");
			System.out.println("enter an  amount to deposit");
			System.out.println("-----------------------------------------");
			int amount= scanner.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
			
			case'C':
				System.out.println("--------------------------------------");
				System.out.println("enter an amount to withdrawn");
				System.out.println("---------------------------------------");
				int amount2= scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case'D':
				System.out.println("---------------------------------------");
				getprevioustransaction();
				System.out.println("----------------------------------------");
				break;
				
			case 'E':
				System.out.println("******************************************");
				break;
			
			default:
				System.out.println("Invalid Option!!. Please enter again");
				break;
			}
			
			}while(option!='E');
			System.out.println("Thank you for using services");	
		}
	}

	




	




			
			
		
	
	
	
