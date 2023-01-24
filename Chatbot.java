//import Scanner
import java.util.Scanner; 

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        
        //set up scanner. 
        Scanner myObj = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = myObj.nextLine();
        //Pick up user's name and store it. 

                           
        //add new a line before asking next question. 
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String home = myObj.nextLine();
        //Pick up user's home and store it. 
                        

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at "+ home + "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        Integer age = myObj.nextInt();
        //Pick up age and store it.


        //add new a line before asking next question.
        System.out.println(String.format("\nSo you're %d, cool! I'm 400 years old.", age));
        System.out.println(String.format("This means I'm %d times older than you.", (400/age)));


        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        myObj.nextLine();
        String language = myObj.nextLine();


        //add new a line here.
        System.out.println(String.format("\n%s, that's great! Nice chatting with you %s. I have to log off now. See ya!", language, name));
        
        //close scanner. 
        System.out.println("Closing Scanner...");
        myObj.close();
        System.out.println("Scanner Closed.");
    }
}
