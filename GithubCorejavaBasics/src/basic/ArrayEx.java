package basic;

public class ArrayEx
{

	public static void main(String[] args) {
		int num[]= {1,2,4,8,9,10,22,33,24};
		System.out.println(num.length);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		 int a[][]= {{2,7},{4,8},{7,6}};
		 System.out.println("a[0][0] :"+a[0][0]);
		 System.out.println("a[0][1] :"+a[0][1]);
		 System.out.println("a[1][0] :"+a[1][0]);
		 System.out.println("a[1][1] :"+a[1][1]);
	for(int i=0;i<2;i++)
		for(int j=0;j<2;j++)
			System.out.println(a[i][j]);
		 
		 
		 
		 //loops example
		//for(int a=0;a<10;a++)
			//System.out.println(a);
		//for(int b=0;b<=15;b++)
			//System.out.println(b);

		
}
}
