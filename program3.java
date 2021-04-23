package project;

public class program3 {
	void printhello()
	{
		System.out.println("This 3rd java program is used to explain polymorphism");
	}
	void printhello(int i)
	{
		System.out.println(i);
	}
	void printhello(int i,int j)
	{
		System.out.println(i+j);
	}

    void printhello(int i, int j, int k)
    {
       System.out.println(i*j*k);	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program3 a=new program3();
              a.printhello();
              a.printhello(20);
              a.printhello(30, 40);
              a.printhello(10, 20, 30);
	
	}
}
/* Polymorphism means "many forms". and it occourrs when we have many classess that are related to each other by inheretence. here 'printhello' method has different defenitions and perfeom different tasks depeinding on the arguments passed.*/ 