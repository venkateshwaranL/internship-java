package in.sp.stringstack.oops.aggregation_composition;

public class StudentApp {
    public static void main(String[] args) {
        Student st = new Student(159,"Venkatesh",95,"SRM");
        System.out.println("Student id: "+st.getId()+", student Name: "+st.getName()+", Mark: "+st.getMarks()+", College Name: "+st.getCollegeName());
        System.out.println("Student Brain Color:"+st.getBr().getColor()+", Weight of the Brain: "+st.getBr().getWeight());
        Book book = new Book("Balan","Life of Ram",5000);
        st.setBk(book);
        System.out.println("Book Name:"+st.getBk().getBookName()+", Author: "+st.getBk().getBookName()+", Price: "+st.getBk().getPrice());
        st = null;
        System.out.println("Student obj is Null");
        System.out.println("Student id: "+st.getId()+", student Name: "+st.getName()+", Mark: "+st.getMarks()+", College Name: "+st.getCollegeName());
        System.out.println("Book Name:"+book.getBookName());
    }
}
