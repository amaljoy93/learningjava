package project;

public class candidate {
	   int age;
	  String name;
	  String job;
	  int salary;
	  void display()
	  {
		System.out.println("this second java  program is used to expalin encapsulation");  
	  }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		candidate c1=new candidate();
		c1.age=27;
		c1.name="Amal Joy";
		c1.job="Software Engineer";
		c1.salary=55000;
		c1.display();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.job);
		System.out.println(c1.salary);
		

	}
/*   Encapsulation in Java is a mechanism of wrapping the data(varaibles) and code acting on the data(methods) together as single unit.
 * here class 'candidate' wrapping the data about candidate such as name,age,job,salary into a single unit .
 */
}
