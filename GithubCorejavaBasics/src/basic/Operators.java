package basic;

public class Operators {

	public static void main(String[] args) {
		//Bitwise operator
		int a=10;
		int b=5;
		System.out.println("&& :"+(a&b));
		System.out.println(" ||:"+(a|b));
		System.out.println("^ :"+(a^b));
		System.out.println("~ :"+(~b));
		
		
		
		//Relational operator
		int c=10;
		int d=20;
		System.out.println("== :"+(c==d));
		System.out.println("!= :"+(c!=d));
		System.out.println("< :"+(c<d));
		System.out.println("<= :"+(c<=d));
		System.out.println("> :"+(c>d));
		System.out.println(">= :"+(c>=d));
		
		//logical operator
		int e=20;
		int f=30;
	
		System.out.println("|| :"+(e|f));
		
		//shift operator
		
		int x=0010;
		System.out.println(a<<1);
		System.out.println(a<<2);
		System.out.println(a<<3);
		System.out.println(a<<1);
		System.out.println(a>>1);
		System.out.println(a>>2);
		System.out.println(a>>3);
		
		
		// operator
		int y=20;
		int z=15;
		String result=e>f? "y is max":"z is max";
		System.out.println("highest of two number:"+result);
		
		
		//ter operators
		//int p=5;
		//int q=3;
		//int r=8;
		//String ans=(p<<q)&&(q<<r)&&(r<<p)?"p is max" ? "q is max" ?"r is max"?;
	
		//System.out.println("highest of three numbers :"+ans);
		
		
		//int a = 10, b = 25, c = 15, max;
		  
        
        //max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
 
        
        //System.out.println("the max number is  " + a
                           //+ ", " + b + "  " + c + " is "
                           //+ max);
        int p=40;
        int q=100;
        int r=66;
        int m;
        m = (p>q)?(p>r ? p:r):(q>r ?q:r);
        System.out.println(m);
        int min=(p<q)?(p<r ? p:r):(q<r ?q:r);
        System.out.println(min);
     int marks=60;
     String s=marks>80?"pass":"fail";
     System.out.println(s);
     int a1=20;
     int b1=40;
     System.out.println(a+=b);
        
        
	}

}
