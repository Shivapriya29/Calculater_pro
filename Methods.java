/* Block of Code / Collection of instructions that  perform some task/operation
 * it provides Resusablity of code, readablity of code.
 * we can also easily modify code using method
 * it is executed only when we call/invoke it
 * if the method doesn't return any thing we use void / else  it can return primitive data types */
/* it is 2 types
 * 1. Predefined Method [it is already defined in java class / =>standard library method/ built in method ]
 * 2. User-defined Method
 * */
import java.util.Scanner;
public class Methods {
	public static void main(String[] args) {
		System.out.println("The maximum num is:"+Math.max(50, 80));// predefined method 
		Scanner s = new Scanner(System.in); // creating Scanner class object 
		System.out.println("Enter Num:");
		int num = s.nextInt();// reading value from the user.
		findEvenAdd(num);	// User defined Method. Method calling
		/*Writen by User programer it will modified acoording to the requirements*/
		int c = possitiveNegitive(num);
		System.out.println("num is: "+c); // if it is negitive it will print 0;
		
	}
	public static void/*not writen any type*/ findEvenAdd(int num) { // defined method E/O it has parameter numof type int 
		if(num%2==0) {
			System.out.println("Num is Even");
		}else {
			System.out.println("Num is odd");
		}
	}
public static int possitiveNegitive(int n) {
	if(n>=0) {
		int a = n;
	return a;
	} else {
   return 0;
}
}
}
