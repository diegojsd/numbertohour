package numbertohour;

import java.util.*;
/**
 *
 * @author Diego
 */
public class Dialogs {
    static Scanner sc = new Scanner(System.in);    
    public static double AskNumber(){
        double number;
        System.out.print("Enter a number to be converted: ");
        number = sc.nextDouble();
        return number;
    }
    public static String AskResponse(){
        String response = "p";
        System.out.print("Do you want convert another number(y/n)? ");
        response = sc.next();
        while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")){
            ScreenCleaner.ClearScreen();
            System.out.println("\nDigite uma resposta válida !!");
            response = AskResponse();
        }
        return response;
    }
}
