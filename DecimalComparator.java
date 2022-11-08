package assignements;

public class DecimalComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areEqualByThreeDecimalPlaces(3.145, 3.005));

	}
	

		
		
		   
		    public static boolean areEqualByThreeDecimalPlaces(double firstnumber, double secondnumber){
		      
		    int a =(int) (firstnumber*1000);
		    int b =(int) (secondnumber*1000);
		    
		    
		       
		    if(a==b) {
		    	return true;}
		    else {
			return false;
		    
		    }
		    
		    }    
		 
}
