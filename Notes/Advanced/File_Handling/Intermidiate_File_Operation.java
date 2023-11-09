package Notes.Advanced.File_Handling;

import java.io.File;

public class Intermidiate_File_Operation {
    public static void main(String[] args) {
                
        File g = new File("E://test files//D");
        File h = new File("E://test files//");
        // This is to creatinf folder in given location 
        boolean fol = g.mkdir();
        System.out.println(fol);
        
        
        // To check how many files and folder available in given location
        String[] vals = h.list();
        for (String st: vals) {
            System.out.println(st);
        }

    }
}
