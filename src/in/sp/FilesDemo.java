package in.sp;

import java.io.File;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) {
//        File fl = new File("E:\\Internship\\FilesDemo\\Language\\Java");
//        boolean exists = fl.exists();
//        System.out.println(exists);
//        if(exists==false){
//            fl.mkdirs();
//            exists = fl.exists();
//            System.out.println(exists);
//        }
        File fls = new File("E:\\Internship\\FilesDemo\\demo.txt");
        boolean existsFileName = fls.exists();
        System.out.println(existsFileName);
        if (existsFileName == false){
            try {
                boolean newFileCreated = fls.createNewFile();
                System.out.println("New File Created: "+newFileCreated);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
