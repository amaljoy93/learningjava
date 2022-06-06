package emailapp;

import java.util.Scanner;

public class Email {
	 private String firstName;
	 private String lastName;
	 private String password;
	 private String department;
	 private String email;  
	 private int defaultPasswordLength=10;
	 private int mailboxCapacity=500;
	 private String alternateEmail;
	 private String companySuffix="apple.com";
	//encapsulation we dont want people to access  so we will make it private 
	
	// Constructor to first name and last name
	 public Email(String firstName,String lastName) {
		 this.firstName=firstName;
		 this.lastName=lastName;
		 System.out.println("EMAIL CREATED: " +this.firstName+" "+ this.lastName);
		
		 // Call a method asking for the department - return the department
		 this.department= setDepartment();
		 System.out.println("Department:"+this.department);
		 
		 // Call a method that returns a random password
		 this.password=randomPassword(defaultPasswordLength);
		 System.out.println("Your password is: "+this.password);
		 
		 // Combine elements to generate email
		 email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"." + companySuffix;
		 System.out.println("Your email is :"+email);
	 }
	 // Ask for the department 
	 private String setDepartment() {
		 System.out.print("DEPARTMENT CODES \n1 for sales \n2 for Developement \n3 for Accounting\n0 for none\nEnter department code:");
		 Scanner in =new Scanner(System.in);
		 int depChoice = in.nextInt();
		 if(depChoice==1 ) {return "sales";}
		 else if (depChoice == 2) {return "dev";}
		 else if(depChoice == 3) {return  "acct";}
		 else {return"";}
		 
	 }
	 //Generate a random password
	 private String randomPassword(int length) {
		 String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#";
		 char[] password = new char[length];
		 for(int i=0;i<length;i++) {
			 int rand=(int)(Math.random()* (passwordSet.length()));
			 password[i]=passwordSet.charAt(rand);
			 
		 }
		 return new String(password);
		 
	 }
	 //Set the mailbox capacity
	 public void setMailboxCapacity(int capacity) {
		 this.mailboxCapacity=capacity;
	 }
	 //Set the alternative email
	 public void setAlternateEmail(String altEmail) {
		 this.alternateEmail=altEmail;
	 }
		 //change the password
	 public void changePassword(String password) {
		 this.password = password;
		}
	 public int getMailboxCapacity() {return mailboxCapacity;}
	 public String getAlternativeEmail() { return alternateEmail;}
	 public String getPassword() {return password;}
		
	 }


