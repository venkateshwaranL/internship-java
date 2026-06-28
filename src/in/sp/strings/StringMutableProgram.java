package in.sp.strings;


public class StringMutableProgram {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Venkateshwaran");
        System.out.println(name);
        System.out.println(name+" L");
        System.out.println(name);
        System.out.println(name.append(" L"));
        System.out.println(name);
        System.out.println(name.insert(8,"Mass"));
        for (int i=0;i<name.length();i++){
            System.out.println(i + "-->" +name.charAt(i));
        }
        System.out.println(name);
        StringBuilder veryString = name.replace(8, 12, "Very");
        System.out.println(veryString);
        StringBuilder deleteString = name.delete(8, 12);
        System.out.println(deleteString);
        StringBuilder reverseString = deleteString.reverse();
        System.out.println(reverseString);
        String name2 = deleteString.toString();
        System.out.println(name2);
        System.out.println(deleteString.length());
        System.out.println(deleteString.capacity());
    }
}
