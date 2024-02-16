package Notes.OOPS.This_Keyword;
public class this_keyword {
    
    this_keyword(char z){
        System.out.println(z);
    }
    this_keyword(){
        this('c');
        System.out.println(11);
        

    }
    this_keyword(int x){
        this();
    }
    int x = 10;
    static int y = 100;
    public static void main(String[] args) {
        this_keyword a1 = new this_keyword();
        this_keyword a2 = new this_keyword();
        System.out.println(a1);
        System.out.println(a2.x);
        a1.test();
    }
    public void test(){
        System.out.println(this);
        System.out.println(this.x);
        System.out.println(this.y);// Work but not valid way
        System.out.println("like this "+this_keyword.y);
        this.test2();// The static method test2() from the type this_keyword should be accessed in a static way
    }
    public static void test2(){
        //System.out.println(this);// Error 
        System.out.println(1);
    }
}
