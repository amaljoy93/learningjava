package assignements;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(561600);
		

	}
	public static void printYearsAndDays(long minutes) {
		if( minutes<0) {
			System.out.println("Invalid Value");
		}
		else {
			long hours = minutes/60;
			long days = hours/24;
			long years = days/365;
			days =days-(years*365);
			
			System.out.println(minutes +" min"+ " = "+ years +" y" + " and " +days +" d");
	}
	
	
	}}
