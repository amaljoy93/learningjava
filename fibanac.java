package package1javabasics;

public class fibanac {

	public static void main(String[] args) {
		int a=0,b=1,c,len=10;
		while(len>0)
		{
			System.out.print(a+" ");
			//System.out.print(b+" ");
			c=a+b;
			a=b;
			b=c;
			//System.out.print(c+" ");
			len--;
		}
		
		// TODO Auto-generated method stub

	}

}
