/* 
There are 2 types of Acess Modifers 
1.Access Modifer(Specifies the Accessibilty or Scope of a field ,Method, Constructer,class  we can chage this Access level. )
[1.private]
[2.Default]
[3.protected]
[4.public]
2.Non-Access Modifer(Statc,Abstract,Synchronized,native,volatile,trasient.)
*/
 class AcessModifers { // it is Accessible everywhere
    public static void main(String[] args){
        PublicModifier obj = new PublicModifier(); // creating object for public class i.e A.java
        obj.message(); // it will print the message.
        s obj2 = new s(); // gives Compile time error.
        
        /* creating private constructer object but it gives Compile time error 
         * bcz it is specified in private.
         * Note: A class cannot be private / protected  Except Nested Class.
         */
        
        DefaultModifier obj3 = new DefaultModifier(); // creating Default object 
        obj3.msg3(); // assign default method to obj of default class 
        /* gives Compile tym errors.*/
        try {
        PrivateAccessModifier obj1 = new PrivateAccessModifier();
        System.out.println(obj1.data); 
        // it gives compilation error bcz the data is not visible bcz it is specified private data member
        System.out.println(obj1.message1()); 
        /* private data method  so we are accessing these private members from outside the class 
         * so there is compile time error.*/
        }
        catch (Exception e) {
        	System.out.println(e);
        }
    }
}
