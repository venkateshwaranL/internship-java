package in.sp.stringstack.oops.singleton;

public class Teacher {
    //POJO Class
    // Private properties , Constructor and getter and setter Method
    private static Teacher ref = null;
    private int id;
    private String name;
    String subject;


    private Teacher() {

    }


    private Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    static public Teacher getObject(int id , String name , String subject){
        if(ref == null){
            if(id==0 && name==null && subject==null){
               ref = new Teacher();
            }else {
                ref = new Teacher(id, name, subject);
            }

        }
        return ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " Teacher is teaching " + getSubject());
    }
}
