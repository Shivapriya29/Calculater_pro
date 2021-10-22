/* wrapper class provides the mechanism to convert wrapper to primitive is known as unboxing*/
public class WrapperUnBoxing {
	public static void main(String[] args) {
		Integer a = new Integer(3);
		int i = a.intValue(); // Converting Intefer(Object) to int(primitive) 
		int j = a;  //unboxing , now compiler will write a.intValue() internally
		float f = a;// unboxing , now compiler will write a.floatValue() internally
		System.out.println(a+" "+i+" "+j+" "+f);
	}
}