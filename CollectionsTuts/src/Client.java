//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Client {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		BankAccount account_one = null;
		Set<BankAccount> list = new TreeSet<BankAccount>();
		
		//int account_created = 0;
		
		boolean isCompleted = false;
		
		long temp_account;
		BankAccount index;
		
		
		while(!isCompleted) {
			System.out.println("Hello there...How can I help you?");
			System.out.println("1 : Create a Bank Account");
			System.out.println("2 : View your account balance");
			System.out.println("3 : Deposit");
			System.out.println("4 : Withdraw");
			System.out.println("5 : Show All");
			System.out.println("6 : Exit");
			int user_option = sc.nextInt();
			
			switch(user_option) {
				case 1 : 
					
					System.out.println("Personal Details");
					System.out.println("-----------------");
					
					System.out.println("Please enter your name : ");
					String name = sc.next();
					
					System.out.println("Please enter your age : ");
					int age = sc.nextInt();
					
					System.out.println("Please enter your mobile number : ");
					String number = sc.next();
					
					System.out.println("Please enter your gender (Male/Female) : ");
					String gender = sc.next();
					
					sc.nextLine();
					
					System.out.println("Please enter your street name : ");
					String street = sc.nextLine();
					
					System.out.println("Please enter your city : ");
					String city = sc.next();
					
					System.out.println("Please enter your state : ");
					String state = sc.next();
					
					System.out.println("Please type one of the following option for opening a bank account: ");
					System.out.println("1 : Savings Account");
					System.out.println("2 : Current Account");
					System.out.println("3 : Salary Account");
					
					int option = sc.nextInt();
					
					if(option == 1) {
						account_one = new SavingsAccount(new Person(name,age,number,gender), BankAccount.Account_Type.SAVINGS_ACCOUNT, new Address(street,city,state));
					}
					else if(option == 2) {
						account_one = new CurrentAccount(new Person(name,age,number,gender), BankAccount.Account_Type.CURRENT_ACCOUNT, new Address(street,city,state));
					}
					else {
						account_one = new SalaryAccount(new Person(name,age,number,gender), BankAccount.Account_Type.SALARY_ACCOUNT, new Address(street,city,state));
					}
					//account_created = 1;
					list.add(account_one);
					System.out.println("Congrats...Your account is created!!!");
					System.out.println("Account Number : " + account_one.getAccount_no());
					break;
				case 2 :
					System.out.println("Enter your account number : ");
					temp_account = sc.nextLong();
					index = null;
					
					for(BankAccount itr : list) {
						if(itr.getAccount_no() == temp_account) {
							index = itr;
							break;
						}
					}
					
					if(index!=null) {
						System.out.println("Balance : " + index.getBalance());
					}
					else {
						System.out.println("Account Number does not exist!!!");
					}
					break;
				case 3 :
					System.out.println("Enter your account number : ");
					temp_account = sc.nextLong();
					index = null;
					
					for(BankAccount itr : list) {
						if(itr.getAccount_no() == temp_account) {
							index = itr;
							break;
						}
					}
					
					if(index!=null) {
						System.out.println("Please enter the amount you want to deposit :");
						double deposit_amount = sc.nextDouble();
						index.deposit(deposit_amount);
					}
					else {
						System.out.println("Account Number does not exist!!!");
					}
					break;
				case 4 :
					System.out.println("Enter your account number : ");
					temp_account = sc.nextLong();
					index = null;
					
					for(BankAccount itr : list) {
						if(itr.getAccount_no() == temp_account) {
							index = itr;
							break;
						}
					}
					
					if(index!=null) {
						System.out.println("Please enter the amount you want to withdraw :");
						double withdraw_amount = sc.nextDouble();
						index.withdraw(withdraw_amount);
					}
					else {
						System.out.println("Account Number does not exist!!!");
					}
					break;
				case 5 :
					System.out.println("How would you like to display data :");
					System.out.println("1 : Balance");
					System.out.println("2 : Account Number");
					int opt = sc.nextInt();
					
					ArrayList<BankAccount> ar = new ArrayList<BankAccount>(list);
					
					if(opt == 1) {
						Collections.sort(ar, new SortByBalance());
					}
					else {
						Collections.sort(ar, new SortByAccountNumber());
					}
					
					list = new TreeSet<>(ar);
					
					for(BankAccount itr : list) {
						System.out.println(itr);
					}
					break;
				case 6 :
					System.out.println("Exiting...");
					isCompleted = true;
					break;
			}
		}
		
		sc.close();
	}

}