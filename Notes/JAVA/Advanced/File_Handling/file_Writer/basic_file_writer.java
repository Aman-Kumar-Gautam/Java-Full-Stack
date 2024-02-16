package Notes.Advanced.File_Handling.file_Writer;

import java.io.File;
import java.io.FileWriter;

public class basic_file_writer {
    public static void main(String[] args) {
        try {
            File fr = new File("E://test files//D.txt");

            FileWriter fw = new FileWriter(fr, false);
            System.out.println(fw);
            fw.write("Aman");
            fw.write(" Gautam");
            fw.write(100);
            char [] c = {'a', 'b'};
            fw.write(c);
            fw.flush(); // flushes the stream (nothing should left to write in the file)
            fw.close();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        

    }
}
