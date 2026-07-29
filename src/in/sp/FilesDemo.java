package in.sp;

import java.io.File;

public class FilesDemo {
    public static void main(String[] args) {
        File fl = new File("E:\\Internship\\FilesDemo");
        boolean exists = fl.exists();
        System.out.println(exists);
        if(exists==false){
            fl.mkdir();
            exists = fl.exists();
            System.out.println(exists);
        }
    }
}
