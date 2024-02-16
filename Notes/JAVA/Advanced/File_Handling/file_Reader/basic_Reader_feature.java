package Notes.Advanced.File_Handling.file_Reader;

import java.io.File;
import java.io.FileReader;

public class basic_Reader_feature {
    public static void main(String[] args) {
        try {
            File f = new File("E://test files//C.txt");
            FileReader fr = new FileReader("E://test files//C.txt");
            System.out.println("first "+(char)fr.read());
            for (int i = 0; i < f.length(); i++) {
            System.out.println((char)fr.read());            }
            
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
