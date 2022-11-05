package assignements;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shouldWakeUp(true,25));

	}
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            return false;
        }
            return true;
    }
	

}

