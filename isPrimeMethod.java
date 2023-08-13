import java.util.Scanner;

class isPrimeMethod{
    static String isPrime(int number) 
    {
        String result = "Is prime";
        for (int i = 2; i <= Math.sqrt(number); i++) {


        
            
            if (number % i == 0){
                result = "Isn't prime";
                 break;
          
            }
           
        }
          return result;

    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        String output = isPrime(number);
        System.out.println(output);
    }    
}