/* The purpose of this program is to show working knowledge of how If, Else-If 
 * and Else conditionals are used and manipulated.*/
 
import java.util.Scanner;

public class IfElseIf

{
    
    public static void main(String[] args)
    
    {
        
        run(); // Run "run" method.
        
    }
    
    public static void run() // "Run" method.
    
    {
        
        int getNumber = 0; // A variable used to store values for many of the functions in the program and the value input by the user.
        String getAflAnswer = "";
        
        Scanner input = new Scanner(System.in); // Initialise Scanner
        
        System.out.println("This program will give you a general estimate as to which Generation you are considered to belong to! A typical if statement will be used and execute the relevant part of the statement depending on the answer given by the user.");
        System.out.print("Please enter your birth year, eg. 1971: ");
        getNumber = input.nextInt();
        
        while (getNumber < 1920 || getNumber > 2010) // This While loop checks if the number input by user is between 1 and 9. If it is, the program continues. If it isn't, the user will be asked to put in another number.
        {
            System.out.println("Please enter your birth year, eg. 1971: ");
            
            if (input.hasNextInt()) {
                
                getNumber = input.nextInt(); // Stores number input by user.
                
            }
        }
        
        if (getNumber <= 1945) {
            
            System.out.println("You are of the World War 2/Silent Generation.");
        
        }
        
        else if (getNumber <= 1965) {
            
            System.out.println("You are of the Boomers Generation.");
            
        }
        
        else if (getNumber <= 1979) {
            
            System.out.println("You are of Generation X.");
            
        }
        
        else if (getNumber <= 1994) {
            
            System.out.println("You are of Generation Y/Millenial.");
            
        }
        
        else {
            
            System.out.println("You are of Generation Z.");
            
        }
        
        System.out.println("This following part of the program will execute different parts of an if statement depending on the answer to the question which will used as a String value.");
        System.out.print("Do you watch the AFL (Australian Football League)? ");
        getAflAnswer = input.next();
        String convertAflLower = getAflAnswer.toLowerCase();
        
        while (convertAflLower != "y" || convertAflLower != "yes" || convertAflLower != "n" || convertAflLower != "no" ) // This While loop checks if the number input by user is between 1 and 9. If it is, the program continues. If it isn't, the user will be asked to put in another number.
        {
            System.out.println("Do you watch the AFL (Australian Football League)? ");
            
            if (input.hasNext()) {
                
                getAflAnswer = input.next(); // Stores number input by user.
                
            }
        }
        
        if (convertAflLower.equals("y") || convertAflLower.equals("yes")) {
            
            System.out.println("Very nice!");
        
        }
        
        else {
            
            System.out.println("You should try it sometime!");
            
        }
        
        // Nested if statements
        // Switch statements
        // Booleans
    }
}