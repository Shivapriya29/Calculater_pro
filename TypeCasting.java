/* it is a method or process that converts a data type into anthor data type in both manually and automatically 
Automatic is done by Compiler 
Manually is done by Programmer 
there is two types in Casting 
1. Narrowing Type Casting (Converting Large to Smaller)
2.Widening Type Casting(Converting Smaller to Large)
*/

public class TypeCasting {
  public static void main(String[] args){

      NarrowingTypeCasting();// it called static method 
       //it converts lower data type to higher data type 
      WideningTypeCasting(); // it converts higher data type to lower data type .
  }
  static  void NarrowingTypeCasting(){ // static method :- A method that belongs to a class rather than instance of a class.
    // we can call SM without creating an object iit can access static data members and also change the value of it.
      int x = 80;
      long y = x;
      float z = y; 
      System.out.println("Narroing Type Casting Values: "+"\n"+"Int:"+x+"\nLong:"+y+"\nFloat:"+z);
  }
  static  void WideningTypeCasting(){
      double i = 52.5;
      long  j = (long)i;
      int k = (int)j;
      System.out.println("Widening  Type Casting Values: "+"\n"+"Int:"+i+"\nLong:"+j+"\nFloat:"+k);
  }
}
