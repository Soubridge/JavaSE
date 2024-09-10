package org.digui;

import java.io.File;

public class DfsPrintDir {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\v_luoshenglu_dxm\\Desktop\\新建文件夹");

        MyPrint(file);
    }
    public static void MyPrint(File file){
        File[] files = file.listFiles();

        for(File f : files){
            if(f.isFile()) System.out.println(f.getAbsolutePath());
            else {
                System.out.println(f.getAbsolutePath());
                MyPrint(f);
            }
        }
    }
}
