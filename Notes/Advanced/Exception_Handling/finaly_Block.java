package Notes.Advanced.Exception_Handling;

public class finaly_Block {
    public static void main(String[] args) {
        try {
            int x = 10/2;
            int y = 20/0;
            System.out.println(x);
            System.out.println(y);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            
            
            System.out.println("Finally Block");
        }
    }
}
