package Notes.Advanced.File_Handling.file_Serialization;
import java.io.FileInputStream;
// D-Serialization

import java.io.ObjectInputStream;


public class C {
    public static void main(String[] args) {
        try {
            FileInputStream fos = new FileInputStream("E://test files//D.ser");
            
            ObjectInputStream oos = new ObjectInputStream(fos);
            A a1 = (A)oos.readObject();
            System.out.println(a1.name);
            System.out.println(a1.password);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
