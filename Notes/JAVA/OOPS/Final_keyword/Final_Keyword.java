package Notes.OOPS.Final_keyword;
public class Final_Keyword {
    final static int z = 5;     // Static varible initilization is  required.
    final int i = 7;            // Instance varible initilization is  required.
    public static void main(String[] args) {
        final int x;            // Local varible initilization is not required.
        x = 15;
        System.out.println(x);
        Final_Keyword a1 = new Final_Keyword();
        System.out.println(a1.i);
        System.out.println(Final_Keyword.z);
    }
}
