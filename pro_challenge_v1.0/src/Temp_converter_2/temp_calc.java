
package Temp_converter_2;

public class temp_calc {
    int gradIn;
    double value;
    // 1 = Celsius
    // 2 = Fahrenheit
    // 3 = Kelvin
    // 4 = Rankine
    
    public temp_calc(){
        System.out.println("Class build with sucess");
    }
    
    public void converter(int gradIn, double value){
        this.gradIn = gradIn;
        this.value = value;
        
        switch(gradIn){
            case 1:
                        System.out.printf("%.2f Celsius\n",(value));
                        System.out.printf("In Fahrenheit: %.2f\n",(1.8 * value) + 32);
                        System.out.printf("In Kelvin: %.2f\n",(value + 273.15));
                break;
                
            case 2:
                System.out.printf("%.2f Fahrenheit\n",(value));
                System.out.printf("In Celsius: %.2f\n", (value - 32) / 1.8);
                System.out.printf("In Kelvin: %.2f\n",(value + 459.67) * 1.8);
                break;
                
            case 3:
                System.out.printf("%.2f Kelvin\n",(value));
                System.out.printf("In Celsius: %.2f\n",(value - 273.15));
                System.out.printf("In Fahrenheit: %.2f\n",(1.8 * (value - 273.15) + 32));
                break;

            default:
                System.out.println("Insert the right values, ur danke");
        }
    }
    
}
