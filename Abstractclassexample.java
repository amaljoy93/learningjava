package project;
abstract class abstractclass1
{
	abstract void abstractmethod();
	void print()
	{
		System.out.print("Hi");
	}
}

class abc1 extends abstractclass1
{
	void abstractmethod()
	{
		System.out.print("Hi");
	}
}
public class Abstractclassexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc1 A=new abc1();
		A.print();
	}

}
// A class which is decleared as abstract is known as an abstract class.
// It can have abstract and non-abstract methods.
// It needes to br extended and its method implemented.
// It cannot be instatiated

/* points to remember
 An abstract class must ne declared with an abstract keyword
It can have abstract and non-abstract methods
It cannot ve instantiated
It can have constructors andd static methods also
It can have final methods which will force the subclass not to change the body of the method*/ 
 