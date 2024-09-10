package org.file;


import java.io.File;
import java.io.FileFilter;

/**
 * FileFilter 文件过滤器
 * FileFilter是个接口，可以作为file.listFile()的参数，原来这个参数写的是file，即将file里的所有文件全拿出到 File[]里
 * 但是通过file.listFile(FileFilter) 可以选择性的将file中的文件放到 File[]中
 * 具体的方法是用FileFilter接口的函数式方法 boolean accept(File pathname)来写具体的去留规则，其中的pathname就是file下的每一个文件或目录
 * 即，每个文件或目录都会经过过滤器
 * */
public class FileFilterTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\v_luoshenglu_dxm\\Desktop\\新建文件夹");


        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().contains(".java"))
                    return false;
                return true;
            }
        });

        for(File f : files){
            System.out.println(f.getAbsolutePath());
        }
    }
}
