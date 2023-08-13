package Java.Java-20230812-exercies;

import java.util.Scanner;

public class bankAtm {
    public static void bot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Order confirmed");
                break;
            case 2:
                System.out.println("info@sololearn.com");
                break;
            default:
                System.out.println("Try again");
                break;
        }
    }

    public static void main(String[] args) {
        bot();
    }
}

