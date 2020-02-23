package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author pablogisa
 */
public class ejerarray15split{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce una cadena y el corte mediante '-': ");
    String string=sc.nextLine();
    String[] parts = string.split("-");
    String part1 = parts[0]; 
    String part2 = parts[1];
    String part3 = parts[2];
    String part4 = parts[3];
    String part5 = parts[4];
    
    System.out.println(part1);
    System.out.println(part2);
    System.out.println(part3);
    System.out.println(part4);
    System.out.println(part5);
    }
    
}

