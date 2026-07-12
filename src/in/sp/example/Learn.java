package in.sp.example;


class Book{
    String bName;
    int bId;
    Book(String bName, int bId){
        this.bName=bName;
        this.bId = bId;
    }
    static{
        String stdName;
    }
}
public class Learn {
    public static void main(String[] args) {
        Book b = new Book("Java",22);
        System.out.println("The Book Name is: "+b.bName+" and Id is: "+b.bId);

    }
}
