
public class AcessModiWithMethodOveriding extends A {
	void msg5()/* msg6() declareing again  in subclass 
	the default modifier is more restrict then protected modifier it will overriden so it will give Compilation error. */
	{   // when we change the method name it will execute bcz  creating diff method 
		System.out.println("this is Method Overiding1");
	}
		public static void main(String[] args) {
			AcessModiWithMethodOveriding amm = new AcessModiWithMethodOveriding(); // creating obj of class 
		amm.msg6(); // 
		amm.msg5();
	}

}
