package Pattern;

public class NumberPattern {
	
	public static void main(String[] args) {

	}
	
}
		/*
		1 2 3 
		6 5 4 
		7 8 9 
		12 11 10 
		13 14 15 
		int count=0;
		
		for(int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=3;j++){
					count=count+1;
					System.out.print(count+" ");			
}
			}
			else
			{
				int temp=count+1;
				for(int j=count+3;j>=temp;j--){
					count=count+1;
					System.out.print(j+" ");			
				}
			}
			System.out.println("");
		}
	}
}
*/			
			/*for(int j=1;j<=3;j++)
			{
				count=count+1;
				System.out.print(count+" ");
			}*/

		
/*		1 
		2 6 
		3 7 10 
		4 8 11 13 
		5 9 12 14 15 

		
		for(int i=1;i<=5;i++)
		{
			int no=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no =no+5-j;
			}
			System.out.println();
		}
			
		
	}
}
		
*/		
	/*	5 4 3 2 1 
		5 4 3 2 
		5 4 3 
		5 4 
		5 


	for(int i=1;i<=5;i++)
	{
		
		for(int j=5;j>=i;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println("");
	}
}
}
*/	/*
	1 
	1 2 1 
	1 2 3 2 1 
	1 2 3 4 3 2 1 
	1 2 3 4 5 4 3 2 1 

	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			
			System.out.println("");
		}
		
	}
}
*/		
	/*	
		1 
		2 1 
		3 2 1 
		4 3 2 1 
		5 4 3 2 1 
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	}*/
		
		
		/*
		1 
		2 3 
		4 5 6 
		7 8 9 10 
		
		int count=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count = count+1;
				System.out.print(count+" ");
			}
			System.out.println("");
		}
		
		*/
		/*1 
		0 1 
		1 0 1 
		0 1 0 1 
		1 0 1 0 1 

		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
		
	}

		for(int i=1; i<=5; i++)		//For Number Pattern
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}
*/
