package Notes.Advanced.File_Handling.file_Serialization;

import java.io.Serializable;

public class A implements Serializable{
    String name = "mike";
    transient String password = "12345";
}
