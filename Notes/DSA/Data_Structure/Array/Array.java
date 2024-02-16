package Notes.Data_Structure.Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Declearing Array in Java
        // Data type[] nameof array(variable) = new(keyword) data type[arraySize]

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
        System.out.println(i);
        }
        int [] p = {1,5,7,9,11};
        Scanner sc = new Scanner(System.in);
        System.out.println("Desire value: ");
        int val = sc.nextInt();
        sc.close();
        for (int k = 0; k<p.length;k++){
            if (p[k] == val){
                System.out.println(k);
            }
                      
        }
        System.out.println();

        }
    
}
