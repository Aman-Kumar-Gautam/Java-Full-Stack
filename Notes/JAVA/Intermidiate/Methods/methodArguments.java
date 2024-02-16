package Notes.Intermidiate.Methods;


public class methodArguments {
    public static void main(String[] args) {
        methodArguments a1 = new methodArguments();
      
        a1.test1(80);        
        a1.test2(15, "Aman");   
        a1.testMulti(10,20,30,40);
        a1.test4();

        }
    public void test1(int x){
        System.out.println(x);
    }
    public void test2(int x, String s){
        System.err.println(x);
        System.out.println(s);
    }
    public void testMulti(int...x){
        System.out.println("Trial: "+ x[0]);
        for (int j = 0; j < x.length; j++) {
            System.out.println(x[j]);
        } 
    }


    public void test4(){
        System.out.println(999);
        return;
        //System.out.println(999); Unreachable code error
    }
}
