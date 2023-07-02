package basic;
class Operation{
	void addition(int a,int b,int c) {
		System.out.println("Addition of 3 numbers: "+(a+b+c));
	}
	int divide(int a,int b) {
		return a/b;
}
String displayName(String name) {
	return "Hello " +name;
}
}
public class StaticMethod {

	public static void main(String[] args) {
		Operation o=new Operation();
		o.addition(2,24,44);
		System.out.println("division :"+o.divide(10,2));
		System.out.println(o.displayName("Ramya"));
		
		

	}
}


