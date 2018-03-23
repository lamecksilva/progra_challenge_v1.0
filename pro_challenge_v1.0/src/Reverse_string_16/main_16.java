package Reverse_string_16;
import java.util.Scanner;

public class main_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         String reversed;
        
        String streng;
        System.out.println("** Reverse a String **\n");
        System.out.printf("Insert an string here: ");
        streng = input.nextLine();
        
        reversed = reverseString(streng);
        
        System.out.println(reversed);
    }
    
    public static String reverseString(String streng){
        String reversed = null;                     //  Iniciando uma string nula
        
        if ((streng == null) || (streng.length() <= 1)){        // Checa se a string é nula
            return streng;                                                                      // e se só tem 1 "item"
        }
        
        StringBuilder sb = new StringBuilder();                 // Cria uma string vazia que da pra brincar mas que uma 
        for(int i =streng.length() - 1; i >= 0 ;i-- ){              // string normal
            sb.append(streng.charAt(i));                                 // Adiciona um caractere de traz para frente na nova string
        }
        
        return sb.toString();           // retorna a string do builderj
    }
}
