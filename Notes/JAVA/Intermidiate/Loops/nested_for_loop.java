package Notes.Intermidiate.Loops;
public class nested_for_loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
        {  
            for (int j = i; j < 5; j++){
                System.out.print('*');  
            }
            System.out.println();
            
        }
    }
}
