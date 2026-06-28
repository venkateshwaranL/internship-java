package in.sp.strings;

public class StringExample {
    public static void main(String[] args) {
        String name = "Venkateshwaran";
        String name3 = "Venkateshwaran";
        System.out.println(name);
        String name2 = new String("Venkateshwaran");
        String name4 = new String("Venkateshwaran L");
        System.out.println(name2);
        System.out.println(name.equals(name2));
        int length = name.length();
        System.out.println(length);
        char v = name.charAt(name.indexOf('k'));
        int k = name.indexOf('k');
        System.out.println("K");
        System.out.println(v);
    }
}
