package in.sp.stringstack.oops.consts;

public class User {
    String id;
    String name;
    int age;
    String email;
    long phone;
    String role;

    public User() {
        System.out.println("User Object Created");
    }

    public User(String id) {
        this.id = id;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(String id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User(String id, String name, int age, String email, long phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public User(String id, String name, int age, String email, long phone, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void userDetails() {
        System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Role: " + role);
//        System.out.println("------------------------");
    }
}
