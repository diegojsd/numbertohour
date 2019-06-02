package numbertohour;
/**
 *
 * @author Diego
 */
public class NumberToHour {
    public static void main(String[] args) {
        double number;
        String response = "y";
        while (response.equalsIgnoreCase("y")){
            ScreenCleaner.ClearScreen();
            number = Dialogs.AskNumber();
            Conversor.numbertohour(number);
            response = Dialogs.AskResponse();
        }
        System.out.print("Exit...");
    }    
}
