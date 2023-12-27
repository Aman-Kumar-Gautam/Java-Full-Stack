import java.util.Scanner;

public class CoreJava {
    static char c = 'z'; // Static Variable
    static int b = 10; // Instance Variable

    public static void main(String[] args) {
        //variable();
        //dataTypes();
        //operatorUnary();
        //operatorArithmetic();
        condition();
    
    
    
    
    }
    static void variable(){
        // Types Of Varlable 1. Local, 2. Instance, 3. Static
        CoreJava p = new CoreJava();
        int n = 20; // Local Variable
        System.out.println(n);
        System.out.println(p.b);
        System.out.println(CoreJava.c);
    }
    static void dataTypes() {
        int a = 25;
        boolean t = true;
        char c = 'f';
        byte y = 2;
        short s = 125;
        long v = 20000;
        double d = 2.50;
        float f = (float) 3.1;
        System.out.println(a);
        System.out.println(t);
        System.out.println(c);
        System.out.println(y);
        System.out.println(s);
        System.out.println(v);
        System.out.println(d);
        System.out.println(f);
    }

    static void operatorUnary() {
        int o = 10;
        System.out.println("1 "+o);
        System.out.println("o++ "+o++);
        System.out.println("2 "+o);
        System.out.println("o-- "+o--);
        System.out.println("3 "+o);
        System.out.println("++o "+ ++o);
        System.out.println("4 "+o);
        System.out.println("--o "+--o);
        System.out.println("5 "+o);

        // Output: 1 10
        // o++ 10
        // 2 11  
        // o-- 11
        // 3 10  
        // ++o 11
        // 4 11  
        // --o 10
        // 5 10
    }
    static void operatorArithmetic(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(b%a);
        System.out.println(b/a);
        System.out.println(a/b);
        //System.out.println(ab);
    }


    static void condition(){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the first value: ");
        int a = sc.nextInt();
        System.out.printf("Enter the second value: ",b);
        

        int b = sc.nextInt();
        if(a>b){
            System.out.println("big is: "+a);
        }
        
        else{
            System.out.println("big is: "+b);
        }


    }

}