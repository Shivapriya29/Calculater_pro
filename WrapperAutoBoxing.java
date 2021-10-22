/* using Wrapper class to convert primitive into object is known as autoboxing */
public class WrapperAutoBoxing {
	public static void main(String[] args) {
		int a= 20; // simplily int  defining  value 
		Integer i = Integer.valueOf(a); // converting int(primitive) to Integer(object) 
		Integer j = a; //autoboxing , now compiler will Integer.value(a) Internally
		System.out.println(a+" "+i+" "+j);
	}
}
