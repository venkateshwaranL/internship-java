package in.sp.stringstack.oops.singleton;

public class President {
    private static President ref = null;
    int number;
    String name;
    int term;

    private President() {

    }

    private President(int number, String name, int term) {
        this.number = number;
        this.name = name;
        this.term = term;
    }

    static public President getObject(int number, String name, int term) {
        if (ref == null) {
            if (number == 0 && name == null && term == 0) {
                ref = new President();
            } else {
                ref = new President(number , name ,term);
            }

        }
        return ref;
    }

    void passBills() {
        System.out.println(name + " President is signing and passing the bills");
    }
}
