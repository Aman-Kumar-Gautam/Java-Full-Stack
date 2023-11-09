package Notes.Advanced.File_Handling.file_Output_Stream;

import java.io.File;
import java.io.FileWriter;

public class A {
    public static void main(String[] args) {
        try {
            File f = new File("E://test files//C.txt");
            FileWriter fw = new FileWriter(f, true);
            fw.write("Aman");
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
