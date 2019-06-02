package numbertohour;
/**
 *
 * @author Diego
 */
public class Conversor{
    static double num;
    static int h,min,seg;
    public static void numbertohour(double number){
		num = number;
		h = (int)(num/3600);
		min = (int)((num % 3600)/60);
		seg = (int)((num % 3600) % 60);
		System.out.println("The hour found: "+h+"h "+min+"m "+seg+"s ");
    }    
}
