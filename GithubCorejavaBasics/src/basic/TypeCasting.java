package basic;

public class TypeCasting {

	public static void main(String[] args) {
		//narrowing-->bigger to smaller
		double d=88.9;
		short s=(short) d;
		int i=(int) d;
		long l=(long) d;
		float f=(float) d;
		byte b=(byte) d;
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(b);
    
		//Widening-->smaller to bigger
		byte k=4;
		int ii=k;
		float ff=k;
		double dd=k;
		long ll=k;
		System.out.println(ii);
		System.out.println(ff);
		System.out.println(dd);
		System.out.println(ll);



	}

}
