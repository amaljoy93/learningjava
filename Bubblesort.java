package package1javabasics;

public class Bubblesort {

	public static void main(String[] args) {
		int a[] = {10, 20, 5, 50,30,15};
		int i;
		// TODO Auto-generated method stub
		for(i=0;i<a.length;i++)
		{ 
			for(int j = 0;j<a.length-1-i;j++)
			{
				if (a[j+1]<a[j])
				{ 
					int temp=0;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
								
				}
				
			}
			
		}
		
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		

	}

}
