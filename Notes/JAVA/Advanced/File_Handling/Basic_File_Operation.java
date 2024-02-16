package Notes.Advanced.File_Handling;


import java.io.File;
import java.io.IOException;


public class Basic_File_Operation{
    public static void main(String[] args) {
        try {
        File f = new File("E://test files//C.txt");
        File g = new File("E://test files//P.txt");
        System.out.println(f);
        boolean val = f.exists(); // It will check wheater file is available at given path or not
        // boolean val1 = f.delete(); // For deleting a file 
        System.out.println(val);
        // System.out.println(val1);

        // For checking file is avilable in given location
        System.out.println("Ans "+f.isFile()); 
        // For creating file in given location
        boolean var = g.createNewFile();
        System.out.println(var);
        long count = f.length();
        System.out.println(count);
        
        } catch (IOException e) {
            
        }
    }
}