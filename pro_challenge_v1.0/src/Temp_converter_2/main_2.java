package Temp_converter_2;
import java.util.Scanner;

public class main_2 {
    static Scanner input = new Scanner(System.in);
    static temp_calc calc = new temp_calc();
    
    public static void main(String[] args) {
        int gradIn;
        System.out.println("** Temperature Converter **");
        System.out.println("** Select the temperature");
        System.out.printf("[ 1 ]: Celsius\n");
        System.out.printf("[ 2 ]: Fahrenheit\n");
        System.out.printf("[ 3 ]: Kelvin\n");
        gradIn = input.nextInt();
        
        System.out.printf("Value for converter: ");
        calc.converter(gradIn, (input.nextDouble()));
        
        
    }
    
}
