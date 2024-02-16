package Notes.OOPS.Inheritance;

import Notes.Intermidiate.Interfaces.Interface;
import Notes.OOPS.Object_And_Class.B;

public class Multi_Level_Inheritance extends B implements Interface{ // extend interface and 
    @Override
    public void test1(){
        System.out.println(1);
    }
    @Override
    public void test(){
        System.out.println(100);
    }

    public static void main(String[] args) {
        Multi_Level_Inheritance a1 = new Multi_Level_Inheritance();
        Multi_Level_Inheritance a2 = new Multi_Level_Inheritance();
        a1.test1();
        a2.test();
    }
}
