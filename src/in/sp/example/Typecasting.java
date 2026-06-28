package in.sp.example;

public class Typecasting {
    public static void main(String[] args) {
        short shortNumber = 10;
        int intNum = shortNumber;
        System.out.println(intNum);
        short shortNumber2 = (short) intNum;
        System.out.println(intNum);
        long longNumber = Long.MAX_VALUE;
        float floatNumber = Float.MAX_VALUE;
        System.out.println(longNumber);
        System.out.println(floatNumber);
        short shortValue = Short.MAX_VALUE;
        short shortValueMini = Short.MIN_VALUE;
        double doubleValue = Double.MAX_VALUE;
        System.out.println(shortValue);
        System.out.println(shortValueMini);;
        System.out.println(doubleValue);
    }
}
