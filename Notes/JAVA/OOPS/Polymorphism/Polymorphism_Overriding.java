
package Notes.OOPS.Polymorphism;

import Notes.OOPS.Object_And_Class.B;

public class Polymorphism_Overriding extends B{
    
    public static void main(String[] args) {
        B b1 = new B();
        b1.test1();
        Polymorphism_Overriding a1 = new Polymorphism_Overriding();
        a1.test1();
    }
    @Override // @Override Annotation (this will checks method name, and other requirement to override)
            // Wheather overriding is required
    public void test1(){
        System.out.println(200);
    }
}
