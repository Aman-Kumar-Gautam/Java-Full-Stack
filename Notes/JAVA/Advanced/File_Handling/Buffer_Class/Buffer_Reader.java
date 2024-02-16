package Notes.Advanced.File_Handling.Buffer_Class;

import java.io.BufferedReader;

import java.io.FileReader;

public class Buffer_Reader{
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("E://test files//A.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("first "+(char)br.read());

            char[] ch = new char[10];
            br.read(ch);
            for (char c : ch) {
                System.out.println("2nd "+c);
            }
            System.out.println(br.readLine());
            for (int i = 0; i < 8; i++) {
                System.out.println("3rd "+br.readLine());
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();        }
    }
}