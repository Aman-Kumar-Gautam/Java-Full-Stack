package Notes.Intermidiate.Loops;


public class do_while {
    public static void main(String[] args) {
        int x = 8;
        do {
            System.out.println(x);
            ++x;
        }while(x<10);

        
        for (int i = 0; i < 10; i++){
           x: if (i==5){
                continue;
            }
            
            System.out.println(i);
            // break x; Labeld break statement
            // break;
        }
        
    }
}
