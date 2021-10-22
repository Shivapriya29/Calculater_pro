
public class ForLoopEx {
 public static void main(String[] args) {
	 System.out.println("Enter The Values of i:-\n");
	 incerementForLoop();
	 System.out.println("\nEnter The Values of j:-\n");
	 decrementForLoop();
 }
 public static void incerementForLoop() { // increment values of for loop 
	 for(int i=0;i<=10;i++) {
		 System.out.println("The Value of I is:"+i);
	 }
 }
 public static void decrementForLoop() { // decrement values of for loop
	 for(int j=10;j>=1;j--) {
		 System.out.println("The Value of J is:"+j);
	 }
 }
}
