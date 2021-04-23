package project;
class parent{
	String explan;
	String house;
	
}

class child extends parent{
	String car;
}
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent a=new parent();
		a.explan="This 4th java progarm is used to explain inheretance";
		a.house="New farm";
		child b= new child();
		b.house="puthiyaparambil";
		b.car="maruthi wagaanar";
		System.out.println(a.explan);
		System.out.println(a.house);
		System.out.println(b.house);
		System.out.println(b.car);
	}

}
/* Inheritance in Java is a mechanism in which one object acquires all the properities an behaviors of a parent object.here the class named 'child acquirest the properties of parent*/  ;

