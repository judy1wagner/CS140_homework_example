//CS140 - 2206
//Judy Bagwell 
//Week 3 Chapter 4 Self-Check questions 7 and 8

//access the Scanner utility
import java.util.Scanner;

public class JBagwellHWChaptFour {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in); //I don't understand 
                                                  //what this does

        //answer to number 7
        System.out.println ("Question 7 in Action");
        System.out.print ("Enter an integer:  "); //prompts the user
        int yourNumber = console.nextInt(); //stores the number the user enters
        
        if (yourNumber % 2 == 0) { //logical test
            System.out.println ("This number is even");//result that prints if even
        } else {
            System.out.println ("This number is odd"); //result that prints if odd
        }
        
        System.out.println ();
         //answer to number 8

        System.out.println ("Question 8 in Action");
        System.out.print ("Type a number:  "); 
        int Number = console.nextInt();
        
        if (Number % 2 == 0) {
            if (Number % 3 == 0) {
                System.out.println ("Divisible by six.");
            } else {
                System.out.println ("This number is even and not divisible by 6"); 
            }
        } else {
            System.out.println ("Odd.");
        }
        
     
        System.out.println ();

        //I accidentally corrected 9 even thought I didn't have to 
        //Here is my answer
        System.out.println ("Question 9 in Action"); 
        System.out.print ("What is your favorite color? ");
        String name = console.next();
        
        if (name.equalsIgnoreCase("rainbow")) { //the color is also corrected
           System.out.println ("Mine, too!");
        } else {
           System.out.println ("Wrong answer!");
        }    
    }
}
        
     