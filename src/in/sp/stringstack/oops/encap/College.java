package in.sp.stringstack.oops.encap;

public class College {
    public static void main(String[] args) {
        Student st = new Student();
//        st.name="Vekatesh";
        st.setId(159,"Venkatesh","qwerqwef");
        System.out.println("Name of the Student is "+st.getName()+" Id: "+st.getId()+" password: "+st.getPassword());
    }
}
