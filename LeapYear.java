package assignements;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(2012)); 

	}
	
	
		public static boolean isLeapYear(int year) {
		    // Logic
		        // Year must be between 1 and 9,999
		        if (year < 1 || year > 9_999) return false;
		        // begin checks for leap year
		        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		    }
		
	}
	
	
	

