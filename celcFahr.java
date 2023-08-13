package Java.Java-20230812-exercies;
import java.util.Scanner;

public class celcFahr {
    
    static double fahr(double c) {
    	double f = 1.8*c+32;
    	return f;
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
    }
}