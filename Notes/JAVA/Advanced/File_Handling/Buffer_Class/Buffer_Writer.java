package Notes.Advanced.File_Handling.Buffer_Class;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Buffer_Writer {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E://test files//C.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("5000000000");
            bw.newLine();
            bw.write("Aman Gautam");
            char[] ch = {'a', 'b', 'c'};
            for (char d : ch) {
                System.out.println(d);
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
