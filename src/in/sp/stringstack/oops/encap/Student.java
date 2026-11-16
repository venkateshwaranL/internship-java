package in.sp.stringstack.oops.encap;

public class Student {
    private int id;
    private String name;
    private String password;

    public void setId(int num, String userName, String pass) {
        if (num > 0) {
            id = num;
        } else {
            System.out.println("Default value set");
        }
        if (userName != null) {
            name = userName;
        } else {
            name = "Ram";
            System.out.println("Defalut value Set");
        }
        if (pass != null) {
            password = pass;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}
