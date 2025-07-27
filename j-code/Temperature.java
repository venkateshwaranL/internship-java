import java.util.*;
public class Temperature {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the which Type of Temperature you want to Convert");
        System.out.println("For Example");
        System.out.println("Case One : Celsius to Fahrenheit");
        System.out.println("Case Two : Celsius to kelvin");
        System.out.println("Case Three : Fahrenheit to Celsius");
        System.out.println("Case Four : Fahrenheit to Kelvin");
        System.out.println("Case Five : Kelvin to Fehrenheit");
        System.out.println("Case Six : Kelvin to Clesius");
        System.out.println("");
        System.out.println("Enter the Case in Number");
        int cases = scan.nextInt();
        double value , result;
        switch(cases){
            case 1:
                System.out.println("Enter the Temperature in Celsisu");
                value = scan.nextDouble();
                result = ((value * 9/5)+32);
                System.out.println("Temperature in Fahrenheit: " + result);
                break;
            case 2:
                System.out.println("Enter the Temperature in Celsisu");
                value = scan.nextDouble();
                result = value + 273.15;
                System.out.println("Temperature in Kelvin: " + result);
                break;
            case 3:
                System.out.println("Enter the Temperature in Fahrenheit");
                value = scan.nextDouble();
                result = ((value - 32)* 5/9);
                System.out.println("Temperature in Celsius: " + result);
                break;
            case 4:
                System.out.println("Enter the Temperature in Fahrenheit");
                value = scan.nextDouble();
                result = ((value - 32)* 5/9);
                double kl = result + 273.15;
                System.out.println("Temperature in Kelvin: " + kl);
                break;
            case 5:
                System.out.println("Enter the Temperature in Kelvin");
                value = scan.nextDouble();
                result = value - 273.15;
                double f = ((result * 9/5)+32);
                System.out.println("Temperature in Celsius: " + f);
                break;
            case 6:
                System.out.println("Enter the Temperature in Kelvin");
                value = scan.nextDouble();
                result = value - 273.15;
                System.out.println("Temperature in Fahrenheit: " + result);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
        }
        scan.close();
    }
}