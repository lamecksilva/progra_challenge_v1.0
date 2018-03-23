package Age_seconds_3;
import java.util.Scanner;

public class main_3 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        second Seconds = new second();
        
        System.out.println("** Age in seconds **");
        System.out.printf("Please, insert your age: ");
        Seconds.calc(input.nextInt());
    }
}
