package Age_seconds_3;

public class second {
    int age;
    public void calc(int age){
        this.age = age;
        int result = (age * 12 * 30 * 24 * 3600);
        System.out.printf("Your age in seconds is: %d\n",result);
    }
}
