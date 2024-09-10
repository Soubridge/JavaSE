package org.digui;

import java.io.File;

public class FindFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\v_luoshenglu_dxm\\Desktop\\新建文件夹");
        MyPrint1(file);
    }
    public static void MyPrint1(File file){
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isDirectory()) {
                MyPrint1(f);
                continue;
            }
            String fileName = f.getName();
            if(fileName.contains(".java"))
                System.out.println(f.getAbsolutePath());
        }
    }
}
