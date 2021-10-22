package pack;
 import pack1.*;
/* it is accessible within package and outside the package but through inheritance only
 * it can't appiled on the class
 * it provides more accessibilty than the deafault modifer.
 * */

class ProtectedModifier extends ProtectedModifierMethod {
   public static void main(String[] args) {
	   ProtectedModifier  pm = new ProtectedModifier();
	   pm.msg4();
   }
}
