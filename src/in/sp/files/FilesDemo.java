package in.sp.files;

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
//        File fls = new File("E:\\Internship\\FilesDemo\\demo.txt");
//        boolean existsFileName = fls.exists();
//        System.out.println(existsFileName);
//        boolean deleteFile = fls.delete();
//        if (deleteFile == true){
//            System.out.println("File Deleted: "+ deleteFile);
        File fls = new File("E:\\Internship\\FilesDemo\\Language\\Java\\Demo.txt");
//        try {
//            boolean newFile = fls.createNewFile();
//            System.out.println(newFile+" is NewFile Created");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        File fl = new File("E:\\Internship\\FilesDemo\\Language\\Java\\test.txt");
////        boolean renameFile = fls.renameTo(fl);
////        System.out.println(renameFile + " RenameFile");
//        String name = fl.getName();
//        System.out.println(name);
        File f = new File("E:\\Internship");
//        String[] listOfFile = f.list();
//        for (String ls : listOfFile){
//            System.out.println(ls);
//        }
        File[] files = f.listFiles();
        for(File ns : files){
            if(f.isDirectory()) {
                System.out.println(ns);
            }
        }
    }
}