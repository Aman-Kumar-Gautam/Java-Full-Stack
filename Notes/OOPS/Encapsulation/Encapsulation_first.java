package Notes.OOPS.Encapsulation;

import java.io.BufferedReader;
import java.io.FileReader;

public class Encapsulation_first{
    public static void main(String[] args) {
        String password;
        try {
            FileReader fr = new FileReader("E://test files//Password.txt");
            BufferedReader br = new BufferedReader(fr);

            Ef_two ef = new Ef_two();
            ef.setPassword(br.readLine());
            System.out.println(ef.getPassword());
            password = br.readLine();
            //System.out.println(ef.getPassword); //We can't access hidden data 
            //diectly but through object it will store

            br.close();
        } catch (Exception e) {
            
        }

    }
}