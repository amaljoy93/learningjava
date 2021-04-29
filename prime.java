package package1javabasics;

public class prime {

	int a=87;
	static boolean primenumber(int a)
	{
		if(a<0)
		{
			return false;
		}
		if(a==1)
		{
			return false;
		}
		if(a==2)
		{
			return true;
		}
		if(a%2==0)
		{
		return false;	
		}
		else
		{
			for(int i=3;i<Math.sqrt(a);i++)
			{
				if(a%i==0) 
				{
					return false;
				}
			}
			return true;
		}	
		}
		public static void main(String[] args) {
						System.out.print(primenumber(81));
		// TODO Auto-generated method stub

	}

}
