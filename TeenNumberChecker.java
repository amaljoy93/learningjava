package assignements;

public class TeenNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasTeen(11,10,10));
		System.out.println(isTeen(13));

	}


	public static boolean hasTeen(int a, int b, int c) {
		if((a<=19&&a>=13)||(b<=19&&b>=13)||(c<=19&&c>=13)){
			return true;
		}
		else
		return false;
	}
	public static boolean isTeen(int d) {
		if(d<=19&&d>=13){
			return true;
		}
		else
			return false;
	}
	

}