package project;

public class program1 {
	int rollNO;
	String name;
	void print()
	{ 
		System.out.print("first java program");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program1 a1=new program1();
		a1.rollNO=7;
		a1.name="Amal Joy";
		System.out.println(a1.rollNO);
		System.out.println(a1.name);
		a1.print();
	}
  /* A class is a blueprint from which individual objects are created
  * here program1 is a class with individual objects rollNO, name,print 
  * here  keyword 'new' is used to allocate memory at runtime. 
  * All objects get memomery in Heap memory area*/ 

  }
