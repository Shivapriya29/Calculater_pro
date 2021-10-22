
public class EqualIfElse {
public static void main(String[] args) {
	String s1 = new String("HIi");
	String s2 = new String("HIi");
	if(s1.equals(s2)) {
		System.out.println("s1 equals s2");
	}else {
		System.out.println("s1 not equals s2");
	}
	if(s1==s2) { // bcz == checks the memory location and value so memory location of s1 & s2 is diff.
		System.out.println("s1 equals s2");
	}else {
		System.out.println("s1 not equals s2");
	}
}
}
