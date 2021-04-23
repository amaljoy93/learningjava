package project;
class parent1{
	void print()
	{
		System.out.println("Joy");
	}
}
class  child1 extends parent1{
	void print()
	{
		System.out.println("Amal");
	}
}

public class progam5 {

	public static void main(String[] args) {
		parent1 a=new parent1();
		child1 b =new child1();
		a.print();
		b.print();
		parent1 a2=new child1();
		a2.print();
		// TODO Auto-generated method stub

	}
/*"When a method in a subclass has the same name, same parameters or signature, and same type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class. "*/
}
