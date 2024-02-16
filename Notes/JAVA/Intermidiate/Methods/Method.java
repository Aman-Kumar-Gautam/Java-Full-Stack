package Notes.Intermidiate.Methods;

public class Method {
    public static void main(String[] args) {

        // Non-static(Instance) Method
        Method a1 = new Method(); // For calling instance method object creation
        String x = a1.test_One(); // Through new object calling instance method
        System.out.println("Instance method x value "+x);// Printing value of x
//---------------------------------------------------------------------------------------------
        // Staic Method
        String val = Method.test_two();
        System.out.println("Static method value "+val);
// ---------------------------------------------------------------------------------------------
        // Method Arguments

        // Single Argument
        Method a2 = new Method();
        a2.test_arguments_one(100);

        // Two arguments
        Method a3 = new Method();
        a3.test_arguments_two(50, "Aman");

        // Multipal Arguments
        Method a4 = new Method();
        a4.test_arguments_multi(1,2,3);
    }


    //private void Prep() {
        // return 100;    // Void method will not return anything Error
    //}
//------------------------------------------------------------------------------------------------
  // Instance Method
//------------------------------------------------------------------------------------------------    

    public String test_One() { // Instance Method
        return "Aman";
   }
//------------------------------------------------------------------------------------------------
  // Static Method
//------------------------------------------------------------------------------------------------
    public static String test_two(){
        return "Gautam";
    }
//---------------------------------------------------------------------------------------------
/* Notes:
 * 1. If method is void so it will not return anything
 * if still try to return it will through error
 * 
 * 2. For non-static method need one object creation in main method through that only
 * we can print or define object and we can call it by ('.', dot operator)
 * 
 * 3. Static mathod no need to create object, we can easily call using method define keyword
 */
 
    public void test_arguments_one(int x){
        System.out.println(x);
    }
 
    public void test_arguments_two(int x, String s){
        System.out.println(x);
        System.out.println(s);
    }

    public void test_arguments_multi(int...x){
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }







}



