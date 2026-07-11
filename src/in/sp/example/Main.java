package in.sp.example;

class Books{
    String name;
    int pages;
    String author;
    int currentPage;

    Books(String name,int pages,String author,int currentPage){
        this.name = name;
        this.author=author;
        this.pages=pages;
        this.currentPage=currentPage;
    }
}
public class Main {
    public static void main(String[] args) {
        Books b = new Books("DSA",1,"Venkatesh",5);
        System.out.println("BooK Name: "+b.name+", Author: "+b.author);
    }
}
