package in.sp.stringstack.oops.aggregation_composition;

public class Student {
    private int id;
    private String name;
    private int marks;
    private String collegeName;

    private Brain br = new Brain("White",1.3f);

    public Brain getBr() {
        return br;
    }

   private Book bk;

    public Book getBk() {
        return bk;
    }

    public void setBk(Book bk) {
        this.bk = bk;
    }

    public Student(int id, String name, int marks, String collegeName) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.collegeName = collegeName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getCollegeName() {
        return collegeName;
    }
}
