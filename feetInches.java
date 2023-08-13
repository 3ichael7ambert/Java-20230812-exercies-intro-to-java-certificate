package Java.Java-20230812-exercies;

import java.util.Scanner;

public class feetInches {
    
    static void convert(double num) {
	num*=12;
	System.out.println(num);
}
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble(); 

        convert(num);
    
    }
}