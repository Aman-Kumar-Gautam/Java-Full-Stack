package Notes.OOPS.Constructor;
public class Constructor {
    Constructor(){    // Creation of constructor
        System.out.println(100); // Calling method (a1,a2,a3)
        //return 100; // Error (Constructor can't return anything)
    }

    void Constructor(){       // Now it's behave like method
        System.out.println(200);
    }

    Constructor(int x){ // With arguments constructor created
        System.out.println(x);
    }
    public static void main(String[] args) {
        Constructor a1 = new Constructor(1000); // Provided x as 1000
        Constructor a2 = new Constructor();
        Constructor a3 = new Constructor();
        a1.Constructor();
        a3.Constructor();
        a2.Constructor(); // Required var name.constructor to call.
    }
}
